package oops;

abstract class Animal {
abstract void Sound();

public void eat() {
	System.out.println("Eating");
	  }
}

class Dog extends Animal {

public void Sound() {
 System.out.println("Barking");
	}
}

class Abstract {
	public static void main(String[] args) {
   Dog d1 = new Dog();
   d1.Sound();
   d1.eat();
			  }
			}



