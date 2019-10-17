public class Employee {
	public int getHours() {
		return 40;
	}
	public double getSalary() {
		return 40000.0;
	}
	public int getVacationDays() {
		return 10;
	}
	public String getVacationForm() {
		return "yellow";
	}
	public String printEmployee(Employee e) {
		return Object.class+"\nSalary: "+e.getSalary()+"\nHours: "+e.getHours()+"\nVacation days: "+e.getVacationDays()+"\nVacation Form: "+e.getVacationForm();
	}
}
