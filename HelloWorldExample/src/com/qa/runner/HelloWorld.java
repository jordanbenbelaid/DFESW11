package com.qa.runner;

//imports

public class HelloWorld {
	
	public static String printMessage() {
		return "Hello World";
	}
	
	public static void main(String[] args) {
		System.out.println(printMessage());
		printMessage();
	}
	
}
