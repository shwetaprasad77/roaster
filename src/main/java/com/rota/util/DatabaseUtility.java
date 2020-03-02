package com.rota.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * A helper class that centralizes the management of data connections in the underlying database. <br/>
 */
public class DatabaseUtility {
	
	// New instance of Connection
	private static Connection connection = null;

	/**
	 * <br/>
	 * METHOD DESCRIPTION: <br/>
	 * 
	 * Open connection to access the underlying database. <br/>
	 * 
	 * @return Connection
	 *  
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * 
	 */

	public static Connection createConnection() throws ClassNotFoundException,
			SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection(
				"jdbc:mysql://localhost/roaster", "root", "root");
		return connection;
	}

	/**
	 * <br/>
	 * METHOD DESCRIPTION: <br/>
	 * 
	 * Close connection accessing the underlying database. <br/>
	 * 
	 * @return Connection
	 *  
	 * @throws SQLException
	 * 
	 */

	public static void closeConnection() throws SQLException {

		connection.close();
	}
}
