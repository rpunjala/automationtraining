package com.javatraining;

public class Person {

	String name;
	int age;
	int aadharcardnumber;

	void talk() {
		System.out.println("Talking");	
	}

	void run() {
		System.out.println("Running");	
	}

	public static void main(String[] args) {

		Person p = new Person();	

		p.talk();
		p.run();

	}

}