package com.alvin2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Tester {
	public static void main(String[] args) {
		int n = Integer.parseInt("36");
		File file = new File("com.ibm");
		System.out.print(file.canExecute());
		System.out.print(file.exists());
	    if (file.exists()==true){
	    	System.out.print(file.getPath());
	    	System.out.print(file.length());
	    	File dir = new File("C:\\USER");
	    	if (dir.exists()&&dir.isDirectory()) {
	    		String [] content = dir.list();
	    		for (String s : content) {
	    			System.out.print(s);
	    		}
	    	
	    	for(int i=1;i<=20000000;i++) {
	    		System.out.println("0000000");
	    	}
	    	
	    }
		}
		
	}
}


