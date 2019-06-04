package com.alvin2;

public  class Brush implements Runnable{

	@Override
	public void run() {
		System.out.println("Brushing teeth");
		try {
			Thread.sleep(5000);
			System.out.println("Brushed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}
	

}
