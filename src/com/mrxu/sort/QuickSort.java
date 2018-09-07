package com.mrxu.sort;
/**
 * 快速排序
 * @author XUJL6
 *
 */
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 6,7, 8, 3,5, 10, 9,5 };
		sort(0,arr,arr.length - 1);
		Util.print(arr);
	}
	public static void sort(int left,int[] arr,int right) {
		if (left < right) {
			int a = left;
			int b = right;
			int base = arr[a];
			while (b - a > 0) {
				//从右向左扫描，找出第一个小于基准的值
				while (a < b && arr[b] > base) b--;
				//交换
				if (a < b) {
					int t =arr[b];
					arr[b] = arr[a];
					arr[a] = t;
					a++;
				}
				//从左向右扫描，找出第一个大于基准的值
				while (a < b && arr[a] < base) a++;
				//交换
				if (a < b) {
					int t =arr[b];
					arr[b] = arr[a];
					arr[a] = t;
					b--;
				}
			}
//			Util.print(arr);
			//对左边进行排序
			sort(left,arr,b - 1);
			//对右边进行排序
			sort(a + 1,arr,right);
		}
	}

}
