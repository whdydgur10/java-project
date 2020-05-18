package Day18;

import java.util.Scanner;

public class Test18_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
		try {
			if(num < 0) {
				throw new ArithmeticException("양의 정수를 입력하세요.");
			}else {
				if(isPrime(num) == true) {
					System.out.println(num + "은(는) 소수입니다.");
				}else {
					System.out.println(num + "은(는) 소수가 아닙니다.");
				}
			}
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		

	}
	static boolean isPrime(int num) {
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
