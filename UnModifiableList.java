package com.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnModifiableList {
	    public static void main(String[] args) {
	    	 ArrayList<Integer> list = new ArrayList<>();
	    	 list.add(10);      
	    	 list.add(20);
	    	 list.add(30);      
	    	 list.add(40);    	    
	    	 List<Integer> list2 = Collections.unmodifiableList(list);
	    	 list2.add(100);
	    	 System.out.println("Unmodifiable list: " + list2);   	    	        	
	    	 list.add(50);
	    	 System.out.println("Unmodifiable list after adding (50): "+list);
	       }
	}


