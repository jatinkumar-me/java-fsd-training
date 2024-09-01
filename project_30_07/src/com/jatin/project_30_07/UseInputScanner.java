package com.jatin.project_30_07;

import java.util.Scanner;

public class UseInputScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name");
		String userName = sc.nextLine();
		System.out.println("Username: " + userName);
		
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Age: " + age);

		System.out.println("Enter your salary");
		float salary = sc.nextFloat();
		System.out.println("Salary: " + salary);
		
		sc.close();
	}

}
