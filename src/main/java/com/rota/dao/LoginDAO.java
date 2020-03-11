package com.rota.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rota.entity.UserVO;
import com.rota.util.DatabaseUtility;
import com.rota.util.Query;

public class LoginDAO {
	
	private static Logger logger = Logger.getLogger(LoginDAO.class.getName());
	private Connection connection = null;
	private PreparedStatement statement = null;
	private ResultSet resultSet = null;
	Query query= null;
	

	public LoginDAO() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		query = (Query) context.getBean("SqlBean");
	}

	//user login validation
	public UserVO validateUser(String username, String password){

		UserVO userVO = new UserVO();

		if(username!=null && username!= "" && password!=null && password!=""){
			try {

				//System.out.println(username);
				//System.out.println(password);
				connection = DatabaseUtility.createConnection();
				statement= connection.prepareStatement(query.getValidateUser());
				statement.setString(1, username);
				statement.setString(2, password);
				resultSet= statement.executeQuery();

				while(resultSet.next())
				{
					userVO.setUser(resultSet.getString("rt_user"));
					userVO.setName(resultSet.getString("name"));
					userVO.setRole(resultSet.getInt("rt_role"));
					userVO.setTeam(resultSet.getString("rt_team"));
					userVO.setEmail(resultSet.getString("email"));
					userVO.setRollon_date(resultSet.getDate("rollon_date"));
					userVO.setRollon_date(resultSet.getDate("rolloff_date"));
					userVO.setActive_flg(resultSet.getBoolean("active_flg"));
				}
				logger.info("User Details: "+userVO.toString());
				resultSet.close();

			}catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		}
		return userVO;
	}

	//Dashboard Display
	public void displayDashboard(String username){

		try {
			connection = DatabaseUtility.createConnection();
			//			statement= connection.prepareStatement(query.getDashboard());
			//			resultSet= statement.executeQuery();


		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
