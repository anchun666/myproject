package alvin.oo;

public class GraduateStudent extends Student {

	int thesis;
	public GraduateStudent(){
}
	@Override
	 public void print(){
		 System.out.println(english+"\t"+math+"\t"+chinese);
	 }
}
