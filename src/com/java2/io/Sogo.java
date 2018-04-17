package com.java2.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;
import java.util.Scanner;

import javax.print.attribute.standard.PrinterMoreInfo;

public class Sogo {
	
	
		Scanner scanner = new Scanner(System.in);
		public Sogo() {
		
		}
		
		
		
		public void start(){
			
		int function = 0 ;
		
		while(function != 3){
			function = scanner.nextInt();
			switch (function) {
			case 1:
				inputSales();
				break;
			case 3:
				return;
				
			}
			
		}
		
		
	}
	
	public void inputSales() {
		try{
			FileOutputStream fos = new FileOutputStream("sales.txt", true);
			PrintStream out = new PrintStream(fos);
			System.out.print("請輸入會員等級:");
			int type = scanner.nextInt();
			System.out.print("請輸入銷售金額:");
			int amount = scanner.nextInt();
			out.println(type+"\t"+amount);
			out.flush();
			out.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
			
			
				
			
		}
		
	}

}
