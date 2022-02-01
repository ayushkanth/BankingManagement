package com.Banking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CreateAccount {
	public void create() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.next();
		
		System.out.println("Enter your phone number: ");
		String phoneNumber = sc.next();
		
		System.out.println("Enter your city: ");
		String city = sc.next();
		
		System.out.println("Enter the account balance: ");
		String balance = sc.next();
		
		Connection con= SQLConnection.createCon();
		String q="insert into account(A_holderName,A_holderphone,A_city,A_balance) values(?,?,?,?)";
         PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(q);
			pstmt.setString(1,name);
	        pstmt.setString(2, phoneNumber);
	        pstmt.setString(3, city);
	        pstmt.setString(4,balance);
	        pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
