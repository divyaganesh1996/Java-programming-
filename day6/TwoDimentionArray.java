package day6;

public class TwoDimentionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a[][]=new int[3][2];
//		a[0][0]=100;
//		a[0][1]=200;
//		
//		a[1][0]=300;
//		a[1][1]=400;
//		
//		a[2][0]=500;
//		a[2][1]=600;
//		
//		System.out.println(a[0][1]);
		
		int a[][]= {
				{100,200},
				{300,400},
				{500,600}
		};
		
//		for(int i=0;i<=a.length-1;i++) 
//		{
//			for(int c=0;c<=a[i].length-1;c++) 
//			{
//			System.out.print(a[i][c] + " ");
//			}
//			System.out.println(" ");
//		}
		
		for(int arr[]:a) {
			for(int x:arr) {
			System.out.print(x);
			}
			System.out.println(" ");
		}
		
	}

}
