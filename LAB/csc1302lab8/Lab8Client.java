package csc1302lab8;

import java.util.*;

public class Lab8Client {
	public static void main(String[] args) {
		ArrayList<Rectangle> list1 = new ArrayList<Rectangle>(Arrays.asList(
				new Rectangle(1,10, new Point(0,0)),
				new Rectangle(2,10, new Point(1,1)),
				new Rectangle(3,10, new Point(1,2)),
				new Rectangle(4,10, new Point(3,1)),
				new Rectangle(5,6, new Point(4,3)),
				new Rectangle(6,5, new Point(2,7)),
				new Rectangle(7,4, new Point(1,9)),
				new Rectangle(8,3, new Point(6,8)),
				new Rectangle(9,2, new Point(10,2)),
				new Rectangle(10,1, new Point(2,3))
				));
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println("Sorted List:");
		System.out.println(list1);

		
		
		}
}
