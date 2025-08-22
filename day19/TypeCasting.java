package day19;

public class TypeCasting {

	public static void main(String[] args) {

//upcasting - automatic
		
//		int intvalue = 100;
//		long longvalue= intvalue;
//		System.out.println(longvalue);
		
//		float floatvalue = 10.6f;
//		double doublevalue = floatvalue;

		//downcasting - manually
//		
//		long longvalue = 100;
//		int intvalue= (int) longvalue;
//		
//		double doublevalue = 12345.556;
//		float floatvalue= (float) doublevalue;
		
		//example1
		
//		int i=100;
//		long l=i;
//		System.out.println(l);//100
		
		//example2
		
		double d = 10.5;
		int i = (int) d;
		System.out.println(i);//10 it is not taking it as 10.5
		
	}

}
