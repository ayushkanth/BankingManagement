package com.Banking2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


import com.Banking.SQLConnection;

public class ShowDetails {
	public void show() throws SQLException{
		System.out.println("Enter the id: ");
		Scanner sc = new Scanner(System.in);
		String showid = sc.next();
		Connection con = SQLConnection.createCon();
		String q = "SELECT * FROM account WHERE A_ID = ?";
		PreparedStatement ps = con.prepareStatement(q);
		ps.setString(1, showid);
		
		ResultSet set=ps.executeQuery();
		while(set.next()) {
			System.out.println("--------------------------");
			System.out.println("Account's Id: "+ set.getString("A_ID"));
			System.out.println("Account holder name: "+ set.getString("A_holderName"));
			System.out.println("Account holder phone: "+ set.getString("A_holderPhone"));
			System.out.println("Account holder city: "+ set.getString("A_city"));
			System.out.println("--------------------------\n");
		}
//		sc.close();
	}
	
}
