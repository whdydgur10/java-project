package Day3;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int j = 0;
		/*System.out.println("최대공약수를 구하고 싶은 두 수를 입력하세요.");
		System.out.print("첫번째 숫자는 : ");
		int n = scan.nextInt();
		System.out.print("두번째 숫자는 : ");
		int n2 = scan.nextInt();
		int gcd = 0;
		for (i = 1; i <= n; i++) {
			if (n % i == 0 && n2 % i == 0) {
				gcd = i;
			}
		}
		System.out.println("두 수의 최대 공약수는 : " + gcd + "입니다.");*/
		//두 수의 최대 공약수
		
		/*for (i = 2; i <= 9; i++) {
			System.out.println("    " + i +"단");
			for (j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " +i * j);
				System.out.printf("%d X %d = %d\n", i, j, i * j);
			}
		}*/
		//구구단
		
		/*System.out.println("최소공배수를 구하고 싶은 두 수를 입력하세요.");
		System.out.print("첫번째 숫자는 : ");
		int n = scan.nextInt();
		System.out.print("두번째 숫자는 : ");
		int n2 = scan.nextInt();
		i = 1;
		while(i <= n * n2) {
			if(i % n == 0 && i % n2 == 0) {
				System.out.println(i);
				break;
			}
			i++;
		}
		n = 5, n2 = 10000;
		int cnt = 0;
		i = 1;
		while(i <= num1 * num2) {
		cnt++;
		if(i % n == 0 && i % n2 == 0) {
			System.out.printf("%d와 %d의 최소공배수 : %d, 반복횟수 : %d\n", n, n2, i, cnt);
			break;
			}
			i+=n1;
		}
		for(i = n; i <= n *n2; i++) {
			if(i % n == 0 && i % n2 == 0) {
				System.out.println(i);
				break;
			}
		}*/
		//최소공배수
		/*int num1, num2;
		System.out.println("숫자 두개를 입력하세요.");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.printf("첫번째 숫자 : %d, 두번째 숫자 : %d\n", num1, num2);
		if(num1 < num2) {
			int tmp;
			tmp = num1;
			num1 = num2;
			num2 = tmp;
			System.out.println("큰 수를 앞으로 보내면");
		}
		System.out.printf("첫번째 숫자 : %d, 두번째 숫자 : %d\n", num1, num2);*/
		
		//System.out.print("숫자를 입력하세요. : ");
		/*int n = 5;
		for (i = 1; i <= n; i++) {
			for(j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for(j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for(j = 1; j <= i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 1; i <= n; i++) {
			for(j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for(j = n-1; j >= i; j--) {
				System.out.print("*");
			}
			for(j = n-1; j-1 >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 1; i <= n; i++) {
			for(j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for(j = n-1; j >= i; j--) {
				System.out.print(" ");
			}
			for(j = n-1; j >= i; j--) {
				System.out.print(" ");
			}
			for(j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 1; i <= n; i++) {
			for(j = n-1; j >= i; j--) {
				System.out.print("*");
			}
			for(j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for(j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for(j = n-1; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		/*int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		arr1[0] = 1;
		for(i = 0; i < arr1.length; i++) {
			if(i > 0 ) {
				arr2[i] = arr1[i]+arr1[i-1];
			}
			arr2[i] = arr1[i];
			for(j = 0; j < i; j++) {
				if ( j > 0) {
					arr1[j+1] = arr2[j] + arr2[j-1];
				}
				arr1[j+1] = arr2[j];
			}
		}
		for(i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println("-----------------------------------------");
		for(i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}*/
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		arr1[0] = 1;
		j = 0;
		for(i = 0; i < arr1.length; i++) {
			if(i < 1) {
				arr2[i] = arr1[i];
				arr2[i+1] = arr1[i];
			}
			for(j = 0; j < i; j++) {
				if(i > 0) {
					arr2[i] = arr1[i]+ arr1[i-1];	
				}
				if(j < 1 ) {
					arr1[j+1] = arr2[j];
				}
				if(j > 0) {
					arr1[i] = arr2[i] + arr2[i-1];
				}
			}
		}
		for(i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		System.out.println("-----------------------------------------");
		for(i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		scan.close();
	}
}
