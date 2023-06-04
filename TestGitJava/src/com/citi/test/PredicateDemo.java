package com.citi.test;

import java.util.function.Predicate;

public class PredicateDemo {

	public PredicateDemo() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		Predicate<String> predicate = t -> t == "Hello";
		System.out.println("It is::" + predicate.test("Hello"));
		
	}

}
