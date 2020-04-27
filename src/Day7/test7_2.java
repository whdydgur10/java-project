package Day7;

import java.util.Scanner;

public class test7_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = scan.nextInt();
		int min = scan.nextInt();
		randomnum(max, min);
		scan.close();

	}
	/*static void randomnum(int max, int min) {
		int random = (int)(Math.random()*(max - min + 1)) + min;
		System.out.println(random);
	}*/
	//범위내 랜덤수 발생
	
	/*static void randomnum(int max, int min) {
		if (max < min) {
		int tmp = max;
		max = min;
		min = tmp;
		}
		int random = (int)(Math.random()*(max - min + 1)) + min;
		System.out.println(random);
	}*/
	//범위의 최대와 최소가 반대일 경우 바꿔주기
	/*static void randomnum(int max, int min) {
		if (max < min) {
			int tmp = max;
			max = min;
			min = tmp;
		}
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			int random = (int)(Math.random()*(max - min + 1)) + min;
			System.out.print(random+ " ");
		}	
	}*/
	//배열에 랜덤수 발생
	
	static void randomnum(int max, int min) {
		if (max < min) {
			int tmp = max;
			max = min;
			min = tmp;
		}
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random()*(max - min + 1)) + min;
			arr[i] = random;
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	//배열의 랜덤수 반복성x
}
