package com.collections;
import java.util.*;

public class PersonDetails implements Comparable {
	int Weight;
	int Height;
	String name;

	PersonDetails(int Weight, int Height, String name) {
		this.Height = Height;
		this.Weight = Weight;
		this.name = name;

	}

	@Override
	public String toString() {
		return "Person [Weight=" + Weight + ", Height=" + Height + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		int Weight1 = this.Weight;
		int Height1 = this.Height;
		PersonDetails p = (PersonDetails) o;
		int Weight2 = p.Weight;
		int Height2 = p.Height;
		if (Weight1 < Weight2) {
			return -1;
		} else if (Weight1 > Weight2) {
			return +1;
		} else {
			if (Height1 < Height2) {

				return -1;
			} else if (Height1 > Height2) {
				return 1;
			}

		}
		return Height2;

	}
}
 class sorting {
	public static void main(String[] args) {
	
		PersonDetails p1 = new PersonDetails(49, 6, "Agnes");
		PersonDetails p2 = new PersonDetails(46, 7, "Milk");
		PersonDetails p3 = new PersonDetails(55, 5, "Mocha");
		PersonDetails p4 = new PersonDetails(41, 5, "Tom");
		PersonDetails p5 = new PersonDetails(57, 4, "Jerry");

		TreeSet<PersonDetails> n = new TreeSet<>();
		n.add(p1);
		n.add(p2);
		n.add(p3);
		n.add(p4);
		n.add(p5);
		System.out.println(n);
	}

}


