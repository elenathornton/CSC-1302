package csc1302lab7;

import java.util.ArrayList;

public class Lab7client {
	public static void main(String[] args) {
		//test ArrayList for minToFront: [4, 7, 9, 2, 7, 7, 5, 3, 5, 1, 7, 8, 6, 7]
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(4);
		test.add(7);
		test.add(9);
		test.add(2);
		test.add(7);
		test.add(7);
		test.add(5);
		test.add(3);
		test.add(5);
		test.add(1);
		test.add(7);
		test.add(8);
		test.add(6);
		test.add(7);
		//test2 ArrayList for intersect: [1, 4, 8, 9, 11, 15, 17, 28, 41, 59]
		ArrayList<Integer> test2 = new ArrayList<Integer>();
		test2.add(1);
		test2.add(4);
		test2.add(8);
		test2.add(9);
		test2.add(11);
		test2.add(15);
		test2.add(17);
		test2.add(28);
		test2.add(41);
		test2.add(59);		
		//test3 ArrayList for intersect: [4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81]
		ArrayList<Integer> test3 = new ArrayList<Integer>();
		test3.add(4);
		test3.add(7);
		test3.add(11);
		test3.add(17);
		test3.add(19);
		test3.add(20);
		test3.add(23);
		test3.add(28);
		test3.add(37);
		test3.add(59);
		test3.add(81);

		System.out.println(test);
		minToFront(test);
		System.out.println(test);
		filterRange(test, 5, 7);
		System.out.println(test);
		System.out.println();
		System.out.println();
		System.out.println(test2);
		System.out.println(test3);
		intersect(test2, test3);
	}
	
	public static void minToFront(ArrayList<Integer> list) {
		int minIndex = 0;
		int min;
		for (int i=0;i<list.size();i++) {
			if (list.get(minIndex)>list.get(i))
				minIndex=i;			
		}		
		min = list.remove(minIndex);
		list.add(0,min);
	}
	public static void filterRange(ArrayList<Integer> list, int a, int b) {
		int min = a;
		int max = b;
		for (int i=0; i<list.size();i++) {
			if (min<=list.get(i) && list.get(i)<=max) {
				list.remove(i);
				i--;
			}	
		}
	}
	public static void intersect(ArrayList<Integer> list1,ArrayList<Integer> list2) {
		ArrayList<Integer> intersection = new ArrayList <Integer> ();
		for (int i: list1) {
			if (list2.contains(i))
				intersection.add(i);	
		}
		System.out.println(intersection);	
	}
}
