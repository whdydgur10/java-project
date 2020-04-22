package Day4;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*String str;
		System.out.print("입력 : ");
		int num1 = scan.nextInt();
		str = scan.next(); //문자열 next()는 공백 전까지, nextLine()은 공백 포함한 한 줄 
		char ch1 = scan.next().charAt(0); //문자 0번째
		int num2 = scan.nextInt();
		System.out.println("출력 : " + num1 + " " + str + " " + ch1 + " " + num2);
		System.out.printf("%d %s %s %d\n", num1, str, ch1, num2);
		//문자형은 String의 s*/
		
		/*System.out.println("두 수와 원하는 식을 넣으세요.");
		double num1 = scan.nextDouble();
		char ch1 = scan.next().charAt(0);
		float num2 = (float)scan.nextDouble();
		
		if (ch1 == '+') {
			System.out.println(num1 + " + " + num2 +" = " + (num1 + num2));
		}else if (ch1 == '-') {
			System.out.println(num1 + " - " + num2 +" = " + (num1 - num2));
		}else if (ch1 == '/') {
			System.out.println(num1 + " / " + num2 +" = " + (num1 / num2));
		}else if (ch1 == '*') {
			System.out.println(num1 + " * " + num2 +" = " + (num1 * num2));
		}else if (ch1 == '%') {
			System.out.println(num1 + " % " + num2 +" = " + (num1 % num2));
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		System.out.printf("%3.0f %c %.3f =\n", num1, ch1, num2);
		
		switch (ch1) {
		case '+' :
			System.out.println(num1 + " + " + num2 +" = " + (num1 + num2));
			break;
		case '-' :
			System.out.println(num1 + " - " + num2 +" = " + (num1 - num2));
			break;
		case '/' :
			System.out.println(num1 + " / " + num2 +" = " + (num1 / num2));
			break;
		case '*' :
			System.out.println(num1 + " * " + num2 +" = " + (num1 * num2));
			break;
		case '%' :
			System.out.println(num1 + " % " + num2 +" = " + (num1 % num2));
			break;
		default :
			System.out.println("잘못입력하셨습니다.");
		}//연산자 입력*/
		
		/*int[] arr1 = new int[10];
		int i = 0;
		for(i = 0; i < arr1.length; i++ ) {
			arr1[i] = i + 1;
		}
		for(int tmp : arr1) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		System.out.println("------------------------------------------------");
		for(i = 0; i < arr1.length; i++) {
			if(i % 2 == 0) {
				arr1[i] = arr1[i] * 2;
			}
		}
		for(int tmp : arr1) {
			System.out.print(tmp + " ");
		}*/
		/*int[] arr2 = new int[10];
		int max = 100;
		int min = 1;
		int i = 0;
		for(i = 0; i < arr2.length; i++) {
			int random = (int)(Math.random()*(max-min+1)+min);
			arr2[i] = random;
		}
		for(int tmp : arr2) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		max = 1;
		min = 100;
		max = min = arr2[0];
		for(i = 0; i< arr2.length; i++) {
			if(arr2[i] > max) {
				max = arr2[i];
			}else if(arr2[i] < min) {
				min = arr2[i];
			}
		}
		System.out.printf("최댓값은 %d, 최솟값은 %d\n",max,min);
		//최소값 최대값 구하기*/
		
		int[] arr3 = new int[10];
		int max1 = 100;
		int min1 = 1;
		int i = 0;
		int j = 0;
		int num = 0;
		for(i = 0; i < arr3.length; i++) {
			int random = (int)(Math.random()*(max1-min1+1)+min1);
			arr3[i] = random;
		}
		System.out.print("  랜  덤  숫  자    : ");
		for(int tmp : arr3) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		for(j = 0; j < arr3.length-1; j++) {
			for(i = 0; i < arr3.length-1; i++) {
				if (arr3[i] > arr3[i+1]) {
					num = arr3[i];
					arr3[i] = arr3[i+1];
					arr3[i+1] = num;
				}
			}
			System.out.print((j+1) + "번째 바꾸기 결과 : ");
			for(i = 0; i < arr3.length; i++) {
				System.out.print(arr3[i] + " ");
			}
			System.out.println();
		}//최소값 왼쪽 최댓값 오른쪽으로 나열하기
		scan.close();
	}
}
