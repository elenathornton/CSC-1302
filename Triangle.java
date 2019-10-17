public class Triangle {
	private int side1;
	private int side2;
	private int side3;
	private boolean equilateral;
	private boolean isosceles;
	private boolean scalene;	
	public String type="";
	
	//Constructor to set triangle sides to input values
	public Triangle (int side1, int side2, int side3) {
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
		equilateral=false;
		isosceles=false;
		scalene=false;
	}
	
	//Getters for side lengths - used in toString method
	public int getSide1() {
		return side1;
	}
	public int getSide2() {
		return side2;
	}
	public int getSide3() {
		return side3;
	}
	
	
	//type methods compare side lengths and sets "type" variable to the correct type
	//also used booleans for debugging and getting type
	public boolean isEquilateral() {
		if ((side1==side2) && (side2==side3)) {
			equilateral=true;
			type="equilateral";
		}
		return equilateral;
	}
	public boolean isIsosceles() {
		if (((side1 == side2) && (side1 != side3)) || ((side1 == side3) && (side1 != side2)) || ((side2 == side3) && (side2 != side1))) {
			isosceles=true;
			type = "isosceles";		
			}
		return isosceles;
	}
	public boolean isScalene() {
		if ((side1 != side2) && (side1 != side3) && (side2 != side3)) {
			scalene=true;
			type="scalene";
		}
		return scalene;
	}

	//getter for type
	public String getType() {
		return type;
	}
	
	//toString method to print whole object in plain text
	public String toString() {
		return "[side1: "+side1+", side2: "+side2+", side3: "+side3+"] \nYour triangle is a(n) " +type+ " triangle";
	}
	
}
