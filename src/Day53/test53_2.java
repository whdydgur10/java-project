package Day53;

import java.util.*;

import Day13.ExamException;

public class test53_2 {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		try {
			double num1 = scan.nextDouble();
			char ch1 = scan.next().charAt(0);
			double num2 = scan.nextDouble();
			System.out.printf("%.2f",calculator(num1,ch1,num2));
		}
		catch(InputMismatchException e) {
			System.out.println("실수와 연산자 구분 필요");
		}
//		System.out.println(sum(1,10));
	}
	public static double calculator(double num1, char ch1, double num2) throws Exception {
		switch (ch1) {
		case '+':
			return num1 + num2;
		case '-':
			return num1 - num2;
		case '*':
			return num1 * num2;
		case '/':
			if(num2 == 0) {
				throw new ArithmeticException("0으로 나눌 수 없음");
			}
			return num1 / num2;
		default:
			throw new Exception("잘못된 입력");
		}
	}
//	public static int sum(int num1, int num2) {
//		int result = 0;
//		for(;num1 <= num2; num1++) {
//			result += num1;
//		}
//		return result;
//	}
}
