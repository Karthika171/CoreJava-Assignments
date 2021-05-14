package oops;

abstract class Persistsnce{
	public abstract void persist();
}

class Filepersistance extends Persistsnce{
	public void persist() {
		System.out.println("Welcome");
	}
}

class Databasepersistance extends Persistsnce{
	public void persist() {
		System.out.println("Welcome humans");
	}
}
public class Persistance {

	public static void main(String[] args) {
		Persistsnce per = new Filepersistance();
		per.persist();
		Persistsnce per1 = new Databasepersistance();
		per1.persist();

	}
}
