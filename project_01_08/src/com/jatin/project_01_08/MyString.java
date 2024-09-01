package com.jatin.project_01_08;

public class MyString {

	public static void main(String[] args) {

		String str = "JAVA FSD";
		String str1 = str.concat(" - Angular Batch");

		System.out.println(str + "\n" + str1);

		StringBuffer sb = new StringBuffer("Jatin Kumar");
		StringBuilder sb1 = new StringBuilder("Java FSD");

		sb.append(" foo bar");
		sb1.append(" foo \nbar");

		System.out.println(sb.length() + ", " + sb.toString() + ", " + sb.hashCode());
		System.out.println(sb1.length() + ", " + sb1.toString() + ", " + sb1.hashCode() + ", " + sb1.substring(0, 3));

	}

}
