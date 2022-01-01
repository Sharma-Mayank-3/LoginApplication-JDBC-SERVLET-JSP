package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	private final String ClassUrl = "com.mysql.jdbc.Driver";
	private final String DriverUrl = "jdbc:mysql://localhost/december8";
	private final String JdbcUserName = "root";
	private final String JdbcPassword = "root";
	private Connection connection = null;
	
	
	public Connection getConnection() throws ClassNotFoundException {
		Class.forName(ClassUrl);
		
		try {
			if(connection == null) {
				connection = DriverManager.getConnection(DriverUrl, JdbcUserName, JdbcPassword);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
}
