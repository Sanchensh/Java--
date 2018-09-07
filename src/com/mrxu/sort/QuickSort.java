package com.mrxu.sort;
/**
 * ��������
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
				//��������ɨ�裬�ҳ���һ��С�ڻ�׼��ֵ
				while (a < b && arr[b] > base) b--;
				//����
				if (a < b) {
					int t =arr[b];
					arr[b] = arr[a];
					arr[a] = t;
					a++;
				}
				//��������ɨ�裬�ҳ���һ�����ڻ�׼��ֵ
				while (a < b && arr[a] < base) a++;
				//����
				if (a < b) {
					int t =arr[b];
					arr[b] = arr[a];
					arr[a] = t;
					b--;
				}
			}
//			Util.print(arr);
			//����߽�������
			sort(left,arr,b - 1);
			//���ұ߽�������
			sort(a + 1,arr,right);
		}
	}

}
