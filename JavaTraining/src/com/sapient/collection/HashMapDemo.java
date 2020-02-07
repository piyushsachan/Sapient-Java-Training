package com.sapient.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<Integer, User> map = new HashMap<>();
		User user1 = new User(12,"Harish",1000);
		User user2 = new User(13,"Haris",500);
		User user3 = new User(14,"Hari",8000);
		User user4 = new User(15,"Har",300);
		map.put(12, user1);
		map.put(14, user2);
		map.put(16, user3);
		map.put(18, user4);
		map.put(20, user1);
		map.put(22, user3);
		
		Set<Integer> keySet = map.keySet();
		System.out.println(map.get(12));
		Iterator<Integer> it = keySet.iterator();
		while(it.hasNext()){
			System.out.println(map.get(it.next()));
			
		}
		Collection<User> values = map.values();
		Iterator<User> userIt = values.iterator();
		while(userIt.hasNext()){
			System.out.println(userIt.next());
			
		}
		System.out.println("\nGetting both keys and value :");
		Set<Map.Entry<Integer, User>> entrySet = map.entrySet();
		Iterator<Map.Entry<Integer, User>> iterator = entrySet.iterator();
		while(iterator.hasNext()){
			Map.Entry<Integer, User> entry = iterator.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}
	}

}
