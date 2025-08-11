package com.nit.main;

public class App {
	
	public int additionOfTwoNumbers(int a, int b)
	{
		return a+b;
	}
	
	public int subtractionOfTwoNumbers(int a, int b)
	{
		return a-b;
	}
	
	public int multiplicationOfTwoNumbers(int a, int b)
	{
		return a*b;
	}
	
	
    public static void main(String[] args) {
    	
    	App a1=new App();
    	int addition=a1.additionOfTwoNumbers(10, 20);
    	
        System.out.println("addition of two Numbers is:: "+addition);  
        
        int substraction= a1.subtractionOfTwoNumbers(20, 10);
        
        System.out.println("substraction of two Numbers is::"+substraction);
        
        int multiplication= a1.subtractionOfTwoNumbers(5, 10);
        
        System.out.println("multiplication of two Numbers is::"+multiplication);
        
    }
}
