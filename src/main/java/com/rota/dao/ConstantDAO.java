package com.rota.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.rota.entity.ConstantVO;
import com.rota.util.DatabaseUtility;
import com.rota.util.Query;

public class ConstantDAO {
	
	private Connection connection = null;
	private PreparedStatement statement = null;
	private ResultSet resultSet = null;
	Query query= null;
	ConstantVO constantVO = new ConstantVO();
	
	public ConstantDAO() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		query = (Query) context.getBean("SqlBean");
	}

	
	//under development
	public List<ConstantVO> fetchConstantList() {
		
		try {
			connection = DatabaseUtility.createConnection();
			statement = connection.prepareStatement(query.getFetchAllConstant());
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	
}
