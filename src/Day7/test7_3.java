package Day7;

import java.util.Scanner;

public class test7_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = 3;
		int max = 9;
		int min = 1;
		int[] com = new int[size];
		cArr(max, min, size, com);
		prtArr(com);
		
		scan.close();
		//숫자 3개 야구

	}
	public static boolean cArr(int max, int min, int n, int[] arr2) {
		if(arr2 == null) {
			//빈배열
			return false;
		}
		if(max - min + 1 < n) {
			return false;
		}
		int cnt = 0;
		//현재 배열에 저장된 원소의 갯수
		while (cnt < n) {
			int r = random(max, min);
			if(!isDuplicated(arr2, r)) {
				arr2[cnt] = r;
				cnt++;
			}
		}
		return true;
	}
	public static int random(int max, int min) {
		if (max < min) {
		int tmp = max;
		max = min;
		min = tmp;
		}
		return (int)(Math.random()*(max - min + 1)) + min;

	}
	public static void prtArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static boolean isDuplicated(int[] arr, int num) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}
}
