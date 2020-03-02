package com.rota.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rota.entity.ResourceVO;
import com.rota.util.DatabaseUtility;
import com.rota.util.Query;

public class ResourceDAO {
	
	private Connection connection = null;
	private PreparedStatement statement = null;
	private ResultSet resultSet = null;
	Query query= null;
	
		
	public ResourceDAO() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		query = (Query) context.getBean("SqlBean");
	}



	//to fetch members
		public List<ResourceVO> fetchMember(String username) {

			List<ResourceVO> memberList= new ArrayList<ResourceVO>();
			

			try {
				connection = DatabaseUtility.createConnection();
				statement= connection.prepareStatement(query.getFetchTeamMembers());
				statement.setString(1, username);
				resultSet= statement.executeQuery();
				
				while(resultSet.next()){
					ResourceVO resource = new ResourceVO();

					//System.out.println(resultSet.getString("name"));
					resource.setResourceId(resultSet.getInt("resource_id"));
					resource.setEnterpriseId(resultSet.getString("enterprise_id"));
					resource.setPassword(resultSet.getString("password"));
					resource.setSapId(resultSet.getInt("sap_id"));
					resource.setName(resultSet.getString("name"));
					resource.setTeam(resultSet.getInt("team"));
					resource.setProject(resultSet.getInt("project"));
					resource.setSupervisorId(resultSet.getInt("supervisor_id"));
					resource.setSupervisorFlg(resultSet.getString("supervisor_flg"));
					resource.setActiveFlg(resultSet.getBoolean("active_flg"));
					resource.setCreatedBy(resultSet.getString("created_by"));
					resource.setCreatedOn(resultSet.getDate("created_on"));
					resource.setAmendedBy(resultSet.getString("amended_by"));
					resource.setAmendedOn(resultSet.getDate("amended_on"));

					memberList.add(resource);
				    //System.out.println(memberList.toString());
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return memberList;

		}

}
