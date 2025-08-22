package day17;

public class DataConversionMethod {

	public static void main(String[] args) {

//String-->int
		//String s = "welcome";  //cannot convert to int
		
		//String s = "1234";
	//int sint=Integer.parseInt(s);
	//System.out.println(Integer.parseInt(s));
		
//		String x ="10";
//		String y ="20";
//		System.out.println(Integer.parseInt(x)+Integer.parseInt(y));
		
		//string to double
		
//		String s1 = "10.2";
//		String s2 = "11.3";
//		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
		
		
		//string to Boolean
//		String s1 = "true";
//		System.out.println(Boolean.parseBoolean(s1));
		
//		String s1 = "welcome";// other than true, if you pass any string it will return false
//		System.out.println(Boolean.parseBoolean(s1));
		
		//string to char not possible
//		String s1 = "name";
//		System.out.println(Character.par);
		
		
		//int,double,bool,char ----> String
		
		int a = 10;
		double d = 10.5;
		char c1 = 'A';
		boolean b = true;
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(c1));
		System.out.println(String.valueOf(b));
	}

}
