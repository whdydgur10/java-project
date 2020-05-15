package Day17;

import java.util.*;

public class Test17_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		char op = scan.next().charAt(0);
		int num2 = scan.nextInt();
		switch(op) {
		case '+': case '-': case '*': case '%':
			System.out.printf("%d %c %d = %.0f\n", num1, op, num2, result(num1, op, num2));
			break;
		case '/':
			System.out.printf("%d %c %d = %.1f\n", num1, op, num2, result(num1, op, num2));
			break;
		}
		scan.close();
	}
	static int sum(int num1, int num2) {
		return num1 + num2;
	}
	static int sub(int num1, int num2) {
		return num1 - num2;
	}
	static int mul(int num1, int num2) {
		return num1 * num2;
	}
	static double div(double num1, double num2) {
		return num1 / num2;
	}
	static int mod(int num1, int num2) {
		return num1 % num2;
	}
	static double result(int num1, char op, int num2) {
		switch(op) {
		case '+' :
			return sum(num1, num2);
		case '-' :
			return sub(num1, num2);
		case '*' :
			return mul(num1, num2);
		case '/' :
			return div(num1, num2);
		case '%' :
			return mod(num1, num2);
		default :
			return 0;	
		}
	}
}
