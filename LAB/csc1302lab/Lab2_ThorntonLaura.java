// Laura Thornton 002401228
// September 3, 2019
// CSC 1302

package csc1302lab;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2_ThorntonLaura {
	public static void main(String[] args) {
		int l;
		Scanner input = new Scanner(System.in);
		System.out.println("How many elements does your array have?");
		l=input.nextInt();
		Scanner arr = new Scanner(System.in);
		System.out.println("Enter the elements of your array:");
		int yourarray[]=new int[l];
		for (int i=0;i<l;i++) {
			yourarray[i]=input.nextInt();
		}
		System.out.println("array: "+Arrays.toString(yourarray));
		reverse(yourarray);
		getMin(yourarray);
		computeTwice(yourarray);
		
	}
	
	public static void reverse(int[] yourarray) {
		for(int i = 0; i < yourarray.length / 2; i++) {
		    int temp = yourarray[i];
		    yourarray[i] = yourarray[yourarray.length - i - 1];
		    yourarray[yourarray.length - i - 1] = temp;
		}
		System.out.println("array in reverse: "+Arrays.toString(yourarray));
	}
	public static void getMin(int[] yourarray) {
		int min = yourarray[0]; 
        
        // for each loop 
        for (int num : yourarray) { 
            if (num < min) { 
                min = num; 
            } 
        } 
		System.out.println("minimum: "+min);
	}
	
	public static void computeTwice(int[] yourarray) {
		for (int i=0; i<yourarray.length;i++) {
			yourarray[i]=yourarray[i]*2;
		}
		System.out.println("array with twice the numbers: "+Arrays.toString(yourarray));

	}
}
