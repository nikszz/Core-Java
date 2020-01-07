package com;

public class StaticKeyword {
	
	int age;
	String name;
	static String college = "IGNOU";
	
	public StaticKeyword(int age, String name)
	{
		this.age = age;
		this.name = name;
	}
	
	void display()
	{
		System.out.println("Age is:"+" "+age+"\nName is:"+" "+name+"\nCollege is:"+" "+college);
	}
	
	public static void main(String args[])
	{
		StaticKeyword sk  = new StaticKeyword(15, "Ramu");
		StaticKeyword sk2  = new StaticKeyword(16, "Ram");
		sk.display();
		sk2.display();
	}
}
