package com.lambda;

import java.util.ArrayList;
import java.util.List;
public class Odd {
	public static void main(String[] args) {
		List<String> ls= new ArrayList<>();
		ls.add("Milk");
		ls.add("Mocha");
		ls.add("Agnes");
		ls.add("Tom");
		ls.add("Jerry");
		ls.add("Shinchan");
		
		ls.forEach(i -> {  
            if (i.length() % 2 == 0) {  
                System.out.println(i); 
		        }
		});  
    
}}
