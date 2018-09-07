package com.mrxu.sort;
/**
 * 冒泡排序
 * @author XUJL6
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,2,4};
		sort(arr);
	}
	/**
	 * 实现冒泡排序
	 * @param arr
	 */
	public static void sort(int arr[]) {
		//需要比较元素的个数为arr.length。
		for (int i = 0; i < arr.length; i++)
			//每个元素需要比较的次数
			for (int j = 0; j < arr.length - i - 1; j++) {
				//比较相邻两个元素的大小，若下面元素小，则上升一位，实现冒泡。
				if (arr[j] < arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
				Util.print(arr);
			}
	}
}
