package com.mrxu.sort;
/**
 * ѡ������
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
					//�ѱ�arr[minIndex]С��ֵ��λ�ø�ֵΪminIndex
					minIndex = j;
			}
			//����Сֵ�ŵ��ѱȽϺõ��������
			int t = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = t;
			Util.print(arr);
		}
	}
}
 