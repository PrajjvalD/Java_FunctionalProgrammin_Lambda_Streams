package com.java.practice;

import java.util.ArrayList;

public class Practice {

	 public static void main(String[] args) {
	        // Creating an ArrayList to store city names
		 ArrayList<String> cities = new ArrayList<>();
	        cities.add("New York");
	        cities.add("London");
	        cities.add("Tokyo");
	        cities.add("Paris");
	        cities.add("New York");
	        cities.add("London");
	        cities.add("Tokyo");
	        cities.add("New York");
	        cities.add("Tokyo");
	        cities.add("New York");

	        ArrayList<String> existArrList = new ArrayList<>();
	        for(int i = 0; i<cities.size(); i++) {
	        	String city = cities.get(i);
	        	
	        	if(existArrList.contains(city)) {
	        		continue;
	        	}
	        	
	        	int count = 0;
	        	for(int j =0; j< cities.size(); j++) {
	        		if(city.equals(cities.get(j))) {
	        			count++;
	        		}
	        	}
	        	if(count>2) {
	        		System.out.println(city+" : "+count);
	        	}
	        	
	        	existArrList.add(city);
	        	
	        	
	        	
	        }
	        
	    }
}
