package day18;

public class CheckedExceptions {

	public static void main(String[] args) {
		System.out.println("program is started");
		System.out.println("program is progress");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("program is finished");
		System.out.println("program is exited");

	}

}
