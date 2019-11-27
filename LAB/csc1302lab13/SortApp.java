package csc1302lab13;
import javax.swing.JFrame;


public class SortApp {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Sorting");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		SortAppPanel panel = new SortAppPanel();
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
	}
}
