package alvin;

public class Score {

	public static void main(String[] args) {
		int score = 54;
		System.out.println(score/10);
		int level = score/10;
		switch(level){
		case 0 :
		case 1 :
		case 2 :
		case 3 :
		case 4 :
		case 5 :
			System.out.println("failed");
			break;
		case 6 :
			System.out.println("passed");
			break;
		case 7 :
			System.out.println("good");
			break;
		case 8 :
			System.out.println("great");
			break;
		case 9 :
		case 10 :
			System.out.println("excellent");
			break;
		}
		
	}

}
