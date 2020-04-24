package Day6;

import java.util.Scanner;

public class test6_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 10, num2 = 20;
		System.out.printf("num1=%d, num2=%d(main)\n", num1, num2);
		swap(num1,num2);
		//매개변수가 일반 변수이면 매개변수의 원본값이 변경되지 않는다.
		//매개변수는 복사한 값이고 일반 변수는 원본값이기 때문에 복사한 값인 매개변수를 아무리 고친다하더라도 일반변수는 그대로이다.
		System.out.printf("num1=%d, num2=%d(main)\n", num1, num2);
		int arr[] = new int[4];
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		swapArr(arr, 5);
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		//매개변수가 참조 변수이면 매개변수의 원본값을 바꿀 수 있다.
		//파일 복사는 일반 변수, 주소 복사는 참조 변수
		System.out.println();

	}
	public static void swap(int num1, int num2) {
		int tmp = num1;
		num1 = num2;
		num2 = tmp;
		System.out.printf("num1=%d, num2=%d(swap)\n", num1, num2);
	}
	//num1과 num2의 값 교환
	public static void swapArr(int[] arr, int num) {
		for(int i = 0; i <arr.length; i++) {
			arr[i] = num;
		}
	}
	//배열의 모든 값을 num로 변경한다.

}
