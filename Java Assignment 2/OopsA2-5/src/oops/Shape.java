package oops;

abstract class Size {
	public abstract void draw();
	
}
class Rectangle extends Size
{
	@Override
	public void draw()
	{
		System.out.println("Draw all shapes");
	}
}
class Line extends Size
{
	@Override
	public void draw()
	{
		System.out.println("Draw all shapes");
	}
}
class Circle extends Size
{
	@Override
	public void draw()
	{
		System.out.println("Draw all shapes");
	}
}
 public class Shape{
	public static void main(String[] args) {
		
		Rectangle r=new Rectangle();
		r.draw();
		Line l=new Line();
		l.draw();
		Circle c=new Circle();
		c.draw();
	}
	}

