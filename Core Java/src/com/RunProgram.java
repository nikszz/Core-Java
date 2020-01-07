package com;

public class RunProgram {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		 try{
			 runtime.exec("notepad.exe");
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	}

}
