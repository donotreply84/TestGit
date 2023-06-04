package com.citi.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachexample {

	public ForEachexample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cityList = new ArrayList<String>();
		cityList.add("Jersey City");
		cityList.add("New York");
		cityList.add("Boston");
		cityList.add("Pune");
		
		//CityConsumer cityConsumer = new CityConsumer();
		Consumer<String> cityName = (n) -> {System.out.println(n);};
		cityList.forEach(cityName); 
		
	System.out.println("Test Branch ");	
	}	
	

}
