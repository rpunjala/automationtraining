package com.javatraining.polymorphism;

public class MethodOverridingChild extends MethodOverridingParent { //parent class
	
	void name() {
		 
	System.out.println("Venky");	 
			 
	}
	
public static void main(String[] args) {

	MethodOverridingChild mc = new MethodOverridingChild();	
	mc.name();	
	
	MethodOverridingParent mp = new MethodOverridingParent();	
	mp.name();
	
	MethodOverridingParent mop = new MethodOverridingChild();	
	mop.name();
	
	
	
}
 
}
 	 


