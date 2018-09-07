package com.mrxu.sort;
/**
 * 选择排序
 * @author XUJL6
 *
 */
public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,2,4};
		sort(arr);
	}
	public static void sort(int[] arr) {
		int minIndex;
		for (int i = 0; i < arr.length; i++) {
			minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j])
					//把比arr[minIndex]小的值的位置赋值为minIndex
					minIndex = j;
			}
			//把最小值放到已比较好的数组后面
			int t = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = t;
			Util.print(arr);
		}
	}
}
 