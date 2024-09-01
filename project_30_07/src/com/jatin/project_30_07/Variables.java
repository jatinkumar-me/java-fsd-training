package com.jatin.project_30_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Variables {

	public static void main(String[] args) {
		// Using buffered reader
		InputStreamReader systemInReader = new InputStreamReader(System.in);
		BufferedReader myBufReader = new BufferedReader(systemInReader);
		
		int myVal = 0;
		try {
			myVal = Integer.parseInt(myBufReader.readLine());
		} catch (NumberFormatException | IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Number entered: " + myVal + 23);
	}
}
