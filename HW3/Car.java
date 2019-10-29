public class Car implements Comparable<Car> {
	private String make;
	private String model; 
	private int year;

	public Car(String make, String model, int year) {
		this.make=make;
		this.model=model;
		this.year=year;
	}
	public void setMake(String make) {
		this.make=make;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	
	public String toString() {
		return make+" "+model+" "+year;
	}

	@Override
	public int compareTo(Car o) { 
		if (make.equals(o.make))
			return model.compareTo(o.model);
		else if (model.equals(o.model))
			return year-o.year;
		else
			return make.compareTo(o.make);

	}

}
