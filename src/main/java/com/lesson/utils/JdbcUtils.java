package com.lesson.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {

	private static String URL = "jdbc:mysql://localhost:3306/jdbc";
	private static String USER = "root";
	private static String PASSWORD = "123456";
	private static Connection connection;
	
	private JdbcUtils(){}
	
	public static Connection getConnection(){
		
		if(connection == null)
		{
			try {
				connection = DriverManager.getConnection(URL,USER, PASSWORD);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}
	
	public static void closeConnection(){
		if(connection != null)
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
}
