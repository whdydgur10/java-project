package Day14;

import static java.lang.Math.*;
//import에 static을 붙이면 Math 클래스명 생략 가능

import java.util.Scanner;

public class ExamMath {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자입력");
		try {
			double num2 = scan.nextDouble();
			throw new Exception("잘못됨");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		double num = 1.51;
		System.out.println(Math.ceil(num));
		//소수 첫째자리에서 올림
		System.out.println(Math.floor(num));
		//소수 첫째자리에서 버림
		System.out.println(Math.round(num));
		//소수 첫째자리에서 반올림
		System.out.println(Math.ceil(num*10)/10);
		System.out.println(Math.floor(num*10)/10);
		System.out.println(Math.round(num*10)/10);
		num = num * 10;
		System.out.println(Math.round(num)/10.0);
		
	}

}
