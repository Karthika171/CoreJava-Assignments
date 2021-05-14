package test;
import java.util.*;
public class sub {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter m1,m2,m3");
	int m1=s.nextInt();
	int m2=s.nextInt();
	int m3=s.nextInt();
	if(m1>=60 && m2>=60 && m3>=60)
	{
		System.out.println("passed");
	}
	else if(m1>=60 && m2>=60 || m2>=60 && m3>=60 || m3>=60 && m1>=60)
	{
		System.out.println("promoted");
	}
	else if(m1>60 || m2>60 || m3>60 || m1+m2+m3<60)
	{
		System.out.println("failed");
	}

	}

}
