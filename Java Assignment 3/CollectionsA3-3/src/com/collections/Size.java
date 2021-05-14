package com.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Size {
	public static void main(String args[])
	{
		ArrayList <String> fl= new ArrayList<String>();
		fl.add("Apple");
		fl.add("Fig");
		fl.add("JackFruit");
		fl.add("Orange");
		ListIterator<String> li=fl.listIterator(fl.size());
		System.out.println("Backward direction::::");
		while(li.hasPrevious())
		{
			
			String str=li.previous();
			System.out.println(str);
		}
	}

}
