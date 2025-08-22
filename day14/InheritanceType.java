package day14;


class A {//parent
	int a = 100;

	void display() {
		System.out.println(a);
	}
}


class B extends A //child
{
	int b = 200;

	void show() {
		System.out.println(b);
	}
}

public class InheritanceType {

	public static void main(String[] args) {
//		B objb = new B();
//		objb.display();
//		objb.show();
		
		A objb = new A();
		objb.display();

	}

}
