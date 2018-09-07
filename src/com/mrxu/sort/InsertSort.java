package com.mrxu.sort;

/**
 * ≤Â»Î≈≈–Ú
 * 
 * @author XUJL6
 *
 */
public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 6, 8, 7, 10, 9 };
		sort(arr);
	}

	public static void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
				int t = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = t;
			}
			Util.print(arr);
		}
	}
}
