package org.cap.boot;

import org.cap.boot.SalesClass;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("Welcome! Sales Application!");
		SalesClass obj=new SalesClass();
		obj.show();
		display();

	}
	
	public static void display() {
		System.out.println("Hello! Good Morning!");
	}

}
