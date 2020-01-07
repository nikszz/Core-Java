package com;

class A {
	A() {
		System.out.println("Parent Class Object Called");
	}

	int a = 10;
}

public class SuperKeyword extends A {
	int a = 20;

	SuperKeyword() {
		System.out.println("Base Class Object Called");
	}

	void show(int a) {
		System.out.println(a); // local variable
		System.out.println(this.a);// Current class object/ Instance variables
		System.out.println(super.a); // Parent Class Instance Variables
	}

	public static void main(String[] args) {

		SuperKeyword ob = new SuperKeyword();
		// A ob = new A();
		ob.show(5);
		// System.out.println(ob.a);
	}

}
