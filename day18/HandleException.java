package day18;

import java.util.Scanner;

public class HandleException {

	public static void main(String[] args) {
		System.out.println("program is started");

		Scanner sc = new Scanner(System.in);

		// example 1
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		try {
		System.out.println(100 / num);// ArithmeticException when divided by 0
		}
		catch(ArithmeticException e) {
			System.out.println("invalid data");
		}
		
		System.out.println("program is completed");
		System.out.println("program is exited");

	}

}
