package oops;
class Add {
	public void method()
	{
		System.out.println("Welcome");
	}
}
class saving extends Add{
	int fd;
	@Override
	public void method()
	{
	super.method();
	System.out.println("Enter a amnt of fd:" + fd);
	}
	}
class current extends Add{
	int cashcredit;
	@Override
	public void method()
	{
	System.out.println("Enter a amnt of cash credit:" + cashcredit);
	}
}
 public class bank{
	public static void main(String[] args) {
	saving s=new saving();
	s.fd=5000;
	s.method();
	current c=new current();
	c.cashcredit=10000;
	c.method();
	System.out.println("Total amnt:" + (s.fd + c.cashcredit));
	}
 }


