package com.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.login.model.Employee;

public class LoginDao {
	
	public Employee validate(String user, String pass) throws SQLException {
		
		ConnectionUtil conn = new ConnectionUtil();
		Employee emp = null;
		try {
			Connection connection = conn.getConnection();
			
			String sql = "select userName, age, address, password from employee where userName = ? and password = ?";
			
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			
			prepareStatement.setString(1, user);
			prepareStatement.setString(2, pass);
			
			ResultSet result = prepareStatement.executeQuery();
			
			while(result.next()) {
				String userNAme = result.getString("userName");
				String password = result.getString("password");
				String ageString = result.getString("age");
				int age = Integer.parseInt(ageString);
				String address = result.getString("address");
				
				emp = new Employee(userNAme, age, address, password);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return emp;
		
	}
	
}
