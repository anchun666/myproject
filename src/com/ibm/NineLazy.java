package com.ibm;

public class NineLazy {

	public static void main(String[] args) {
		for(int i=1; i<10; i++){
			if(i<4 | i>8){
			for(int j=2; j<10;j++){
				if((j*i)<10){
					System.out.print(j+"*"+i+"="+" "+(i*j)+"\t");
					
				}else{
					System.out.print(j+"*"+i+"="+(i*j)+"\t");
				}
				
			}
			
			System.out.println();
			}else{
				System.out.print("..."+"\t"+"..."+"\t"+"..."+"\t"+"..."+"\t"+"..."+"\t"+"..."+"\t"+"..."+"\t"+"..."
);			
				System.out.println();
		}

	}

}
}
