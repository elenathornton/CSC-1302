package csc1302lab11;

public class RandomIncrementer implements Incrementable{
	int value=(int)(Math.random()*10000);
	@Override
	public void increment() {
		value=value+(int)(Math.random()*10000);

	}

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return value;
	}

}
