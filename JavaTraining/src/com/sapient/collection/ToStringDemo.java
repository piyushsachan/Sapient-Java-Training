package com.sapient.collection;

import java.util.Set;
import java.util.TreeSet;

public class ToStringDemo {
	public static void main(String[] args)
	{
		User user1 = new User(1, " Kishan",3000);
		User user2 = new User(2, " Mayank",2000);
		Set<User> set = new TreeSet<>();
		set.add(user1);
		set.add(user2);
		System.out.println(set);
		System.out.println(set);
		
		}
}
 class User{
		int id;
		String name;
		private double salary;
		public User(int id,String name, double salary){
			this.id = id;
			this.name = name;
			this.setSalary(salary);
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", salary = " + salary + "]";
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		
}

 
