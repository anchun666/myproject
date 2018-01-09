package com.alvin.sogo;
import java.awt.List;
import java.awt.peer.ListPeer;
import java.util.ArrayList;

import org.omg.CORBA.SystemException;
public class Tester {

	public static void main(String[] args) { 
		ArrayList<Customer> customers = new ArrayList<>();
		
		Customer c1 = new Customer(10000);
		SliverCustomer c2 = new SliverCustomer(10000);
		GoldenCustomer c3 = new GoldenCustomer(10000);
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		for(int i=0 ; i<customers.size();i++){
			Customer c = customers.get(i);
			c.print();
		}
		//Customer c1 = new Customer(1000);
		//c1.print();
		//SliverCustomer c2 = new SliverCustomer(1000);
		//c2.print();
		//GoldenCustomer c3 = new GoldenCustomer(1000);
		//c3.print();
		
		
		
		
		
		
		
		ArrayList<Integer>list = new ArrayList<>();
		list.add(94);
		list.add(87);
		list.add(55);
		list.add(4);
		int n = (int)list.get(2);
		int n2 = (int)list.get(3);
		System.out.println(list.get(1));
		System.out.println(list.size());
		for(int i = 0 ; i < list.size() ; i++){
		System.out.println(list.get(i));
		}
		
		
		
		

	}

}
