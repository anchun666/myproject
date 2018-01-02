package alvin.oo;

public class Tester {

	public static void main(String[] args) {
		//Student stu = new Student("¤ý¤K³J",55,66,77);
		Student stu1 = new Student("¤ý¤K³J",87,21,50);
		Student stu2 = new Student("¶À¤j°¶",44,67,96);
		stu1.pass = 55;
		stu1.print();
		stu2.print();
       int avg = stu1.getAverage();
       System.out.println(stu1.name+":" + avg);
       Student.method();
       GraduateStudent gstu = new GraduateStudent();
    		   gstu.print();
	}

}
