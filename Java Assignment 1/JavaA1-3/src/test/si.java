package test;
import java.util.*;
public class si {

	public static void main(String[] args) {
		
    Scanner s=new Scanner(System.in);

	System.out.println("Enter the Princial");
	double p=s.nextDouble();
	System.out.println("Enter the rate");
	double r=s.nextDouble();
	System.out.println("Enter the time");
	double t=s.nextDouble();
	System.out.println("Enter number of times interest is compunded");
	double timeperiod=s.nextDouble();
	
	double si= ((p*r*t)/100);
	double ci= p*(Math.pow((1+r/100),(t*timeperiod)))-p;
	
	
	
	System.out.println("the simple intrest is"+ si);
	System.out.println("the compund intrest is"+ci);
	}}
