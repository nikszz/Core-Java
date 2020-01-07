package com;
import java.util.Scanner;

public class Stack {							/*A Basic Stack Implementation Through Array With All Insert/Remove/Display Functionality**/
	
	public static void main(String[] args) {
	
	int i, size = 0, top = 0, element=0;
	boolean loop = true;
	Scanner sc = new Scanner(System.in);

	System.out.println("<----------STACK IN JAVA BY NIKHIL BHARDWAJ------------>");
	System.out.println("Please Initilize Size of the Stack (Integer Only) :)");
	
	size = sc.nextInt();
	int stack[] = new int[size];	
	while(loop == true)
	{
	System.out.println("<------------------------------------->");
	System.out.println("What Action Do You Want To Perform...!");
	System.out.println("1.Push/Insert()");
	System.out.println("2.Pop/Delete()");
	System.out.println("3.Peek/Display()");
	System.out.println("4.GetSize()");
	System.out.println("5.Exit()");
	System.out.println("<------------------------------------->");
	i = sc.nextInt();
	
	if(i == 1)
	{
		System.out.println("<------------------------------------->");
		System.out.println("Please Enter Number Do You Want to Push()");
		if(top == size)
		{
			System.out.println("Sorry Stack is Overflow.. :< Please Remove Element First..!");
		}
		else
		{
		element = sc.nextInt();
		stack[top] = element;
		top++;
		System.out.println("Element "+element+" Pushed Sucessfully..!");
		}
	}
	else if(i == 2)
	{
		System.out.println("<------------------------------------->");
		if(top <= 0)
		{
			System.out.println("Sorry Stack is Underflow.. :< Please Insert Element First..!");
		}
		else
		{
		top--;
		element = stack[top];
		stack[top] = 0;
		System.out.println("Element "+element+" Poped Sucessfully..!");
		}
	}
	
	else if(i == 3) 
	{
		System.out.println("<------------------------------------->");
		System.out.println("STACK-TOP");
		for (i=size-1; i>=0; i--)
		{
			System.out.println("[_"+stack[i]+"_] ");
		}
		System.out.println("STACK-BOTTOM");
		System.out.println("<------------------------------------->");
	}
	
	else if(i == 4) 
	{
		System.out.println("<------------------------------------->");
		System.out.println("The Size of the Stack is Currently: "+top);
		System.out.println("<------------------------------------->");

	}
	
	else if(i == 5) 
	{
		System.out.println("<------------------------------------->");
		System.out.println("Thank  You For Using Please Gives Feedback.!");
		loop = false;
		System.out.println("<------------------------------------->");

	}
	
	else 
	{
		System.out.println("<------------------------------------->");
		System.out.println("Its Seems You Entered a Wrong Input..! :< Please Try Again");
		System.out.println("<------------------------------------->");
	}
	
	}//While Closing
	
	}// Main Closing

}// Class Closing
