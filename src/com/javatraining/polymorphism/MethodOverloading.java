package com.javatraining.polymorphism;

public class MethodOverloading {
	
	int total;

	int sum(int a, int b) {
		
	return total = a+b;
	
	}
	
	int sum(int a, int b, int c) {
		
	return total = a+b+c;
		
	}
	
	void login (String username, String password) {
	
	//enter username
	//enter password
	//click submit
			
	}
	
	void login (String username, String password, String DOB) {
		
	//enter username
	//enter password
	//enter DOB
	//click submit
				
	}
		
	
	
  public static void main(String[] args) {

	MethodOverloading ml = new MethodOverloading();
	  
	int addition = ml.sum(2, 4, 6);
	
	System.out.println(addition);
	  
}	
  
  
  

}
