package alvin;

public class Prime {

	public static void main(String[] args) {
		boolean prime = true;
		int n = 26;
		for (int i = 2; i < n; i++) {
			if(n % i == 0) {
				prime = false;
				break;

			}

		}
		if (prime) {
			System.out.println(n + " IS PRIME NUMBER ");
		} else {
			System.out.println(n + " NOT PRIME ");
		}
	}

}
