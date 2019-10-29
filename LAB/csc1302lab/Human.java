package csc1302lab;

public class Human extends Mammal{
	private double height;
	public Human(double weight, int age, int height) {
		super(weight, age);
		this.height=height;
	}

	public double getHeight() {
		return height;
	}
	public String toString() {
		return "height: "+height+"cm "+super.toString();
	}
}
