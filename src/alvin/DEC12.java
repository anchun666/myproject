package alvin;

import java.util.Scanner;

public class DEC12 {

	public static void main(String[] args) {
		int hp = 100;
		int pos = 0;
		int row = 3;
		int col = 5;
		Scanner scanner = new Scanner(System.in);
		int d = -1;
		while (d != 0) {
			System.out.println("�ثe��m:"+pos+"Hp"+hp);
			System.out.print("�п�J��V:");
			String line = scanner.nextLine();
			int i = Integer.parseInt(line);
			switch (i) {
			case 2:
				System.out.println("�V�U");
				if (pos / col < row - 1) {
					pos = pos + col;
					hp = hp-5;
					System.out.println(hp);
				}else{
					hp = hp-30;
				}
					break;
			case 4 :
				System.out.println("�V��");
				if (pos % col != 0){
					pos = pos - col;
					hp = hp-5;
				}else{
					hp = hp-30;
				}
				break;
				
						
				
				}
			}

		}
	}
