package csc1302lab;

public class Point {
	private int x,y;

	public Point() {
		this.x=0;
		this.y=0;
	}
	
	public String toString() {
		return "("+x+", "+y+")";
	}
	
	public double distance(Point other) {
		int dx=x-other.x;
		int dy=y-other.y;
		return Math.sqrt(dx*dx+dy*dy);
	}
	
	public void setPoint(int x,int y) {
		this.x=x;
		this.y=y;
	}

}