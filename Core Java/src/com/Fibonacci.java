package com;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		int i, f1, f2 = 0, f3 = 1, limit;

		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Numbers Do you Want to Print..?");
		limit = sc.nextInt();
		if (limit == 0 || limit == 1) {
			System.out.print(f2 + " " + f3);
		} else {
			System.out.print(f2 + " " + f3);

			for (i = 0; i < limit; i++) {
				f1 = f2;
				f2 = f3;
				f3 = f1 + f2;
				System.out.print(" " + f3);
			}
		}
	}

}
