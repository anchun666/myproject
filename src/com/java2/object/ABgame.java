package com.java2.object;
import java.util.Scanner;
public class ABgame {

	public static void main(String[] args) {
		String secret = "5378";
		//String number = "4612";
		int a=0;
		int b=0;
		Scanner scanner=new Scanner(System.in);
		while(a!=4){
			a=0;
			b=0;
			System.out.print("Please enter a number:");
			String number =scanner.nextLine();
		int length = secret.length();
		for(int i=0;i<number.length();i++){
			char c = number.charAt(i);
			for(int j=0;j<length;j++){
				if(c==secret.charAt(j)){
					if(i==j){
					a++;
					}else{
						b++;
					}
					break;
				}
			}
			
			
		}
		System.out.println(a+"A"+b+"B");
		}
	}
}



