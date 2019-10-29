package csc1302lab;

public class Lab5Client {
	public static void main(String[] args) {
		Human Alex = new Human(133.0, 21, 162);
		System.out.println("{Alex} "+Alex.toString());
		
		Doctor Jack = new Doctor(179.0, 40, 173, "Dermatology", 4);
		System.out.println("{Jack} "+Jack.toString());
		
		
		//Additional Questions
		//1. Mammal mam1=jack;
		//   System.out.println(mam1.getSalary());
		//This will return an error because getSalary is not defined for Mammal class
		
		//2. Human hum1=alex;
		//   System.out.println (hum1.getHeight());
		//This will print 162.0
		
		//3. Mammal mam1=jack;
		//   System.out.println (mam1.getWeight());
		//This will print 179.0

	}
}
