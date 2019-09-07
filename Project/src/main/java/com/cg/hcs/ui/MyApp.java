package com.cg.hcs.ui;

import java.util.Scanner;

import com.cg.hcs.dto.DiagnosticCenter;
import com.cg.hcs.dto.User;
import com.cg.hcs.service.DiagnosticCenterService;
import com.cg.hcs.service.DiagnosticCenterServiceImpl;

public class MyApp {

	public static void main(String[] args) {
		DiagnosticCenterService centerservice=new DiagnosticCenterServiceImpl();
		int userRole=0,adminChoice=0,userChoice=0;
		while(userRole!=3)
		{
		 System.out.println("Enter your role: \n 1. Admin 2. User");
		 Scanner sc = new Scanner(System.in);
		 userRole = sc.nextInt();
		 switch(userRole)
		 {
		  case 1:
			  while(adminChoice!=8)
			  {
				  System.out.println("What function do you want to perform? \n. 1.Add new Center 2.Update an existing "
				  		+ "center 3.Remove an existing center \n 4.Add new Test in an existing center "
				  		+ "5.Update an existing Test 6.Remove a Test\n 7. Approve new appointments");
				  adminChoice = sc.nextInt();
				  switch(adminChoice)
				  {
				  	case 1:
				  		System.out.println("Enter the name of the center:");
				  		String centerName = sc.next();
				  		DiagnosticCenter center=new DiagnosticCenter(centerName);
				  		centerservice.addDiagnosticCenter(center);
				  		break;
				  	case 2:
				  		break;
				  	case 3:
				  		break;
				  	case 4:
				  		
				  		break;
				  	case 5:
				  		break;
				  	case 6: 
				  		break;
				  	case 7: 
				  		break;
				  	default:
				  		System.out.println("Enter a proper function");
			
				  }
			  }
	  		break;
	  	 case 2: 
			break;
		 default:
			System.out.println("Enter a proper choice!");
		    break;	
		 }
		}

	}
}