package alvin;

import java.util.Scanner;

public class Agetester {

	public static void main(String[] args) {
		System.out.println("�п�J�z���~��:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int age = Integer.parseInt(line);
		if (age < 12) {
			System.out.println("�p��?");
		} else {
			if (age < 15) {
				System.out.println("����?");
			} else {
				if (age < 18) {
					System.out.println("����?");
				} else {
					System.out.print("......");

				}
			}
		}

	}

}
