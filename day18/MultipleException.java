package day18;

public class MultipleException {

	public static void main(String[] args) {

		System.out.println("program is started");

		//String s = "welcome";
		//String s = "123";
		String s = null;
		try {
			System.out.println(s.length());
		} 
//		catch (ArithmeticException e) {
//			System.out.println("handle exception");
//			System.out.println(e.getMessage());
//		} catch (NullPointerException e) {
//			System.out.println("handle exception");
//			System.out.println(e.getMessage());
//		} catch (NumberFormatException e) {
//			System.out.println("handle exception");
//			System.out.println(e.getMessage());
//		}
		
		catch(Exception e) {
			System.out.println("handle exception");
			System.out.println(e.getMessage());
		}
		
		System.out.println("program is completed");
		System.out.println("program is exited");
	}

}
