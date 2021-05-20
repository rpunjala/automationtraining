package com.javatraining.abstraction;

public class ATMExample implements ATM{

	@Override
	public void withdraw() {

	System.out.println("withdraw");	

	}

	@Override
	public void balance() {

	System.out.println("balance");	
	
	}

	@Override
	public void changePin() {

	System.out.println("changePin");
	
	}
	
	
	  public void chequeBookRequest() {
	  
	  System.out.println("Change Default Example implementation");
	  
	  }
	 
	
   public static void main(String[] args) {
	   
   ATMExample Ae = new ATMExample(); 
   
   Ae.balance();
   Ae.changePin();
   Ae.chequeBookRequest();
   Ae.withdraw();
   
   ATM.cashlessWithdrwal();
	
   }


}
