package day10;

public class StudentMain {

	public static void main(String[] args) 
	{
		 //Student st = new Student();
		 //1) using object reference variable
//		 st.sid=1;
//		 st.sname="jhon";
//		 st.grad='A';
		 
		 
		 // using method
		// st.setStudentData(1, "David", 'A');
		 
		 //st.printStudentData();
		 
		 //using constructor`
		Student st = new Student(101,"Jhon",'A');
		 st.printStudentData();
	}

}
