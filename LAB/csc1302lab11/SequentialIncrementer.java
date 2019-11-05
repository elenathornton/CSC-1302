package csc1302lab11;

public class SequentialIncrementer implements Incrementable {
	int value=0;
	@Override
	public void increment() {
		value++;
	}

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return value;
	}

}
