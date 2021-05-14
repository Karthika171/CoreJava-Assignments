package oops;

public class singleton {
	private static singleton sObject;
	private singleton()
	{

	}
	public static singleton getInstance()
	{
		if(sObject==null)
		{
			sObject=new singleton();
		}
		return sObject;
	}
	public void getValue()
	{
		System.out.println("Singleton created");
	}

	public static void main(String[] args) {
		singleton s1=new singleton();
		s1.getValue();
		
	}

}
