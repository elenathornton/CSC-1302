package csc1302lab;

public class Circle {
	private int radius;
	private Point center = new Point();
	
	public Circle(Point center, int radius) {
		this.center=center;
		this.radius=radius;
	}
	public Point getCenter() {
		return center;	
	}
	public int getRadius() {
		return radius;
	}
	public double getArea() {
		double pi=3.14;
		return pi*radius*radius;
	}
	public double getCircumference() {
		double pi=3.14;
		return pi*2*radius;
	}
	public String toString() {
		return "Circle: [center = "+center.toString()+", radius = "+radius+"]";
	}
	
	public boolean contains(Point p) {
		boolean contains=false;
		if(center.distance(p)<radius) {
			contains=true;
			return contains;
		}
		else 
			return contains;
	}
}
