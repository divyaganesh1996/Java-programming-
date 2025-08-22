package day8;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String s="welcome";
////String s = new String("welcome");
//System.out.println(s);

		
//	String	s="ABC@GMAIL.COM";
//		String a[]=s.split("B");
//		System.out.println(a[0]);
//		System.out.println(a[1]);
		
//		String s= "Welcome";
//		String rev = "";
//		
//		for(int i= s.length()-1;i>=0;i--) 
//		{
//			rev =rev + s.charAt(i);
//		}
//System.out.println(rev);
		
		//StringBuffer s= new StringBuffer("Welcome");
		
		//System.out.println(s.reverse());

		String s = "welcome";
		String rev="";
		
		char a[]=s.toCharArray();
		
		for (int i=a.length-1;i>=0;i--) {
			rev+=a[i];
		}
		System.out.println(rev);
	}

}
