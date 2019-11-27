package csc1302lab13;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays; 

import javax.swing.*;


public class SortAppPanel extends JPanel {
	private JTextField field1,field2,field3,field4,field5;
	private JLabel input, output;
	private JButton sortbutton;
	public SortAppPanel(){
		input= new JLabel("Enter 5 numbers:");
		output= new JLabel("Sorted numbers: ");
		field1= new JTextField(5);
		field2= new JTextField(5);
		field3= new JTextField(5);
		field4= new JTextField(5);
		field5= new JTextField(5);
		sortbutton = new JButton("Sort");

		sortbutton.addActionListener(new ButtonListener());
		
		add(input);
		add(field1);
		add(field2);
		add(field3);
		add(field4);
		add(field5);
		add(sortbutton);
		add(output);

		setPreferredSize(new Dimension(400, 200));
		
	}
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			int[] array;
            int number1, number2, number3, number4, number5;

            String text1 = field1.getText();
            String text2 = field2.getText();
            String text3 = field3.getText();
            String text4 = field4.getText();
            String text5 = field5.getText();

            number1 = Integer.parseInt(text1);
            number2 = Integer.parseInt(text2);
            number3 = Integer.parseInt(text3);
            number4 = Integer.parseInt(text4);
            number5 = Integer.parseInt(text5);

            array = new int[5];
            array[0] = number1;
            array[1] = number2;
            array[2] = number3;
            array[3] = number4;
            array[4] = number5;

            selectionSort(array);
            output.setText("Sorted numbers: " + array[0] + ", " + array[1] + ", " + array[2] + ", " + array[3] + ", " + array[4]);

        }
		
	}
	public static void selectionSort(int arr[]) {
		for(int i=0; i<arr.length-1;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if (arr[j]<arr[min])
					min=j;
			}
			swap(arr,i,min);
		}
	}
	public static void swap(int arr[], int i,int j) {
		if(i!=j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}

