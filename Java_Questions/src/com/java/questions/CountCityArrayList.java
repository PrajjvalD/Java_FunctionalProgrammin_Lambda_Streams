package com.java.questions;

import java.util.ArrayList;

public class CountCityArrayList {

	public static void main(String[] args) {
		  // Creating an ArrayList of cities
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

        // ArrayList to store the cities already checked
        ArrayList<String> checkedCities = new ArrayList<>();

        System.out.println("Cities that appear more than twice:");
        
        for (int i = 0; i < cities.size(); i++) {
        	String city = cities.get(i);
        	
        	if(checkedCities.contains(city)) {
        		continue;
        	}
        	int count = 0;
        	for(int j =0; j< cities.size();j++) {
        		if(city.equals(cities.get(j))) {
        			count++;
        		}
        	}
        	
        	if(count>2) {
        		System.out.println(city+" : " +count);
        	}
        	checkedCities.add(city);
        }

	}

}
