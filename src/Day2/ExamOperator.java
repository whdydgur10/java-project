package Day2;

import java.util.Scanner;

public class ExamOperator {
	
	public static void main(String[] args) {
		int num1=10, num2=10;
		System.out.println("증가전 : num1 = " + num1 + ", num2 = " + num2);
		System.out.println("증가중 : ++num1 = " + ++num1 + ", num2++ = " + num2++);
		System.out.println("증가후 : num1 = " + num1 + ", num2 = " + num2);
		//위 코드에서 동작은 콘솔에 값을 출력하는 것이다.
		
		int x = ++num1;
		int y = num2++;
		//위 코드에서 저장하는것(=)이 동작이다.
		
		++num1;
		num2++;
		//위 코드에서 동작은 없다.
		
		System.out.println("-------------------------------------------");
		System.out.println("증가전 : num1 = " + num1 + ", num2 = " + num2);
		++num1;
		System.out.println("증가중 : ++num1 = " + num1 + ", ++num2 = " + num2);
		++num2;
		System.out.println("증가후 : num1 = " + num1 + ", num2 = " + num2);
		//전위형연산자
		
		System.out.println("-------------------------------------------");
		System.out.println("증가전 : num1 = " + num1 + ", num2 = " + num2);
		num1++;
		System.out.println("증가중 : ++num1 = " + num1 + ", ++num2 = " + num2);
		num2++;
		System.out.println("증가후 : num1 = " + num1 + ", num2 = " + num2);
		//후위형연산자
		
		System.out.println("-------------------------------------------");
		System.out.println("정수 연산자 정수 : " + 1/2); 
		System.out.println("실수 연산자 정수 : " + 1.0/2);
		System.out.println("자료형 변환 연산 : " + (double)1/2);
		/*System.out.println(3/0); : 에러 발생
		  System.out.println(3/0.0); : 무한대로 표시*/
		//산술 연산자
		
		System.out.println("-------------------------------------------");
		int a = 1_000_000;
		int b = 2_000_000;
		long c = (long)a * b;
		System.out.println(c);
		/* a * a / a 와 a / a * a는 같이 같은 수 있으나 큰 수면 a * a일 경우 오버플로우가 발생될 수 있으므로
		     나누기를 먼저 하는 것이 좋다.*/
		
		System.out.println("-------------------------------------------");
		char ch1 = 'A';
		char ch2 = 'A'+1;
		System.out.println(ch2);
		//상수 또는 리터럴 (변하지 않는 값)간의 연산은 실행과정동안 변하지 않는다. 'A'가 리터럴
		char ch3 = (char)(ch1+1);
		System.out.println(ch3);
		//ch1이 상수가 아니기 때문에 자료형 변환을 해주어야 한다.
		//final char ch1 = 'A';로 바꿔주면 ch1이 상수가 되어 가능하다.\
		
		System.out.println("-------------------------------------------");
		int score = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요.(0~100) : ");
		score = scan.nextInt();
		boolean isA = score >= 90 && score <= 100;
		boolean isB = score >= 80 && score <= 89;
		boolean isC = score >= 70 && score <= 79;
		boolean isD = score >= 60 && score <= 69;
		boolean isF = score >= 0 && score <= 59;
		boolean isNotScore = score < 0 || score > 100;
		System.out.println("A학점인가? : " + isA);
		System.out.println("B학점인가? : " + isB);
		System.out.println("C학점인가? : " + isC);
		System.out.println("D학점인가? : " + isD);
		System.out.println("F학점인가? : " + isF);
		System.out.println("유효한 성적인가? : " + !isNotScore);
		//비교 연산자 논리 연산자
		
		System.out.println("-------------------------------------------");
		int num3 = 12, num4 = 10;
		int num5 = num3 & num4;
		int num6 = num3 | num4;
		int num7 = num3 ^ num4;
		int num8 = ~num3;
		System.out.println("num3 & num4 = " + num5);
		System.out.println("num3 | num4 = " + num6);
		System.out.println("num3 ^ num4 = " + num7);
		System.out.println("~num3 = " + num8);
		//비트 논리 연산자
		
		System.out.println("-------------------------------------------");
		System.out.println(" 10 << 1 : " + (10 << 1));
		System.out.println(" 10 << 2 : " + (10 << 2));
		System.out.println(" 10 << 3 : " + (10 << 3));
		System.out.println(" 10 >> 1 : " + (10 >> 1));
		System.out.println(" 10 >> 2 : " + (10 >> 2));
		System.out.println(" 10 >> 3 : " + (10 >> 3));
		//비트 쉬프트 연산자
		
		System.out.println("-------------------------------------------");
		int num9 = scan.nextInt();
		System.out.println("숫자를 입력해주세요.");
		boolean isEven = (num9 % 2 == 0) ? true : false;
		System.out.println(num9 + "는 짝수입니까?" + isEven);
		scan.close();
	}

}
