package com.Banking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteAccount {
	public void delete() {
		Scanner sc = new Scanner(System.in);
		String id;
		System.out.println("Enter id to be deleted: ");
		id=sc.next();
		Connection con= SQLConnection.createCon();
		String q2="delete from account where A_ID=?";
 		PreparedStatement pstmt2 = null;
		try {
			pstmt2 = con.prepareStatement(q2);
			pstmt2.setString(1,id);
			pstmt2.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
 		
	}
}
