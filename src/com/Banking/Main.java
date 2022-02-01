package com.Banking;

import java.sql.SQLException;
import java.util.Scanner;
import com.Banking2.*;
public class Main {
	public static void main(String[] args) throws SQLException {
		
		try (Scanner sc = new Scanner(System.in)) {
			int option;
			while(true) {

					System.out.println("Press 1 for creating account. ");
					System.out.println("Press 2 for deleting account. ");
					System.out.println("Press 3 for showing details of holder. ");
					System.out.println("Press 4 for showing bank balance.");
					System.out.println("Press 5 for updating account balance.");
					System.out.println("Press 6 for exit. ");
					
					option=sc.nextInt();
					if(option == 1) {
						CreateAccount ca = new CreateAccount();
						ca.create();
						System.out.println("Account Created\n");
					}
					else if(option == 2) {
						DeleteAccount da = new DeleteAccount();
						da.delete();
						System.out.println("Account Deleted\n");
					}
					else if(option == 3) {
						ShowDetails sd = new ShowDetails();
						sd.show();
					}
					else if(option == 4) {
						ShowBalance sb = new ShowBalance();
						sb.balance();
					}
					else if(option == 5) {
						UpdateBalance ub = new UpdateBalance();
						ub.update();
						System.out.println("Updated Sucsessfully.");
						
					}
					else {
						System.out.println("Thanks!!");
						break;
					}
				
			
			}
		}
		
	}
	
	

}
