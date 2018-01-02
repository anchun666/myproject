package alvin.oo;

public class Student {
 int english;
 int math;
 int chinese;
 static int pass = 60;
 String name;
 public Student(String name, int english,int math,int chinese){
	 this.name = name;
	 this.english = english;
	 this.math = math;
	 this.chinese = chinese;
	 
 
 
 }
 public Student(){
 }
 
 public Student(String n){
	 this.name = n;
	 
	
 }
 public static void method(){
	 System.out.println("hello");
 }
 
 
 public void print(){
	 System.out.println(english+"\t"+math+"\t"+chinese);
 }
 public int getAverage(){
	 return (english+math+chinese)/3;
	 
 }
}

