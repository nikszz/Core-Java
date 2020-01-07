package com;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		String str, revstr="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to Check Palindrome");
		str = sc.next();
		System.out.println("Entered String:" + str);
		for (int i = str.length() - 1; i >= 0; i--) {
			revstr = revstr + str.charAt(i);
		}
		System.out.println("Reversed String:" + revstr);
		if (revstr.equals(str) ) {
			System.out.println("String is Palindrome");
		} else
			System.out.println("String is NOT Palindrome");

	}

}
