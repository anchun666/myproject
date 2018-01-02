package com.alvin.sogo;

public class GoldenCustomer extends SliverCustomer {

	public GoldenCustomer(int amount) {
		super(amount);
		
		
	}
	@Override
	public void print(){
		int total = (int) (amount*(1-discount));
		System.out.println(amount+"\t"+total+"\t"+"BONUS:"+(amount-total));
	}

}
