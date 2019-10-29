package csc1302lab6;
import java.util.*;
public class Arraylist_Q2 {
	public static void minToFront(ArrayList<Integer> array) {
		int minIndex = 0;
		int min;
		for (int i=0;i<array.size();i++) {
			if (array.get(minIndex)>array.get(i))
				minIndex=i;
				
		}
		
		min = array.remove(minIndex);
		array.add(0,min);
	}
	public static void main(String[] args) {
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(6);
		list2.add(4);
		list2.add(8);
		list2.add(2);
		list2.add(5);
		list2.add(9);
		list2.add(3);
		list2.add(0);
		
		System.out.println(list2);
		minToFront(list2);
		System.out.println(list2);
		
		
		
		
		
	}
}
