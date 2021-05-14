package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hash {
	public static void main(String[] args) {
		
		HashSet<String> h=new HashSet<String>();
		h.add("Pink");
		h.add("Black");
		h.add("White");
		h.add("Green");
		
		System.out.println("hash set output which is unorderd "+h);
		
		LinkedHashSet<String> l=new LinkedHashSet<String>();
		l.add("Yellow");
		l.add("Orange");
		l.add("Blue");
		l.add("Purple");
		
		System.out.println("hash set output which is orderd "+l);
		
		
		
	}


	}



