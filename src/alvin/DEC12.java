package alvin;

import java.util.Scanner;

public class DEC12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int d = -1;
		int hp = 100;
		int pos = 0;
		int row = 3;
		int col = 5;
		while (d != 0) {
			System.out.println("Please enter an number:");
			String line = scanner.nextLine();
			int i = Integer.parseInt(line);
			switch (i) {
			case 8:
				System.out.println("¦V¤W");
				if (pos / col < row - 1) {
					pos = pos + col;
					hp = hp-5;
					System.out.println(hp);
				}else{
					hp = hp-30;
					System.out.println(hp);
					break;

				}
			}

		}
	}
}
