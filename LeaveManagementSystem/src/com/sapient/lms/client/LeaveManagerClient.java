package com.sapient.lms.client;

import java.util.Scanner;

import com.sapient.lms.exception.InsufficientLeaveBalance;
import com.sapient.lms.model.Employee;
import com.sapient.lms.service.LeaveManager;

public class LeaveManagerClient {
	public static void main(String[] args) throws InsufficientLeaveBalance {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter an employee id.");
		int operand1 = scanner.nextInt();
		Employee employee = new Employee(operand1);
		LeaveManager leaveManager = new LeaveManager();
		int option;
		int i = 0;
		do{
			System.out.println("1 >>> View leave balance");
			System.out.println("2 >>> Apply for leave");
			System.out.println("3 >>> Update Leaves");
			System.out.println("4 >>> Exit");
			System.out.println("Enter the number of option : ");
			option = scanner.nextInt();
			switch(option){
			case 1 : int leaveBalance = leaveManager.viewLeaveBalance(employee);
					 System.out.println("leave balance is : "+ leaveBalance);
					 break;
			case 2 : System.out.println("Enter number of leaves to apply for : ");
					 int numberOfLeaves1 = scanner.nextInt();
					 leaveManager.applyForLeave(employee,numberOfLeaves1);
					 break;
			case 3 : System.out.println("Enter number of leaves to apply for : ");
			 		 int numberOfLeaves2 = scanner.nextInt();
			 		 leaveManager.updateLeaveBalance(employee,numberOfLeaves2);
			 		 break;
			case 4 : i = 1;
					 break;
			default : System.out.println("Wrong option!");
					break;
			}
		}while(i==0);
	}

}
