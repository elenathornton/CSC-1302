package csc1302lab;

public class Doctor extends Human{
	private int years;
	private String speciality;
	
	public Doctor(double weight, int age, int height, String speciality, int years) {
		super(weight, age, height);
		this.speciality=speciality;
		this.years = years;
	}
	
	
	public int getYears() {
		return years;
	}

	public String getSpeciality() {
		return speciality;
	}
	
	public double getSalary() {
		if (years == 0 || years==1)
			return 40000.0;
		else 
			return 40000.0+(5000.0*years);
	}
	
	public String toString() {
		return "speciality: "+speciality+" "+super.toString()+" salary: $"+getSalary();
	}
}
