package com.mrxu.sort;
/**
 * ð������
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
	 * ʵ��ð������
	 * @param arr
	 */
	public static void sort(int arr[]) {
		//��Ҫ�Ƚ�Ԫ�صĸ���Ϊarr.length��
		for (int i = 0; i < arr.length; i++)
			//ÿ��Ԫ����Ҫ�ȽϵĴ���
			for (int j = 0; j < arr.length - i - 1; j++) {
				//�Ƚ���������Ԫ�صĴ�С��������Ԫ��С��������һλ��ʵ��ð�ݡ�
				if (arr[j] < arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
				Util.print(arr);
			}
	}
}
