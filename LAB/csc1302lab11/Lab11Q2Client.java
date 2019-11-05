package csc1302lab11;

public class Lab11Q2Client {
	public static void main(String[] args) {
		SequentialIncrementer s1 = new SequentialIncrementer();
		RandomIncrementer r1 = new RandomIncrementer();
		
		System.out.println("Sequential: ");
		System.out.println(s1.getValue());
		s1.increment();
		System.out.println(s1.getValue());
		s1.increment();
		System.out.println(s1.getValue());
		s1.increment();
		System.out.println(s1.getValue());
		s1.increment();
		System.out.println(s1.getValue());
		s1.increment();
		System.out.println(s1.getValue());
		s1.increment();
		System.out.println(s1.getValue());
		
		System.out.println("Random:");
		System.out.println(r1.getValue());
		r1.increment();
		System.out.println(r1.getValue());
		r1.increment();
		System.out.println(r1.getValue());
		r1.increment();
		System.out.println(r1.getValue());
		r1.increment();
		System.out.println(r1.getValue());
		r1.increment();
		System.out.println(r1.getValue());
		r1.increment();
		System.out.println(r1.getValue());

	}
}
