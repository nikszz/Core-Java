package com;

import java.util.Scanner;

public class PrimeNum {

	static boolean isPrime(int n) {
		// Corner case
		if (n <= 1)
			return false;

		// Check from 2 to n-1
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;

		return true;
	}

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number for Checking Prime Number");
		num = sc.nextInt();

		if (isPrime(num))
			System.out.println("Prime Number");

		else
			System.out.println("Not a Prime Number");

	}

}
