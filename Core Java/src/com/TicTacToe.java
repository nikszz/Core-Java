package com;

public class TicTacToe {

	public static void main(String[] args) {
		// assigning a char type of array of 2dimensional 5x5
		char[][] gameboard = { { ' ', '|', ' ', '|', ' ' }, // 1st row
				{ '-', '+', '-', '+', '-' }, // 2nd row
				{ ' ', '|', ' ', '|', ' ' }, // 3rd row
				{ '-', '+', '-', '+', '-' }, // 4th row
				{ ' ', '|', ' ', '|', ' ' },// 5th row
		};
		
		//Enhanced For Loop :D
		for (char[] row : gameboard) {//fetching each array int row array
			for (char c : row) { // fetching element of char row array into c
				System.out.print(c);// printing each element
			}
			System.out.println();
		}
	}// Main func closing

}
