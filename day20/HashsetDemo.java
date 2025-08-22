package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashsetDemo {

	public static void main(String[] args) {

		// declaration

		HashSet myset = new HashSet();
		// Set myset = new HashSet(); child to parent
		// HashSet <String> myset =new HashSet<String>();

		//adding elements in to hash set
		myset.add(100);
		myset.add(100);
		myset.add(null);
		myset.add(null);
		myset.add("java");
		myset.add('A');
		myset.add(true);
		
		System.out.println(myset);//[null, A, java, 100, true]
		//insertion order is not preserved
		//duplicate value not allowed
		//multiple null not allowed
		
		//Removing element
		myset.remove(100);
		System.out.println("after removing:" + myset);
		
		//Inserting element-not possible
		
		//Access specific element-not possible
		
		ArrayList al = new ArrayList(myset);
		System.out.println(al);
		System.out.println(al.get(1));
		
		//reading all elememy using for..each
		
		for(Object x:myset) {
			
			System.out.println(x);
		}
		
		
	}

}
