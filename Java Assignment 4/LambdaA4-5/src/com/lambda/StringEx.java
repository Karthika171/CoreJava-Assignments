package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringEx {

	public static void main(java.lang.String[] args) {
		StringBuilder str = new StringBuilder();
		List<String> l1= new ArrayList<>(Arrays.asList("Hi","Hello","welcome","to","Tamil","nadu"));
		l1.forEach(word -> str.append(word.charAt(0)));
		System.out.println(str);
	}
}
