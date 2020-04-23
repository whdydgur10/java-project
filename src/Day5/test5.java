package Day5;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x= scan.nextInt();
		char ch = scan.next().charAt(0);
		int y = scan.nextInt();
		int num = 0;
		String str = " ";
		//x와 y, 연산자를 넣는 선언
		switch(ch) {
		case '+' :
			int sum = SUM(x, y);
			num = sum;
			str = "더하기";
			break;
		case '-' :
			int sub = SUB(x, y);
			num = sub;
			str = "빼기";
			break;
		case '*' :
			int mil = MIL(x, y);
			num = mil;
			str = "곱하기";
			break;
		case '/' :
			int div = DIV(x, y);
			num = div;
			str = "나누기";
			break;
		case '%' :
			int rem = REM(x, y);
			num = rem;
			str = "나머지";
			break;
		}
		//연산자에 따른 연산식 switch문
		int gcd = GCD(x, y);
		int lcm = lcm(x, y);
		System.out.printf("%d와 %d의 %s는 %d이다\n",x,y,str,num);
		//연산자에 따른 연산식 출력
		System.out.printf("%d와 %d의 최대공약수는 %d이다\n",x,y,gcd);
		//최대 공약수 출력
		System.out.printf("%d와 %d의 최소공배수는 %d이다\n",x,y,lcm);
		//최소 공배수 출력
		
		if(isPrime(x)) {
			System.out.printf("%d은 소수이다\n",x);
		}else {
			System.out.printf("%d은 소수가 아님\n",x);
		}
		//소수인지 아닌지 판별 출력
	}
	public static int SUM(int num1, int num2) {
		int x = num1 + num2;
		return x;
	}
	public static int SUB(int num1, int num2) {
		int x = num1 - num2;
		return x;
	}
	public static int MIL(int num1, int num2) {
		int x = num1 * num2;
		return x;
	}
	public static int DIV(int num1, int num2) {
		int x = num1 / num2;
		return x;
	}
	public static int REM(int num1, int num2) {
		int x = num1 % num2;
		return x;
	}
	
	//연산자에 따른 연산식
	public static int GCD(int num1, int num2) {
		int x = 0;
		if (num1 < num2) {
			x = num1;
			num1 = num2;
			num2 = x;
		}
		for(int i = 1; i <= num1; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				x = i;
			}
		}
		if (num1 == num2) {
			x = num1;
		}
		return x;
		//최대 공약수 리턴값 x를 main메소드에서 출력
	}
	public static void LCM(int num1, int num2) {
		int x = 0;
		if (num1 < num2) {
			x = num1;
			num1 = num2;
			num2 = x;
		}
		for(int i = num1; i <= num1; i++) {
			if (i % num1 == 0 && i % num2 == 0) {
				x = i;
			}
		}
		if (num1 == num2) {
			x = num1;
		}
		System.out.println(x);
		//최소 공배수 LCM메소드에서 바로 출력
	}
	public static int lcm(int num1, int num2) {
		return num1 * num2 / GCD(num1, num2);
	}
	//최소 공배수 
	public static boolean isPrime(int num1) {
		int cont = 0;
		for(int i = 1; i <= num1; i++) {
			if (num1 % i == 0) {
				cont++;
			}
		}
		if(cont == 2) {
			return true;
		}
		return false;
	}
	//소수인지 아닌지 판별
	
}
