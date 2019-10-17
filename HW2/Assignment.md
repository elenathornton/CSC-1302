## Homework 2

Given the Employee class and the Lawyer class above
* Write an employee class SoftwareEngineer to accompany the other employees. SoftwareEngineers work 10 more hours (50 hours/week), they make $55,000 ($15,000 more than others), they get half as much vacation (only 5 days), and they have an additional method named writeCode that prints "Coding!" Use the super keyword to interact with the Employee superclass as appropriate.
* Write an employee class HarvardLawyer to accompany the other employees. Harvard lawyers are like normal lawyers, but they make 20% more money than a normal lawyer, they get 3 days more vacation, and they have to fill out three of the lawyer's forms to go on vacation. That is, the getVacationForm method should return "pinkpinkpink". (If the normal Lawyer's vacation form ever changed, the HarvardLawyer's should as well. For example, if Lawyer's vacation form changed to "red", the HarvardLawyer's should return "redredred".) Use the super keyword to interact with the Lawyer superclass as appropriate.
* Write a client class called EmployeeClient that creates objects of Lawyer, SoftwareEngineer and HardvardLawyer class in the main method. Write a method called printEmployee() that takes an object of Employee as a parameter and prints out salary, hour, vacation days and vacation form for the employee. Also call writeCode() method if you are printing a SoftwareEngineer object. Call printEmployee() method from main method.

	Example output for Lawyer object
	Lawyer:
	Salary: $40000 Hours: 40
	Vacation days: 15 Vacation form: pink

Employee.java

	public class Employee {
    	public int getHours() {	
        	return 40;           // works 40 hours / week	
		}
		public double getSalary() {	
			return 40000.0; // $40,000.00 / year	
		}	
		public int getVacationDays() {
			return 10;           // 2 weeks' paid vacation	
		}	
		public String getVacationForm() {	
			return "yellow";     // use the yellow form
		} 
	}
	



Lawyer.java

	public class Lawyer extends Employee {
		public int getVacationDays() {
			return super.getVacationDays() + 5; 
		}
		public String getVacationForm() {
			return "pink";
		}
		public void sue() {
			System.out.println("I'll see you in court!");
		}
	}


