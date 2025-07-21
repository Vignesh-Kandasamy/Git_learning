package com.java.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashmapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentHashMap<Integer, String> m
		= new ConcurrentHashMap<>();

		// Insert mappings using
		// put method
		m.put(100, "Hello");
		m.put(101, "Geeks");
		m.put(102, "Geeks");
		m.put(103, "Java");
		//m.put(104, "Python");

		// Here we cant add Hello because 101 key
		// is already present in ConcurrentHashMap object
		m.putIfAbsent(101, "Hello");

		// We can remove entry because 101 key
		// is associated with For value
		m.remove(101, "Geeks");

		// Now we can add Hello
		m.putIfAbsent(103, "Hello");

		// We cant replace Hello with For
		m.replace(103, "Hello", "For");
		System.out.println(m);
		
		Iterator itr  = m.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			m.put(105, "rrr");
		}
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "a");
		map.put(1, "de");
		System.out.println(map);
		
		
	}

}
