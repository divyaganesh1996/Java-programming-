package day6;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5};
		
		for (int i=0;i<a.length;i++) {
			System.out.println( (a[i]%2==0)? "even :" + a[i] : "odd :" + a[i]);;
		}
		
	}

}
