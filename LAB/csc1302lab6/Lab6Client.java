package csc1302lab6;
import java.util.*;
public class Lab6Client {
	public static void main(String[] args) {
		ArrayList<ColoredRectangle> list = new ArrayList<ColoredRectangle>();
		list.add(new ColoredRectangle(1,2,"red"));
		list.add(new ColoredRectangle(3,4,"green"));
		list.add(new ColoredRectangle(5,6,"blue"));
		
		System.out.println("List: "+list);
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) { 
			for (int j = i + 1 ; j < list.size(); j++) { 
				if (list.get(i).equals(list.get(j))) { 
					System.out.println(list.get(i)+" is equal to "+list.get(j));
				}
				else
					System.out.println(list.get(i)+" is not equal to "+list.get(j));
			}
		}
	}
}
