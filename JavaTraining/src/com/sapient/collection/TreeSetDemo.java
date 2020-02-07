package com.sapient.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args){
		Set<User> users = new TreeSet<>(new UserIdDescComparator());
		User user1 = new User(12,"Harish",1000);
		User user2 = new User(13,"Haris",500);
		User user3 = new User(14,"Hari",8000);
		User user4 = new User(15,"Har",300);
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		
		Iterator<User> it = users.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
	}

}
