public class SoftwareEngineer extends Employee{
	public int getHours() {
		return super.getHours()+10;
	}
	public double getSalary() {
		return super.getSalary()+15000.0;
	}
	public int getVacationDays() {
		return super.getVacationDays()/2;
	}
	public void writeCode() {
		System.out.println("Coding!");
	}
}
