package alvin;
import java.util.Scanner;
public class AAA {

	public static void main(String[] args) {
		System.out.println("請使用者輸入一個數字:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		int i = 1;
		while(n<=10){
			System.out.println(i);
               break;
               
		}
		
	
	}
}

