import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter two numbers:");
		int a = in.nextInt();
		int b = in.nextInt();
		
		System.out.println(multiply(a,b));
		
	}
	public static int multiply(int a, int b) {
		if (a==0||b==0)
			return 0;
		else {
			return b+multiply(a-1,b);
		}
	}

}
