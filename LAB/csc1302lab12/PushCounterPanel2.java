package csc1302lab12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.math.*;

public class PushCounterPanel2 extends JPanel {
	private int value;
	private JButton inc, dec;
	private JLabel label;
	
	public PushCounterPanel2() {
		value=50;
		
		inc = new JButton("Increment");
		dec = new JButton("Decrement");
		label = new JLabel("Value:"+value);
		inc.addActionListener(new ButtonListener());
		dec.addActionListener(new ButtonListener());

		add(inc);
		add(dec);
		add(label);
		
		setBackground(Color.cyan);
		setPreferredSize(new Dimension(300, 80));
		
	}
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			String s = event.getActionCommand();
			if(s.equals("Increment")) {
				value++;
				label.setText("Value: "+value);

			} else if (s.contentEquals("Decrement")) {
				value--;
				label.setText("Value: "+value);

			}
		}
	}
}
