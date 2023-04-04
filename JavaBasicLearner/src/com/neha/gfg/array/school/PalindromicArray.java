package com.neha.gfg.array.school;

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