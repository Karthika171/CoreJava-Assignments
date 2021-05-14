package test;
import java.util.*;
import java.util.Scanner;

public class Arm {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int i=sc.nextInt();
		
		int b=i;
		
		int a=0;
		int c=0;
		
		while(i!=0) {
			
			
			a=i%10;
			c=c+(a*a*a);
			
			i=i/10;	
			
		}
		
		if(c==b)
		{
			System.out.println("The given number is armstrong number");
			
		}
		else
		{
			System.out.println("The given number is not armstrong number");
			
		}	

	}

}

