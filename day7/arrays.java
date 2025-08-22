package day7;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {10,20,30,40,50,50};
int search_element =50;
boolean status=false;

//for(int i=0;i<a.length;i++) {
//	if(search_element == a[i]) {
//		System.out.println("element found");
//		status=true;
//		break;
//	}
//	
//}
for(int x:a) {
	if(search_element == x) {
		System.out.println("element found");
		status=true;
		break;
	}
}
if(!status) {
System.out.println("element not found");}

	}

}
