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
				System.out.println("�V�U");
				break;
			case 4:
				System.out.println("�V��");
				break;
			case 6:
				System.out.println("�V�k");
				break;
			case 8:
				System.out.println("�V�W");
				break;
			case 0:
				System.out.println("END");
				break;
			}
		}
	}
}
