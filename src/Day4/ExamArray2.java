package Day4;

import java.util.Scanner;

public class ExamArray2 {

	public static void main(String[] args) {
		/*int[] arr = new int[] {1, 3, 5, 7, 2, 4, 6, 8};
		//arr변수타입과 tmp변수타입은 같아야한다.
		for(int tmp : arr) {
			System.out.println(tmp);
		}*/
		//향상된 for문 
		
		/*int[] arr1 = new int [9];
		int max = 9;
		int min = 1;
		int cout = 0;
		for(int i = 0; i <arr1.length; i++) {
			int random = (int)(Math.random() *(max - min +1)) + min;
			arr1[i] =random;
		}
		for(int tmp : arr1) {
			System.out.print(tmp + " ");
		}
		System.out.println("--중복 가능한 임의의 수를 생성하여 배열에 저장 for문");
		//중복 가능한 임의의 수를 생성하여 배열에 저장*/
		
		/*System.out.println("----------------------------------------------------------------------------------------------------------");
		int[] arr2 = new int [9];
		int max1 = 9;
		int min1 = 1;
		int cout1 = 0;
		for(int i = 0; i <arr1.length; i++) {
			int random = (int)(Math.random() *(max1 - min1 +1)) + min1;
			arr2[i] =random;
			for(cout1 = 0; cout1 < i; cout1++) {
				if(arr2[i] == arr2[cout1] ) {
					i--;
				}
			}
			cout1 = 0;
		}
		for(int tmp : arr2) {
			System.out.print(tmp + " ");
		}
		System.out.println("--중복 불가능한 임의의 수를 생성하여 배열에 저장 for 문");
		//중복 불가능한 임의의 수를 생성하여 배열에 저장 for*/
		
		/*System.out.println("----------------------------------------------------------------------------------------------------------");
		int[] arr3 = new int[9];
		int max2 = 9;
		int min2 = 1;
		int cout2 = 0;
		while(cout2 < 9) {
			int i = 0;
			int random2 = (int)(Math.random() * (max2-min2 +1) +min2);
			while(i < cout2) {
				if(random2 == arr3[i]) {
					break;
				}
				i++;
			}
			if(i == cout2) {
				arr3[cout2] = random2;
				cout2++;
			}
		}
		for(int tmp : arr3) {
			System.out.print(tmp + " ");
		}
		System.out.println("--중복 불가능한 임의의 수를 생성하여 배열에 저장 while문");
		//중복 불가능한 임의의 수를 생성하여 배열에 저장 while*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("게임을 시작하시겠습니까? 예-0, 아니오-1");
		int y = scan.nextInt();
		while(y == 0) {
			int[] arr4 = new int[4];
			int[] arr5 = new int[4];
			int max3 = 9;
			int min3 = 0;
			int cout3 = 0;
			int b = 0;
			int s = 0;
			int q = 0;
			int j = 0;
			for (int i = 0; i < arr4.length; i++) {
				int random3 = (int)(Math.random()*(max3-min3+1)+min3);
				arr4[i] = random3;
				for(cout3 = 0; cout3 < i; cout3++) {
					if(arr4[i] == arr4[cout3]) {
						i--;
						break;
					}
				}
				cout3 = 0;
			}
			/*for(int emp : arr4) {
				System.out.print(emp);
			}
			System.out.println();//정답*/
			System.out.println("숫자를 입력해주세요.");
			A : for(int i = 0; i < 5; i++) {
				s = 0;
				b = 0;
				arr5[0] = scan.nextInt();
				arr5[1] = scan.nextInt();
				arr5[2] = scan.nextInt();
				arr5[3] = scan.nextInt();
				for(j = 0; j < 4; j++) {
					if(arr5[j] == arr4[j]) {
						s++;
					}
					for( q = 0; q < 4; q++) {
						if(arr5[j] == arr4[q] && arr5[q] != arr4[q]) {
							b++;
						}
					}
					if(s == 4) {
						System.out.println("정답입니다.");
						break A;
					}
				}
				System.out.printf("S : %d, B : %d\n",s, b);
				System.out.println("숫자를 다시 입력해주세요.");
			}
			System.out.println("게임을 다시 시작하겠습니까? 예-0, 아니오-1");
			y = scan.nextInt();
			if (y == 1) {
				break;
			}
		}
		//숫자야구

	}

}
