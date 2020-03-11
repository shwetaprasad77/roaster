package com.rota.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import org.eclipse.jdt.core.BuildJarIndex;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rota.entity.ShiftOncallVO;
import com.rota.entity.TaskVO;
import com.rota.entity.UserShiftVO;
import com.rota.entity.UserVO;
import com.rota.util.DatabaseUtility;
import com.rota.util.Query;

public class UserDetailsDAO {
	
	private static Logger logger = Logger.getLogger(UserDetailsDAO.class.getName());
	private Connection connection = null;
	private PreparedStatement statement = null;
	private ResultSet resultSet = null;
	Query query= null;
	
	
	public UserDetailsDAO(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		query = (Query) context.getBean("SqlBean");
	}
	
	//fetch all Users belonging to the Team the current user logged in
	public List<String> getUsersByTeam(String team){
		
		List<String> userList = new ArrayList<String>();
		
		try {
			
			connection = DatabaseUtility.createConnection();
			statement = connection.prepareStatement(query.getGetUsersByTeam());
			statement.setString(1, team);
			resultSet = statement.executeQuery();
			
			while(resultSet.next()){
				String userName = new String();
				userName = resultSet.getString("rt_user");
				logger.info("getUsersByTeam: "+userName);
				userList.add(userName);
			}		
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userList;
		
	}
	
	//fetch shift details of individual users
	public List<Object> getShiftByUsers(List<String> user){
		
		List<Object> userShiftOncallList = new ArrayList<Object>();
		
		StringBuilder builder = new StringBuilder();
		for(int i=0; i< user.size(); i++){
			builder.append("?,");
		}
		
		try {
			System.out.println(user);
			connection = DatabaseUtility.createConnection();
			String sql= "select u.rt_user, soc.descr, us.assign_from_date, us.assign_to_date "+
						"from  roaster.rt_usershift us, roaster.rt_shiftoncall soc, roaster.rt_user u "+
						"where  u.rt_user in ("+ builder.deleteCharAt( builder.length() -1 ).toString() +") and u.rt_user= us.rt_user  and "+
						"us.rt_shiftoncall= soc.rt_shiftoncall and u.active_flg='T' and "+
						"soc.active_flg='T'";
			
			statement = connection.prepareStatement(sql);
			for(int i=0; i< user.size(); i++){
				statement.setString(i+1, user.get(i));
			}
			resultSet = statement.executeQuery();
				
			while(resultSet.next()){
				
				List<Object> tempList = new ArrayList<Object>();

				String userName= resultSet.getString("rt_user");
				String shiftDescr= resultSet.getString("descr");
				Date assignFrom= resultSet.getDate("assign_from_date");
				Date assignTo = resultSet.getDate("assign_to_date");
				tempList.add(userName);
				tempList.add(shiftDescr);
				tempList.add(assignFrom);
				tempList.add(assignTo);
				userShiftOncallList.add(tempList);
				
			}
			logger.info(userShiftOncallList.toString());
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userShiftOncallList;
		
	}
	
	//fetch shift details of individual users
		public List<Object> getTaskByUsers(List<String> user){
			
			List<Object> userTaskList = new ArrayList<Object>();
			
			StringBuilder builder = new StringBuilder();
			for(int i=0; i< user.size(); i++){
				builder.append("?,");
			}
			
			try {
				System.out.println(user);
				connection = DatabaseUtility.createConnection();
				String sql= "select u.rt_user, t.descr, ut.assignment_date, ut.notes "+
 						"from  roaster.rt_user u, roaster.rt_task t, roaster.rt_usertask ut "+
 						"where u.rt_user in ("+ builder.deleteCharAt( builder.length() -1 ).toString() + 
 						")  and u.rt_user= ut.rt_user  and "+
  						"ut.rt_task= t.rt_task";
				
				statement = connection.prepareStatement(sql);
				for(int i=0; i< user.size(); i++){
					statement.setString(i+1, user.get(i));
				}
				resultSet = statement.executeQuery();
					
				while(resultSet.next()){
					
					List<Object> tempList = new ArrayList<Object>();

					String userName= resultSet.getString("rt_user");
					String taskDescr= resultSet.getString("descr");
					Date assignFrom= resultSet.getDate("assignment_date");
					String notes = resultSet.getString("notes");
					tempList.add(userName);
					tempList.add(taskDescr);
					tempList.add(assignFrom);
					tempList.add(notes);
					userTaskList.add(tempList);
					
				}
				logger.info(userTaskList.toString());
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return userTaskList;
			
		}
	
	
}
