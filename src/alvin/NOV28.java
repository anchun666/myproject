package alvin;

public class NOV28 {

	public static void main(String[] args) {
		int n1;
		int n2;
		int n3;

		int n[] = { 4, 5, 6, 7, 8, 9 };

		for (int i : n) {
			System.out.println(i);

		}

		int day = 60;
		int months[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 0; i < months.length; i++) {
			if (day <= months[i]) {
				System.out.println((i + 1) + "/" + day);
				break;
			} else {
				day = day - months[i];
			}

		}
		int number[] = { 51, 23, 6, 65, 15, 78, 45 };

		int i, j;

		for (i = 0; i < number.length-1; i++) {
			for (j = 0; j < number.length-1; j++) {
				if (number[j + 1] < number[j]) {
					int tmp = number[j];
					number[j] = number[j + 1];
					number[j + 1] = tmp;
				}
			}
		}
		for (i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");

		}
	}
}
