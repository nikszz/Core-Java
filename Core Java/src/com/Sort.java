package com;

public class Sort {

	public static void main(String[] args) {
		int[] arr = { 5, 6, 3, 1, 45, 7, 77, 4, 2 };
		int len = arr.length, temp;
		System.out.println("Length of array is " + len);
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(" " + arr[i]);
		}
	}

}
