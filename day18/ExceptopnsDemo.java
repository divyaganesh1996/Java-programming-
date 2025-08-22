package day18;

import java.util.Scanner;

public class ExceptopnsDemo {

	public static void main(String[] args) {
		
		System.out.println("program is started");
		
		Scanner sc = new Scanner(System.in);
		
		//example 1
//		System.out.println("Enter a number");
//		int num = sc.nextInt();
//				System.out.println(100/num);//ArithmeticException when divided by 0
//		
		
		//example 2
//		int a[]=new int[5];
//System.out.println("enter the position(0-4):");//ArrayIndexOutOfBoundsException when index is 5 or above
//int pos = sc.nextInt();
//
//System.out.println("enter the value:");
//int value = sc.nextInt();
//
//a[pos]=value;
//
//System.out.println(a[pos]);
		
		//example 3
		//String s = "welcome";//NumberFormatException
//		String s = "123";
//		int num = Integer.parseInt(s);
//		System.out.println(num);

		
		//example 4
		
		//String s = "welcome";
		String s = null; 
		System.out.println(s.length());//NullPointerException

		System.out.println("program is completed");
		System.out.println("program is exited");
	}

}
