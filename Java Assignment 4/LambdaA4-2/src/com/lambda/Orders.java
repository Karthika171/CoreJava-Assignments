package com.lambda;

import java.util.Scanner;
import java.util.function.Consumer;

public class Orders {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order value :");
		Integer y= sc.nextInt();

		
		Consumer<Integer> action = x-> {
			if (y>1000) {
				System.out.println("Accepted");}
			else
				{System.out.println("Rejected");}
				
		};
	action.accept(y);
	}

}
