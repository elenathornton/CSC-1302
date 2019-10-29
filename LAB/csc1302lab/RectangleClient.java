//Laura Thornton 002401228
//CSC 1302 Lab 3
//September 10, 2019

package csc1302lab;

public class RectangleClient {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle();
		
		rect1.setRectangle(4, 7, 54, 87);
		rect2.setRectangle(6, 9, 36, 98);
		
		System.out.println("Rectangle 1: "+rect1.toString());
		System.out.println("Rectangle 2: "+rect2.toString());
		System.out.println("area of rect1: "+rect1.area());
		System.out.println("area of rect2: "+rect2.area());
		System.out.println("perimeter of rect1: "+rect1.perimeter());
		System.out.println("perimeter of rect2: "+rect2.perimeter());

	}
}
