package com.Banking;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLConnection {
	public static Connection createCon() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/bankingSystem";
		String user="root";
		String password ="Ayush";
		con = DriverManager.getConnection(url,user,password);
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
