package Day3;

import java.util.Scanner;

public class ExamArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1, n2, n3, n4, n5;
		//배열이 없으면 n개 만큼의 정보를 입력하려면 n개 만큼의 변수와 입력코드를 만들어야한다.
		int[] arr1, arr2; //arr1과 arr2는 배열
		int arr3[], arr4; //arr3은 배열 arr4는 일반 변수
		arr1 = new int [5];
		int[] arr5 = new int[5]; //
		arr1[0] = 1;
		arr1[2] = 3;
		for(int i = 0; i <arr1.length; i++) {
			arr1[i] = scan.nextInt();
			arr5[i] = arr1[i];
			if(i > 0) { 
				arr1[i] = arr1[i]+arr1[i-1];
			}
		}
		for(int i = 0; i <arr1.length; i++) {
			int temp = arr1[i];
			arr1[i] = arr5[i];
			arr5[i] = temp; //각 0번째, 1번째 등 변수를 바로 옮기기 때문에 temp는 배열로 만들필요는 없다.
			System.arraycopy(arr1, 0, arr5, 0, arr1.length);
						 //복사할 배열, 몇번째부터, 복사받을 배열, 몇번째부터, 길이(길이-몇번째부터)
			System.out.print(arr5[i] + " ");
		}
		System.out.println();
		System.out.println("----------------------------");
		for(int i = 0; i <arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println("----------------------------");
		arr2 = new int[] {1, 2, 3, 4, 5};
		arr3 = new int[] {2, 4, 6, 8, 10};
		//arr2 = arr3; arr3가 만든 배열을 arr2와 arr3가 공유하게 됨 arr2의 배열이 사라짐
		System.arraycopy(arr2, 0, arr3, 0, arr2.length-1);
		for(int i = 0; i <arr1.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		scan.close();
	}
}
