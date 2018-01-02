package alvin.oo;

public class GraduateStudent extends Student {

	int thesis;
	public GraduateStudent(){
		super();
		
}
	@Override
	 public void print(){
		super.print();
		 System.out.println(english+"\t"+math+"\t"+chinese+thesis);
	 }
	
	@Override
	public int getAverage(){
		return (english+math+chinese+thesis)/4;
		
	}
}
