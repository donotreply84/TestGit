package com.citi.test;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamFilterDemo {

	public JavaStreamFilterDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(4);
		numberList.add(5);
		numberList.add(6);
		numberList.add(7);
		numberList.add(8);
		
		numberList.stream().filter(t -> t%2!=0).forEach(obj -> System.out.println(obj));
		
		
		// TODO Auto-generated method stub

	}

}
