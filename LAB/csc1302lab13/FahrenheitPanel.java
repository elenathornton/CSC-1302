package csc1302lab13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FahrenheitPanel extends JPanel {
	private JLabel input,output,result;
	private JTextField fahrenheit;
	private JButton toF,toC;
	public FahrenheitPanel(){
		input= new JLabel("Enter temperature:");
		output= new JLabel("Converted to _____:");
		toC = new JButton("Fahrenheit to Celsius");
        toF = new JButton("Celsius to Fahrenheit");
        toC.addActionListener(new TempListener());
        toF.addActionListener(new TempListener());
		result= new JLabel("---");
		fahrenheit= new JTextField(5);
		fahrenheit.addActionListener(new TempListener());
		add(toC);
        add(toF);
        add(input);
        add(fahrenheit);
        add(output);
        add(result);
		setPreferredSize(new Dimension(300, 300));
	}
	private class TempListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
            if(event.getSource() == toC){
                int fTemp, cTemp;

                String text = fahrenheit.getText();

                fTemp = Integer.parseInt(text);
                cTemp = (fTemp-32) * 5/9;

                output.setText("Converted from Fahrenheit to Celsius:");
                result.setText(Integer.toString(cTemp));
            }
            else{
                int cTemp, fTemp;

                String text = fahrenheit.getText();

                cTemp = Integer.parseInt(text);
                fTemp = (cTemp * 9/5) + 32;
                output.setText("Converted from Celsius to Fahrenheit:");
                result.setText(Integer.toString(fTemp));
            }	
        }
	}
}
