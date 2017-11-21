package alvin;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int d = -1;
		while (d != 0) {
			System.out.println("Please enter an number:");
			String line = scanner.nextLine();
			int i = Integer.parseInt(line);
			switch (i) {
			case 2:
				System.out.println("向下");
				break;
			case 4:
				System.out.println("向左");
				break;
			case 6:
				System.out.println("向右");
				break;
			case 8:
				System.out.println("向上");
				break;
			case 0:
				System.out.println("END");
				break;
			}
		}
	}
}
