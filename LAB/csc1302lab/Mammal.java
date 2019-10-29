package csc1302lab;

public class Mammal {

	private int age;
	private double weight;
	 
	public Mammal(double weight, int age)
	{
	    this.age = age;
	    this.weight = weight; 
	}
	 
	public double getWeight()
	{
	    return weight;
	}
	 
	public int getAge()
	{
	    return age;
	}

	public String toString(){
		return "age: "+age+" years  weight: "+weight+"lbs ";
	}
}


