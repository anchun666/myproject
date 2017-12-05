package alvin;

public class Scorearray {

	public static void main(String[] args) {
		int score[][] = new int [3][2];
		score[0][0]=50;
		score[0][1]=55;
		score[1][0]=40;
		score[1][1]=60;
		score[2][0]=75;
		score[2][1]=60;
		
		for(int i=0;i<3;i++){
			System.out.print(score[i][0]+" "+score[i][1]+" ");
			int average = (score[i][0]+score[i][1])/2;
			if(average < 60){
				System.out.println(average+"*");
				
			}else{
				System.out.println(average);
			}
			
		}
				
		
		

	}

}
