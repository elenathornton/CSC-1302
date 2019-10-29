//Laura Thornton 002401228
//CSC 1302 Lab 3
//September 10, 2019


package csc1302lab;

public class Rectangle {
	int x=0;
	int y=0;
	double height=0;
	double width=0;

	public void setRectangle(int newx, int newy, int newheight, int newwidth) {
		x=newx;
		y=newy;
		height=newheight;
		width=newwidth;	
	}
	
	public double getHeight() {
		return height;
	}
	public double getWidth() {
		return width;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		System.out.println(y);
		return y;
	}
	
	public String toString() {
		return "[x="+x+", y="+y+", height="+height+", width="+width+"]";
	}
	
	public double area() {
		return height*width;
	}
	public double perimeter() {
		return 2*height+2*width;
	}
}

