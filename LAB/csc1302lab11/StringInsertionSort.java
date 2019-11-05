package csc1302lab11;

import java.util.Arrays;

public class StringInsertionSort {
	public static void main (String[] args) {
		String[] arr ={"Atlanta","New York","Dallas","Omaha","San Francisco"};
	    System.out.println(Arrays.toString(arr));
		insertionSort(arr);
	    System.out.println(Arrays.toString(arr));

	}
	
	public static void insertionSort(String a[]) {
		for(int i=1; i < a.length; i++) {
			String index = a[i];
			int j=i-1;
			while (j>=0) {
				if (index.compareTo(a[j])>0) {
					break;
				}
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=index;
		}
		
	}
}

//original insertion sort method
/*
 
public static void insertionSort(int arr[]) {
	for (int i=1; i < arr.length; i++)
  {
     int index = arr[i]; int j = i;
     while (j > 0 && arr[j-1] > index)
     {
          arr[j] = arr[j-1];
          j--;
     }
     arr[j] = index;
} 

*/
