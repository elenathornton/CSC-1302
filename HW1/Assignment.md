## Homework #1
### Topic: Classes

You must write a java class called Triangle and a client class called TriangleClient. The partial Triangle class is given below. 

Triangle.java

	//a Triangle class that stores the 3 sides of a triangle

		public class Triangle {

		private int side1;

		private int side2;

		private int side3;
		//constructs a new Triangle with the given side1, side2 and side3 public Triangle(int side1, int side2, int side3)
		// returns the fields' values
		public int getSide1()
		public int getSide2()
		public int getSide3()
		//returns the string representation of the triangle 
		//such as {side1: 10, side2: 10, side3: 15}
		public String toString() ...
	}

* Write an instance method called isEquilateral() that determines whether a triangle is equilateral. If all sides are equal then its equilateral triangle
* Write another instance method called isIsoceles() that will be placed inside the Triangle class. This method determines whether a triangle is isosceles. Any (and at least) two sides must be equal.
* Write another instance method called isScalene() that will be placed inside the Triangle class. This method determines whether a triangle is scalene. No two sides are equal.
* Write the client class TriangleClient that asks the user to enter the three side and creates an object of class Triangle and uses the data entered to initialize its size. Print out Triangle object. Then print out if it is an equilateral triangle or an isosceles triangle or scalene.
