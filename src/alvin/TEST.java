package alvin;
import java.util.Scanner;
public class TEST {

	public static void main(String[] args) {
		
		System.out.println("以下誰年紀最大?");
		System.out.println("1) 周杰倫 ");
		System.out.println("2) 華晨宇 ");
		System.out.println("3) 梁朝偉 ");
			
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int number = Integer.parseInt(line);
		if(number < 3){
			System.out.println();
		}else{
			if(number == 3){
				System.out.println();
		}
		
}
}
}