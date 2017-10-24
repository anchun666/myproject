package alvin;
import java.util.Scanner;
public class abc {

	public static void main(String[] args) {
		System.out.println("請輸入您的名字:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		System.out.println("Hello,"+line);
		
		System.out.println("你幾歲咩?");
		line = scanner.nextLine();
		int age = Integer.parseInt(line);
		System.out.println(line);
		System.out.println(age);
		System.out.println(age > 20);
				
			
	}

}
