package com.jatin.project_30_07;

public class PatternNumber {
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(j + " ");
			}
			System.out.print('\n');
		}
	}
}
