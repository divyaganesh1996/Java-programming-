package day20;

import java.util.ArrayList;
import java.util.Iterator;

class Employee {
}

public class ArrayListDemo {

	public static void main(String[] args) {

		// Declaration
		ArrayList myList = new ArrayList();
		// List myList = new ArrayList();

		// ArrayList <Integer>myList = new ArrayList<Integer>();
		// ArrayList <Employee>myList = new ArrayList<Employee>();

		// Adding data into ArrayList
		myList.add(100);
		myList.add(10.5);
		myList.add("welcome");
		myList.add(100);
		myList.add('A');
		myList.add(true);
		myList.add(null);
		myList.add(null);

		// size of ArrayList

		System.out.println("size of arraylist : " + myList.size());// 8

		// printing the arraylist
//		System.out.println(myList);// [100, 10.5, welcome, 100, A, true, null, null]
//
//		// remove element from ArrayList
//		myList.remove(3);// 3 is index of element
//		System.out.println("after removing :" + myList);
//
//		// Insert new element with index
//		myList.add(3, "hello");
//		System.out.println("after inserting :" + myList);// [100, 10.5, welcome, hello, A, true, null, null]
//
//		// modify element in the ArrayList(modify,replace,change)
//		myList.set(2, "Java");
//		System.out.println("after replacing :" + myList);// [100, 10.5, Java, hello, A, true, null, null]
//
//		// access specific element from arraylist
//		myList.get(3);
//		System.out.println("after access :" + myList.get(3));// hello //here 3 is index

		// reading all the elements from arraylist

		// using normal for loop
		/*
		 * for (int i=0;i<myList.size();i++) {
		 * 
		 * System.out.println(myList.get(i)); }
		 */

		// for ..each loop
		/*
		 * for(Object x:myList) { System.out.println(x); }
		 */

		// using iterator does not follow index
		// Iterator it = myList.iterator();

		Iterator<Object> it = myList.iterator();

		// System.out.println(it.next()); //not possible
		while (it.hasNext()) // since we do not know how many element is present we use while loop
		{
			System.out.println(it.next());
		}

		// cheking arraylist is empty or not

		System.out.println("is arraylist empty :" + myList.isEmpty());

		// remove all elemets from arraylist
		ArrayList mylist2 = new ArrayList();
		mylist2.add(100);
		mylist2.add("welcome");
		
		
		myList.removeAll(mylist2);
		System.out.println("after removing multiple elements :" + myList);//[10.5, A, true, null, null]

		// remove all elemets/clear
		myList.clear();
		System.out.println(myList.isEmpty());//true
		
	}

}
