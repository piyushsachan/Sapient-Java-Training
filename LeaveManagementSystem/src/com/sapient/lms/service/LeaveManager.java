package com.sapient.lms.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sapient.lms.exception.InsufficientLeaveBalance;
import com.sapient.lms.model.Employee;

public class LeaveManager {

	public LeaveManager() {
		this.getConnection();
	}

	public Connection getConnection() {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qe_users", "root",
					"psiaycuhsahn@123");
			Statement statement = connection.createStatement();
			return connection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public void applyForLeave(Employee employee, int numberOfLeaves) throws InsufficientLeaveBalance {
		int leaveBalance = 0;
		try {
			Connection connection = getConnection();
			ResultSet resultSet = connection.createStatement()
					.executeQuery("Select * from leave_details where id = " + employee.getId());
			while(resultSet.next()){				
				leaveBalance = resultSet.getInt("leave_balance");
			}

			if (leaveBalance < numberOfLeaves) {
				throw new InsufficientLeaveBalance("Insufficient Leave Balance");
			} else {
				leaveBalance = leaveBalance - numberOfLeaves;
				int temp = connection.createStatement().executeUpdate("update leave_details set leave_balance = " + leaveBalance + " where id = " + employee.getId());
			}
			System.out.println("Leave application Porcessed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int viewLeaveBalance(Employee employee) {
		int leaveBalance = -1;
		try {
			Connection connection = getConnection();
			ResultSet resultSet = connection.createStatement()
					.executeQuery("Select leave_balance from leave_details where id = " + employee.getId());
			while(resultSet.next()){				
				leaveBalance = resultSet.getInt("leave_balance");
			}
			System.out.println(leaveBalance);
			return leaveBalance;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return leaveBalance;
		}
	}

	public void updateLeaveBalance(Employee employee, int numberOfLeaves) {
		try {

			Connection connection = getConnection();
			int resultSet = connection.createStatement().executeUpdate(
					"update leave_details set leave_balance = " + numberOfLeaves + " where id = " + employee.getId());
			System.out.println("Number of leaves updated.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
