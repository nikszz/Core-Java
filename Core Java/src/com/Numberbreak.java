package com;

public class Numberbreak {

	public static void main(String[] args) {
		int no = 148579;
		int digit, sum=0;
		int i = 0;
		while (i < 6) {
			digit = no % 10; // for last number or Right Side
			sum = sum + digit;
			System.out.println("Number found"+digit);
			no = no / 10; // for left side numbers
			i++;
		}
		System.out.println("Sum of All Digit is "+sum);

	}

}
