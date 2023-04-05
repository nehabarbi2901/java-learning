package com.neha.gfg.array.school;
/**Given a Integer array A[] of n elements.
 * Your task is to complete the function PalinArray. 
 * Which will return 1 if all the elements of the Array are palindrome 
 * otherwise it will return 0.
 * 
 * @author 
 *
 */
public class PalindromicArray {
	public static int palinArray(int[] a, int n) {

		int m = 1;
		int remainder;

		for (int i = 0; i < n; i++) {
			int k = a[i], s = 0;

			while (k != 0) {
				remainder = k % 10;
				s = s * 10 + remainder;
				k = k / 10;
			}

			if (a[i] != s) {
				m = 0;
				break;
			}

		}

		return m;

	}

	public static void main(String[] args) {
		int[] a = { 111, 222, 333, 444, 555 };
		int n = a.length;
		int palinArray = palinArray(a, n);
		System.out.println(palinArray);
	}

}