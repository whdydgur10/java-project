package Day18;

import java.util.Scanner;

public class Test18_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수를 입력해주세요.");
		System.out.print("첫번째 : ");
		int num1 = scan.nextInt();
		System.out.print("두번째 : ");
		int num2 = scan.nextInt();
		try {
			if(num1 < 0 || num2 < 0) {
				throw new ArithmeticException("양의 정수를 입력하세요.");
			}else {
				if(isCoprime(num1, num2) == true) {
					System.out.println("서로소입니다.");
				}else {
					System.out.println("서로소가 아닙니다.");
				}
			}
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
	static boolean isCoprime(int num1, int num2) {
		if(num1 > num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		for(int i = 2; i <= num2; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				return false;
			}
		}
		return true;
	}
}
