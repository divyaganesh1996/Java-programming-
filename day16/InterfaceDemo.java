package day16;


interface Shape
{
	int lenght = 10;//final static variable
	int width = 20;//final static
	
	 void circle();//Abstract method that is with no implementation
	
	default void square() //default method
	{
		System.out.println("this is square");
	}
	
	static void rectangle()//static method
	{
		System.out.println("this is rectanglr");
	}
	
}

public class InterfaceDemo implements Shape
{

	public  void circle() 
	{
		System.out.println("this is circle - abstract");
	}
		
	void trinagle() {
		System.out.println("this is triangle");
	}
	
	int x=100,y = 200;
	
	
		public static void main(String[] args) 
	{
		
		  //scenario 1 
		 InterfaceDemo idobj = new InterfaceDemo(); 
		 idobj.circle();
		 idobj.square();
		 idobj.trinagle();
		  Shape.rectangle();
		  System.out.println(idobj.x+idobj.y);
		//static method can directly access from interface
//since it is from different class we use class name.
	
			//scenario 2
			Shape sh = new InterfaceDemo();
			sh.circle();
			sh.square();
			//sh.trinagle();//we cannot access
			//sh.x + sh.y we cannot access
			Shape.rectangle();
			System.out.println(Shape.width * Shape.lenght);
	
	}





	

}
