package com;

class ABC {
	ABC() {
		System.out.println("Constructor ABC Called");
	}

	void fun() {
		System.out.println("ABC Class Function ");
	}
}

public class Test extends ABC {
	Test() {
		System.out.println("Constructor Test Called");
	}

	void fun() {
		System.out.println("Test Class Function");
	}

	public static void main(String args[]) {
		Test obj = new Test();
		obj.fun();
	}

}