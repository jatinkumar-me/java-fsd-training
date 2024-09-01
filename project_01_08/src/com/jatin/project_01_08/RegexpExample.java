package com.jatin.project_01_08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * RegexpExample
 */
public class RegexpExample {

	public static void main(String[] args) {
		Pattern pat = Pattern.compile(".*xx.*");
		Matcher matcher = pat.matcher("MyxxZ");

		System.out.println("Pattern match: " + matcher.matches());
		//
		// Define the regex pattern
		String regex = "\\d+"; // Matches one or more digits

		// Compile the regex into a Pattern object
		Pattern pattern = Pattern.compile(regex);

		String input = "The year is 2024 and the temperature is 30 degrees.";
		Matcher matcher2 = pattern.matcher(input);

		System.out.println("For input: \n" + input);
		System.out.println("Numbers found:");
		while (matcher2.find()) {
			System.out.println(matcher2.group());
		}

		String replaced = matcher2.replaceAll("#");
		System.out.println("Replaced text: " + replaced);
	}
}
