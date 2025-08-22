package day10;

public class Employee {

	//variables
	
	int eid;
	String ename;
	String job;
	int sal;
	
	//methods
	
	//in method u need to have return type whether it may be int, string
	void display(){  // no return type
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
	}
	
	//methods
//	public static void main(String[] args) {
//		//objects for class should vbe created in main 
//		Employee emp1 = new Employee();//object
//		emp1.eid=101;
//		emp1.ename="Jhon";
//		emp1.job="manager";
//		emp1.sal=500000;
//		System.out.println(emp1.eid);
//		//emp1.display();
//		
//		Employee emp2 = new Employee();
//		emp2.eid=102;
//		emp2.ename="Sam";
//		emp2.job="Lead";
//		emp2.sal=40000;
//		emp2.display();
//
//	}

}
