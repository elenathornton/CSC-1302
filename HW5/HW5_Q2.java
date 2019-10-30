//Laura Thornton 
//HW 5 | October 31, 2019
package hw5;

import java.util.Arrays;

public class HW5_Q2 {
	public static void main(String [] args) {
		int arr[] = {1,2,5,7,3,6,7,43,6,3,6,3,3};
		System.out.println(Arrays.toString(arr));
		dualSelectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}



	public static void dualSelectionSort(int arr[]) {
		for(int i=0; i<arr.length/2;i++) {
			int min=i;
			int max=arr.length-1-i;
			for(int j=i;j<arr.length-i;j++) {
				if (arr[j]<arr[min])
					min=j;
				else if (arr[j]>arr[max])
					max=j;
			}
			swap(arr,i,min);
			swap(arr, arr.length-1-i, max);
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
/*Write a modified “dual” version of the selection sort 
algorithm that sorts an array of integers and selects 
both the largest and smallest elements on each pass and 
moves each of them to the appropriate end of the array.*/