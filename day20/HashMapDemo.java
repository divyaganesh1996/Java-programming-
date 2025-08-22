package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {

      //declaration
		//HashMap map = new HashMap();
		//Map h = new HashMap();
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
	
	//adding pairs
		
		hm.put(101,"jhon");
		hm.put(102,"scott");
		hm.put(103,"mary");
		hm.put(104,"scott");
		hm.put(105,"david");
		hm.put(102,"david");
		
		System.out.println(hm);//{101=jhon, 102=david, 103=mary, 104=scott, 105=david}
		System.out.println(hm.size());
		
		//remove pair
		
		hm.remove(101);//101 is key of the pair
		System.out.println(hm);//{102=david, 103=mary, 104=scott, 105=david}
	
		//access value of the key
		System.out.println(hm.get(102));//david
		
	System.out.println(hm.keySet());//[102, 103, 104, 105]
	System.out.println(hm.values());//[david, mary, scott, david]
		
		System.out.println(hm.entrySet());
		
		//reading data from hashmap
		
		for(int k:hm.keySet()) 
		{
			System.out.println(k+"  "+hm.get(k));
		}
		
		//using iterator
		
		Iterator<Entry<Integer,String>> it = hm.entrySet().iterator()
;
		while(it.hasNext())
		{
			Entry<Integer,String> entry = it.next();
			//System.out.println(it.next());
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
	}
	

}
