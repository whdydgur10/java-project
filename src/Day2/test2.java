package Day2;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*System.out.println("가위바위보게임입니다.");
		System.out.println("0 = 주먹, 1 = 가위, 2 = 보 입니다.");
		int a = 1;
		while (a != 3) {
			int randomValue;
			randomValue = (int) (Math.random() * 3);
			//random()메소드는 반환형이 double이기 때문에 int형으로 변환을 하였다.
			System.out.print("숫자를 입력해주세요. : ");
			a = scan.nextInt();
			if (a == randomValue) {
				System.out.println("비겼습니다.");
			}else if (a == 0 && randomValue == 1) {
				System.out.println("이겼습니다.");
			}else if (a == 1 && randomValue == 2) {
				System.out.println("이겼습니다.");	
			}else if (a == 2 && randomValue == 0) {
				System.out.println("이겼습니다.");
			}else if (a == 2 && randomValue == 1) {
				System.out.println("졌습니다.");
			}else if (a == 1 && randomValue == 0) {
				System.out.println("졌습니다.");
			}else if (a == 0 && randomValue == 2) {
				System.out.println("졌습니다.");
			}
			System.out.println(randomValue);
			System.out.print("끝내고 싶으면 3을 입력하세요. : ");
			a = scan.nextInt();
		
		}
		System.out.println("게임이 끝났습니다.");*/
		
		/*System.out.print("숫자를 입력해주세요. : ");
		int num = scan.nextInt();
		
		if (num == 0) {
			System.out.println(num + " : 0입니다.");
		}else if (num > 0) {
			System.out.println(num + " : 양수입니다.");
		}else if (num < 0 ) {
			System.out.println(num + " : 음수입니다.");
		}*/
		
		/*int[] arr = new int[4];
		int b;
		for(int i = 0; i < 4; i++) {
			System.out.print("0~9중의 숫자를 입력해주세요. : ");
			b = scan.nextInt();
			arr[i] = b;
		}
		System.out.print(arr[1]);
		for(int i = 0; i < 4; i++) {
		
		}*/
		
		/*System.out.print("숫자를 입력해주세요. : ");
		int num = scan.nextInt();
		if (num % 6 == 0) {
			System.out.println(num + "은(는)6의 배수입니다.");
		}else if (num % 3 == 0) {
			System.out.println(num + "은(는)3의 배수입니다.");
		}else if(num % 2 == 0) {
			System.out.println(num + "은(는)2의 배수입니다.");
		}else {
			System.out.println(num + "은(는)2,3,6의 배수가 아닙니다.");
		}
		//if~ else if~ else~ 조건문*/
		
		/*System.out.print("숫자를 입력해주세요. : ");
		int num = scan.nextInt();
		if (num % 2 ==0) {
			if ( num % 3 == 0) {
				//1차적으로 2의 배수인가 묻고, 맞으면 2차적으로 3의 배수인지를 묻는다.
				System.out.println(num + "은(는)6의 배수입니다.");
			}else {
				System.out.println(num + "은(는)2의 배수입니다.");
			}
		}else if (num % 3 == 0) {
			System.out.println(num + "은(는)3의 배수입니다.");
		}else {
			System.out.println(num + "은(는)2,3,6의 배수가 아닙니다.");
		}*/
		//중첩 if조건문
		
		/*int i = 1;
		int j = 1;
		for (i=1; i<=7; i++) {
			System.out.println(i + "단");
			for (j=1; j<=9; j++) {
			System.out.println(i + " X " + j + " = " + (i*j));
			System.out.printf("%d X %d = %d\n", i, j, i*j);
			}
			j = 1;
		}*/
		//구구단
		
		/*int sum = 0;
		for(int i = 1; i <= 5; i++) {
			sum = sum + i;
			System.out.println(sum + " = sum + " + i);
		}
		System.out.println("1에서 5까지의 합은 : " + sum + "이다.");*/
		//수의 합
		
		System.out.print("숫자를 입력해주세요.");
		int num = scan.nextInt();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		//수의 약수
		
		scan.close();
	}
}
