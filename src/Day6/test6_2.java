package Day6;

import java.util.Scanner;

public class test6_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*int n = scan.nextInt();
		int[] arr = new int[n];
		prtArr(arr);
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		prtArr(arr);
		
	}
	public static void prtArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();*/
	
		/*int max = 20;
		int min = 1;
		int[] arr = new int[10];
		for (int i= 0 ; i < arr.length; i++) {
			int random = (int)(Math.random() * (max-min+1)) + min;
			arr[i] = random;
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					--i;
				}
			}
		}
		int num1 = scan.nextInt();
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		for (int i = 0 ; i < arr.length; i++) {
			if (arr[i] == num1) {
				System.out.printf("%d번째에 있습니다.", i+1);
				break;
			}if (i == arr.length-1) {
				System.out.println("없습니다.");
			}
		}*/
		
		/*int[] arr = new int[4];
		int num = 3;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
			if(arr[i] == num) {
				System.out.println(num + "는 있습니다.");
				break;
			}
			if(i == arr.length-1) {
				System.out.println(num + "는 없습니다.");
			}
		}*/
		int[] arr = new int[4];
		int num = 4;
		isDuplicated(arr, num);
	}
	public static boolean isDuplicated(int[] arr, int num) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
		//배열의 값이 0일수도 있다
	}
	
}
