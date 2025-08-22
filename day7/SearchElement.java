package day7;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {10,20,30,20,30,40};
int num=20;
int count=0;
for(int x:a) {
	if(num==x) {
		count++;
	}
	
}
System.out.println(count);
//System.out.println(x +"count is:" + count);
	}

}
