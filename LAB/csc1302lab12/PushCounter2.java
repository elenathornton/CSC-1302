package csc1302lab12;
import javax.swing.JFrame;


public class PushCounter2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Increment/Decrement");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PushCounterPanel2 panel = new PushCounterPanel2();
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}
