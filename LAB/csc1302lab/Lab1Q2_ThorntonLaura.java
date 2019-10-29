package csc1302lab;
import java.util.Arrays;
import java.util.Scanner;

public class Lab1Q2_ThorntonLaura {
	public static void main(String[]args) {
	int x;
	//first question setting variable x to be length of array
	Scanner input = new Scanner(System.in);
	System.out.println("How many elements does your array have?");
	x=input.nextInt();
	
	//second question asking for input of user for elements
	Scanner arr = new Scanner(System.in);
	System.out.println("Enter the elements of your array:");
	int yourarray[]=new int[x];
	for (int i=0;i<x;i++) {
		yourarray[i]=input.nextInt();
	}
	//creating a boolean variable so the void method can call the boolean
	boolean sorted=isSorted(yourarray);
	System.out.println(sorted);
	}
	
	//boolean method that checks if array is in ascending order
	static boolean isSorted(int[] yourarray) {
		for (int i=0;i<yourarray.length;i++) {
			if (i==0)
				continue;		
			if (yourarray[i-1]>=yourarray[i])
			return false;
		}
		return true;
		
	}
}
