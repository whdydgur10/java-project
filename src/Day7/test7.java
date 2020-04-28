package Day7;

import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int start = scan.nextInt();
		int end = scan.nextInt();*/
		int n = 8, l = 9, j = 0, cont = 1;
		int num = n * l;
		int[] arr = new int[num];
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				for(j = 0; j < l; j++) {
					arr[cont-1] = cont;
					System.out.printf("%3d",arr[cont-1]);
					cont++;
				}
			System.out.println();
			}else if(i % 2 != 0) {
				cont = cont + l;
				for(j = 0; j < l; j++) {
					cont--;
					arr[cont-1] = cont;
					System.out.printf("%3d",arr[cont-1]);
				}
			cont = cont + l;
			System.out.println();
			}
		}
		/*int n = 5, l = 6, j = 0, cont = 1;
		int[][] arr = new int[n][l];
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				for(j = 0; j < l; j++) {
					arr[i][j] = cont;
					System.out.printf("%3d",arr[i][j]);
					cont++;
				}
			System.out.println();
			}else if(i % 2 != 0) {
				cont = cont + l;
				for(j = 0; j < l; j++) {
					cont--;
					arr[i][j] = cont;
					System.out.printf("%3d",arr[i][j]);
				}
			cont = cont + l;
			System.out.println();
			}
		}*/
	}
		/*int res = printMultipltable(num, start, end);
		//출력을 한 후 리턴값 판별
		if(res == 0) {
			System.out.println("0단");
		}
		//res 대신  printMultipltable(num, start, end)을 쓰면 출력 후에 리턴값을 판별한다.
		else if(res == -1) {
			System.out.println("번호 오류");
		}

	}public static int printMultipltable(int num, int start, int end) {
		int mul;
		if (num == 0) {
			return 0;
		}else if (start > end) {
			return -1;
		}
		for(int i = start; i <= end; i++) {
			mul = num * (i);
			System.out.printf("%d X %d = %d\n", num, i, mul );
		}
		return 1;
	}*/
	/*활용성이 높다 = 한계가 없다	0 => 0단이 입력됨 => 출력 안함
	 *0단일 경우  예외			1 => 정상출력
	 *시작이 큰 경우  예외			-1 = > start > end => 출력 안함*/

}
