package alvin.oo;
import java.util.ArrayList; 
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {

	public static void main(String[] args) {
		// List<Integer> numbers = ArrayList(5,3,15,8,7);

		List<Item> items = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String name = " ";
		while (!name.equals("q")) {
			System.out.print(" Please enter item name: ");
			name = scanner.nextLine();
			System.out.print(" please enter quantity: ");
			int qty = Integer.parseInt(scanner.nextLine());
			items.add(new Item(name , qty));
			
			
		}
	}

}
