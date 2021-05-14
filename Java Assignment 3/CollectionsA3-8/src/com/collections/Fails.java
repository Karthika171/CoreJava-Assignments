package com.collections;

import java.util.HashSet;
import java.util.Iterator;

public class Fails {
	public static void main(String[] args) {
		    HashSet<Object> n=new HashSet();
		
		n.add("Peach");
		n.add("Goma");
		n.add(25);
		n.add(45);

		Iterator i=n.iterator();
		 while(i.hasNext())
		   {
			   
			   Object a=i.next();
			   n.add("Tom");
			   System.out.println(a); 
		   }
	}

}
