//Laura Thornton 
//HW 5 | October 31, 2019
package hw5;

import java.util.Arrays;

public class HW5_Q1 {

	public static void main(String[] args) {
		
		String[] arr = {"One","Two","Three","Four"};
		System.out.println(Arrays.toString(arr));
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));

		
	}
	public static void selectionSort(String arr[]) {
		for(int i=arr.length-1; i>0;i--) {
			int max=i;
			for(int j=i-1;j>=0;j--) {
				if (arr[j].compareTo(arr[max])>0)
					max=j;
			}
			swap(arr,i,max);
		}
	}
	public static void swap(String arr[], int i,int j) {
		if(i!=j) {
			String temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}



