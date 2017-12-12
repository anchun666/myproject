package alvin.oo;

public class Tester {

	public static void main(String[] args) {
		//Student stu = new Student("¤ı¤K³J",55,66,77);
		Student stu = new Student("¤ı¤K³J");
		stu.english = 55;
		stu.math = 66;
		stu.chinese = 77;
        stu.print();
       int avg = stu.getAverage();
       System.out.println(stu.name+":" + avg);
	}

}
