package day10;

public class Student {

	int sid;
	String sname;
	char grad;

 void printStudentData()
 {
	 System.out.println(sid+" "+sname+" "+grad+" ");
 
 }
 
 void setStudentData(int id,String name, char gr) 
 {
	 sid =id;
	 sname = name;
	 grad = gr;
 }
 
 //constructor will never return a value not even void
 Student(int id,String name, char gr){
	 sid =id;
	 sname = name;
	 grad = gr;
 }//just initialization
	 
 }
 


