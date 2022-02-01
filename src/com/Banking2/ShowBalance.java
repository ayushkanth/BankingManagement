package com.Banking2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.Banking.SQLConnection;

public class ShowBalance {
	public void balance() throws SQLException {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the id: ");
		int balanceid = sc.nextInt();
		System.out.println("Balance id is "+balanceid);
		String q ="SELECT A_balance FROM account WHERE A_ID = ?";
		Connection con = SQLConnection.createCon();
		PreparedStatement ps = con.prepareStatement(q);
		try {
			
			ps.setLong(1, balanceid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet set = ps.executeQuery();
		while(set.next()) {
			System.out.println("Balance in your account is: " + set.getString("A_balance"));
		}
//		sc.close();
	}
}
