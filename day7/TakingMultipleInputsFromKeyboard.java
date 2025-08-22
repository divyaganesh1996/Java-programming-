package day7;

import java.util.Arrays;
import java.util.Scanner;

public class TakingMultipleInputsFromKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
	
		int a[]=new int[5];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the first number:");
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		
		
	
	
	}

}
