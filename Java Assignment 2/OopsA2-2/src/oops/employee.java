package oops;

class Overriding {
	int salary;
	public void method()
	{
		System.out.println("Total salary of employee");
	}
}
 class manager extends Overriding{
	 int Msalary=5000;
	 int incentive;
	 @Override
	 public void method()
	 {
		 super.method();
		 System.out.println("Enter the incentive " + (incentive+Msalary));
	 }
	
}
class labour extends Overriding
{
	 int Lsalary=2000;
	 int overtime;
	 @Override
	 public void method()
	 {
		 super.method();
		 System.out.println("Enter the overtime " + (Lsalary+overtime));
	 }
}



public class employee{
		public static void main(String args[])
		{
			labour l=new labour();
			l.overtime=500;
			l.method();
			manager m=new manager();
			m.incentive=1000;
			m.method();
		
			System.out.println("Salary is " + (l.overtime +  m.incentive));
		}
	}
	

	


