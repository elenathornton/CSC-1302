package csc1302lab11;

public class Lab11Q3 {
	public static void main(String[] args) {
		String s = "hello";
		String s1 = "hi";
		String s2 = "bye";
		
		System.out.println(repeat(s,6));
		System.out.println(repeat(s1,1));
		System.out.println(repeat(s2,0));

	}
	public static String repeat(String s, int n) {
		if(n==1)
			return s;
		else if (n==0)
			return "";
		else
			return s+repeat(s,n-1);
	}
}
