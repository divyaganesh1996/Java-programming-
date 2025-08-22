package day10;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();//object
		emp1.eid=101;
		emp1.ename="Jhon";
		emp1.job="manager";
		emp1.sal=500000;
		//System.out.println(emp1.eid);
		emp1.display();
		
		Employee emp2 = new Employee();
		emp2.eid=102;
		emp2.ename="Sam";
		emp2.job="Lead";
		emp2.sal=40000;
		emp2.display();
	}

}
