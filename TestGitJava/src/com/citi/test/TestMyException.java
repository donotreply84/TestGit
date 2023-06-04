package com.citi.test;

public class TestMyException{
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		int y = 1000;
		try {
			float z = (float)x/(float)y;
			if(z<0.01) {
				throw new MyException("The number is too small");
			}
		}
		catch (MyException e) {
			// TODO: handle exception
			System.out.println("The Exception is caught");
			System.out.println("Message:" + e.getMessage());
		}
		finally {
			System.out.println("In Finally");
		}

	}

}
