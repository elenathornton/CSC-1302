package csc1302lab;

public class Lab1Q1_ThorntonLaura {
	public static void main(String [] args) {
		//outer for loop, creates rows
		for(int i=5; i>=1; i--) {   
			//inner for loop, creates columns
	         for(int j=5; j>=i; j--) 
	         {
	        	 //print numbers
	             System.out.print(j+" "); 
	         } 
	         //print new line
	         System.out.println();
		}
	}
	
	}
