package csc1302lab;

public class CircleClient {
	public static void main(String[] args) {
		Point center = new Point();
		int radius = 7;
		Circle c = new Circle(center, radius);
		center.setPoint(10, 5);
		
		System.out.println(c.toString());
		System.out.println("Circumference: "+c.getCircumference());
		System.out.println("Area: "+c.getArea());
		
		Point p = new Point();
		p.setPoint(5, 7);
		if(c.contains(p)) {
			System.out.println(p.toString()+" lies within the circle");
		}
		else
			System.out.println(p.toString()+" does not lie within the circle");
		
		
		
	}
	
		
	
}
