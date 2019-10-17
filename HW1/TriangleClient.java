import java.util.Scanner;

public class TriangleClient {
	public static void main(String[] args) {
		var input = new Scanner(System.in);
		System.out.println("Enter 3 side lengths:");
		int side1=input.nextInt();
		int side2=input.nextInt();
		int side3=input.nextInt();
		
		Triangle tri = new Triangle(side1, side2, side3);
		tri.isEquilateral();
		tri.isIsosceles();
		tri.isScalene();
		System.out.println(tri.toString());
		
		//Below code was used for debugging
		//System.out.println ("Is your triangle equilateral? "+tri.isEquilateral());
        //System.out.println ("Is your triangle isosceles? "+tri.isIsosceles());
        //System.out.println ("Is your triangle scalene? "+tri.isScalene());
		
	}
	
}
