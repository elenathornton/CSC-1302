public class HarvardLawyer extends Lawyer {
	public double getSalary() {
		return super.getSalary()+.2*super.getSalary();
	}
	public int getVacationdays() {
		return super.getVacationDays()+3;
	}
	public String getVacationForm() {
		return super.getVacationForm()+super.getVacationForm()+super.getVacationForm();
	}
}
