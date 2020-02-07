package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsert {
	public static void main(String[] args) {
		//step 1
		try (
				Connection connection = 
				DriverManager.getConnection("jdbc:mysql://localhost:3306/qe_users","root","psiaycuhsahn@123");
				//step 2
				Statement statement = connection.createStatement();
				//step 3
				//statement.execute("insert into users(name,dept,email) values ('Vijay','Payroll','vijay@gmail.com');");
				//execute Query
				
				){
			int updateCount = statement.executeUpdate("update users set name = 'vinay kumar' where id = 1");
			if(updateCount > 0)
			{
				System.out.println("Number of records updated : "+updateCount);
			}
			ResultSet resultSet = statement.executeQuery("Select * from users");
			while(resultSet.next()){
				int empId = resultSet.getInt("id");
				String empName = resultSet.getString("name");
				String empDept = resultSet.getString("dept");
				String empEmail = resultSet.getString("email");
				System.out.println("Employee with id : "+empId+" department : "+empDept+" name : "+empName+" and email : "+empEmail);
			}
//			//step 4
//			statement.close();
//			//step 5
//			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
