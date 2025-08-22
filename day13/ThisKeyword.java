package day13;

public class ThisKeyword 
{

	int x,y;//class variable
	
	/*
	 * ThisKeyword(int x,int y){//constructor
	 * 
	 * this.x=x; this.y=y; }
	 */
	
	void setData(int x,int y) 
	{
		this.x=x;
		this.y=y;
	}
	
	void display() {
		System.out.println(x);
		System.out.println(y);
	}
	
	
	public static void main(String[] a) 
	
	{
		//ThisKeyword th = new ThisKeyword(100,299);
		ThisKeyword th = new ThisKeyword();
		th.setData(100, 20);
		th.display();

	}

}
