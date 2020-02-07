package com.sapient.collection;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(45);
		list.add(22);
		list.add(40);
		list.add(2,33);//shifting occurs
		list.set(1 , 20);//replaces element
		System.out.println(list +" The Size is "+ list.size() + list.contains(42) + list.isEmpty());
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()){
			int value = it.next();
			System.out.println("The value is " + value);
			
		}
		ListIterator<Integer> lit = list.listIterator();
		while(lit.hasNext()){
			int value = lit.next();
			System.out.println("The value is " + value);
			
		}
	}

}
