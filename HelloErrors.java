package com.comprog12;

import java.util.Date;
import java.util.Scanner;


public class HelloErrors {

	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("This is a test");
		Date now = new Date();
		now.getTime();
		int result = (int)(Math.random()*101);
		System.out.println("Your number is: " + result);

	}

}
