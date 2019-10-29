## Homework 3
### Topic: ArrayList

1. Method doubleList: takes an ArrayList of Strings as a parameter and replaces every
string with two of that same string. For example, if the list stores the values [“how”, “are”, “you?”] before the method is called, it should store the values [“how”, “how”, “are”, “are”, “you?”, “you?”] after the method finishes executing.


2.	a. Given the Car class below, complete the class to include a constructor, accessors, mutators, toString method and a compareTo method. Make takes precedence over model, which take precedence over year. For example, Kia Optima 2020 comes before Toyota Corolla, 2018

		public class Car implements Comparable<Car> {
			private String make; 
			private String model;
			private int year;
			...
		}

	b. Write a client class that creates an ArrayList with at least 5 objects of the Car class. Print the ArrayList, then sort the ArrayList and print it again.

	Note: you can use Collections.sort() to sort your ArrayList after you implement the compareTo() method.

	For example:

		ArrayList<Car> cars = new ArrayList<Car>(); 
		cars.add(new Car("Toyota","Corolla",2018)); 
		cars.add(new Car("Toyota","Camry",2019)); 
		cars.add(new Car("Kia","Optima",2016)); 
		cars.add(new Car("Toyota","Camry",2010)); 
		cars.add(new Car("Kia","Soul",2015));
		Collections.sort(cars); // will sort the elements of the ArrayList using the //compareTo method defined in Car class
