package csc1302lab12;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.math.*;

public class PushCounterPanel extends JPanel {
	private int count;
	private JButton push;
	private JLabel label;
	
	public PushCounterPanel() {
		count=0;
		
		push = new JButton("Push Me!");
		label = new JLabel();
		push.addActionListener(new ButtonListener());
		add(push);
		add(label);
		
		setBackground(Color.cyan);
		setPreferredSize(new Dimension(300, 40));
		
	}
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			count+=(int)(Math.random()*100);
			label.setText("Pushes: "+count);
		}
	}
}
