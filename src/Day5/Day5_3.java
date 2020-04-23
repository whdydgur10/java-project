package Day5;

import java.util.Scanner;

public class Day5_3 {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		int a, b;
		char c;
		a = scan.nextInt();
		c = scan.next().charAt(0);
		b = scan.nextInt();
		double cal = calculate(a, c, b);
		System.out.println(cal);

	}
	public static double calculate(int x, char c, int y) {
		double num = 0.0;
		if(c == '+') {
			num = x + y;
		}else if(c == '-') {
			num = x - y;
		}else if(c == '*') {
			num = x * y;
		}else if(c == '/') {
			num = x / y;
		}else if(c == '%') {
			num = x % y;
		}
		return num;*/
		
		for(int i = 0; i <= 5; i++) {
			for(int j = 0; j <= i; j++ ) {
				System.out.print((char)('a'+ j));
			}
			System.out.println();
		}
		int n1 = 3;
		int n2 = 5;
		int n3 = 1;
		for(int i = 0; i < n1; i++) {
			for(int j = 0; j < n2; j++) {
				System.out.printf("%3d",n3);
				n3++;
			}
			System.out.println();
		}
	}

}
