package Day17;

import java.util.*;

public class Test17_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//int num1 = scan.nextInt();
		//int num2 = scan.nextInt();
		int num1 = new Random().nextInt(10000) + 1;
		int num2 = new Random().nextInt(10000) + 1;
		if(num1 > num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		System.out.printf("%d와 %d의 최대공약수 : %d\n",num1, num2, gcd(num1, num2));
		System.out.printf("%d와 %d의 최소공배수 : %d\n",num1, num2, lcm(num1, num2));
	}
	static int gcd(int num1, int num2) {
		int num3 = 0;
		for(int i = 1; i < num2; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				num3 = i;
			}
		}
		return num3;
	}
	static int lcm(int num1, int num2) {
		for(int i = gcd(num1, num2); i < num1 * num2; i++) {
			if(i % num1 == 0 && i % num2 == 0) {
				return i;
			}
		}
		return num1 * num2;
	}
}
