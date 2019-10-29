package csc1302lab;

import java.util.Arrays;

public class lab10 {
	public static void main (String[] args) {
		int arr1[] = {1,3,4,2,45,2,3,6,1,9,3};
		int arr2[] = {2,4,2,5,8,3,5,67,34,23};
		int arr3[] = {3,4,6,3,6,78,4,2,6,8,2};
		
		
		System.out.println("Array 1: "+Arrays.toString(arr1));
		selectionSort(arr1);
		System.out.println("Selection sort array: "+Arrays.toString(arr1));
		System.out.println("Array 1: "+Arrays.toString(arr2));
		bubbleSort(arr2);
		System.out.println("Bubble sort array: "+Arrays.toString(arr2));			
		System.out.println("Array 1: "+Arrays.toString(arr3));
		insertionSort(arr3);
		System.out.println("Insertion sort array: "+Arrays.toString(arr3));

	}
	
	public static void selectionSort(int arr[]) {
		for(int i=0; i<arr.length-1;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if (arr[j]<arr[min])
					min=j;
			}
			swap(arr,i,min);
		}
	}
	public static void bubbleSort(int arr[]) {
		for (int i = (arr.length - 1); i >= 0; i--)
		   {
		      for (int j = 1; j <= i; j++)
		      {
		         if (arr[j-1] > arr[j])
		         {
		              int temp = arr[j-1];
		              arr[j-1] = arr[j];
		              arr[j] = temp;
		              }
		      }
		   }
	}
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
	}
	public static void swap(int arr[], int i,int j) {
		if(i!=j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}
