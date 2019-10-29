import java.util.Scanner;

public class Sequence {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a number:");
		int n = input.nextInt();
		
		writeSequence(n);
		
		//Used below code to test cases 1-10
		//System.out.println();
		//writeSequence(n+1);
		//System.out.println();
		//writeSequence(n+2);
		//System.out.println();
		//writeSequence(n+3);
		//System.out.println();
		//writeSequence(n+4);
		//System.out.println();
		//writeSequence(n+5);
		//System.out.println();
		//writeSequence(n+6);
		//System.out.println();
		//writeSequence(n+7);
		//System.out.println();
		//writeSequence(n+8);
		//System.out.println();
		//writeSequence(n+9);
		//System.out.println();
	}
	public static void writeSequence(int n) {
		if(n<1) {
			throw new IllegalArgumentException("Please enter a number greater than 0");
		} else if (n==1) {
			System.out.print(1);
		} else if (n==2) {
			System.out.print(1+" "+1);
		} else if(n%2==0) {
			System.out.print((n/2)+" ");
			writeSequence(n-2);
			System.out.print(" "+n/2);
		} else {
			System.out.print((n+1)/2+" ");
			writeSequence(n-2);
			System.out.print(" "+(n+1)/2);
		}
	}
}
