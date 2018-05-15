package com.java2.threading;
import java.util.List;
public class Horse extends Thread {
	List<Horse> list;
	public Horse(List<Horse> list){
		this.list = list;
	
		
		
	}
	
	
	@Override
	public void run(){
		
		for(int i=0;i<=50000;i++){
			System.out.println(getName()+":"+i);
			try{
				sleep(50);
			}
			catch (InterruptedException e){
				e.printStackTrace();
			}
		}
		list.add(this);
	}

}
