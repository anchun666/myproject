package com.alvin2;

public class Breakfast extends Thread {
	
	@Override
	
	public void run() {
		System.out.println("Make breakfast");
		try {
			Thread.sleep(3000);
			System.out.println("Breakfast done");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

	
		

	}


