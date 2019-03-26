package alvin;
import java.util.Map;
import java.util.Scanner;

import alvin.oo.Drink;
public class Test0326 {

	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		String line = " ";
		Drink drink = new Drink();
		System.out.print("請輸入購買項目:");
		line = scanner.nextLine();
		drink.name = Map.get(line);
		System.out.print("請輸入購買數量");
		line = scanner.nextLine();
		drink.number = Integer.parseInt(line);
		
		
	}
	
}
