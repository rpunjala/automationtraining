package com.javatraining.abstraction;

public interface ATM {
	
  void withdraw(); //Withdraw
  
  void balance();
  
  void changePin();
  
  default void chequeBookRequest() {
	  
  System.out.println("Default Example");	
  
  }
  
  static void cashlessWithdrwal() {
  System.out.println("static example");	  
  }
  
   
  
}
