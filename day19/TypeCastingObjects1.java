package day19;

class Parent{
	String name = "Jhon";
	
	void m1() {
		System.out.println("this is m1 from parent");
	}
}

class Child extends  Parent{
	int id=101;
	
	void m2() {
		System.out.println("this is m2 from child");
	}
}


public class TypeCastingObjects1 {

	public static void main(String[] args) {
		
//		Child c = new Child();
//		System.out.println(c.name);//parent
//		c.m1();
//		System.out.println(c.id);//child
//				c.m2();
				
//			Parent p = new Child();//upcasting
//			System.out.println(p.name);//parent
//			p.m1();
//			
//			System.out.println(p.id);//child-- we cannot access
//			p.m2();//child-- we cannot access as reference variable is parent

		//Child c = (Child) new Parent();
		
		
		//downcasting not posiible
//		Parent p = new Parent();
//		Child c = (Child)p;
//		System.out.println(c.name);//parent
//		c.m1();
//		System.out.println(c.id);
//		c.m2();
		
	}

}
