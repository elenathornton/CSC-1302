//Laura Thornton


//Question 1 Answer
//2
//4 2
//6 4 2
//8 6 4 2
//10 8 6 4 2

package csc1302lab9;

public class Lab9 {
	public static void main(String[] args) {
		System.out.println(evenSum(4));
		System.out.println(fib(2));
	}
	
	public static int evenSum(int n) {
		if(n==0)
			return 0;
		else if (n%2!=0) {
			System.out.println("Please enter an even number.");
			return 0;
		}			
		else
			return (n+evenSum(n-2));
	}
	public static int fib(int n) {
		if (n==0)
			return 0;
		else if (n==1)
			return 1;
		else
			return fib(n-1)+fib(n-2);		
	}
}
