import java.util.ArrayList;

public class Doublelist_Q1 {

	public static void main (String [] args) {
		
		ArrayList<String> test = new ArrayList<String>();
		test.add("how");
		test.add("are");
		test.add("you");
		
		System.out.println(test);
		
		doubleList(test);
		System.out.println(test);

	}
	
	
	public static void doubleList (ArrayList<String> string) {
		for (int i=0; i<string.size();i+=2) {
			String a = string.get(i);
			string.add(i, a);
		}
	}
}
