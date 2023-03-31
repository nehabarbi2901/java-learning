package com.neha.gfg.array.school;

/**
 * Given an array Arr of size N, print second largest distinct element from an array.
 * @author Neha
 *
 */
public class SecondLargest {
	public static void main(String args[]) {
		//int[] arr = { 10, 5, 5, 8, 8, 10, 8, 9, 10 };
		 int [] arr =  {12, 35, 1, 10, 34, 1};
		 
		 
		int n = 6;
		int print2largest = print2largest(arr, n);
		

		int print2largest1 = print2largest1(arr, n);

		printArry(arr);
		
		 System.out.println(print2largest);

		 System.out.println(print2largest1);

	}

	static int print2largest(int arr[], int n) {

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}

		int i=1;
		int f = arr[0];
		int s = arr[i];
		
		while(s==f) {
		
			i++;
			if(i<arr.length) {
			s = arr[i];
			}else {
				break;
			}
		}
		return s;

	}

	static int print2largest1(int arr[], int n) {

		int f = 0;
		int s = -1;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > f) {
				s = f;
				f = arr[i];
			}

			if (arr[i] > s && arr[i] < f) {
				s = arr[i];
			}
		}

		return s;
	}

	private static void printArry(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}
}
