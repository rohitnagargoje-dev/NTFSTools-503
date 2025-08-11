package com.nit.main;

public class App {
	
	public int additionOfTwoNumbers(int a, int b)
	{
		return a+b;
	}
	
	
    public static void main(String[] args) {
    	
    	App a1=new App();
    	int result=a1.additionOfTwoNumbers(10, 20);
    	
        System.out.println("addition of two Numbers is:: "+result);  
    }
}
