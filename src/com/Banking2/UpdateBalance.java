package com.Banking2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.Banking.SQLConnection;

public class UpdateBalance {
	public void update() throws SQLException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id in which you want to update:");
		int updateid = sc.nextInt();
		System.out.println("Enter the new updated balance: ");
		String balance = sc.next();
		String q = "UPDATE account SET A_balance= ? WHERE A_ID = ?";
		Connection con = SQLConnection.createCon();
		PreparedStatement ps = con.prepareStatement(q);
		ps.setString(1, balance);
		ps.setLong(2, updateid);
		ps.execute();
//		sc.close();
	}
}
