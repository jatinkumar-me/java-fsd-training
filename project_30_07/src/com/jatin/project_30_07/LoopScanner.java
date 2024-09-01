package com.jatin.project_30_07;

import java.util.Scanner;

public class LoopScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of cities");
		int num = sc.nextInt();
		sc.nextLine();

		String[] cities = new String[num];

		for (int i = 0; i < num; i++) {
			cities[i] = sc.nextLine();
		}

		sc.close();

		System.out.println("Cities are: " + String.join(" ", cities));
	}
}