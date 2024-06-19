package Map_Interface;				//TreeMap it maintain sorted orders

import java.util.Set;
import java.util.TreeMap;

public class TreeeMap {

	public static void main(String[] args) {
//Object creation with inserting values in the key and value format
		TreeMap<String,Integer> t=new TreeMap<String,Integer>();
		t.put("Mango", 120); 
		t.put("Banana",50);
		t.put("Apple", 220);
		t.put("Orange",70);
		
		System.out.println(t+"");  //Prints alphabetic wise so maintain sorted order
		// TODO Auto-generated method stub
		
		
		//Set the key 
		Set<String>s=t.keySet();
		
		for(String key:s) {
			System.out.println("cost of 1 KG " +key+" is "+t.get(key));
		}

	}

}
