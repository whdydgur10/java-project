package Day7;

import java.util.Scanner;

public class test7_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		/*isPrime(n);
		boolean res = isPrime(n);
		if(res == true) {
			System.out.println("소수");
		}else if(res == false) {
			System.out.println("노소수");
		}*/
		
		IsPrime ip = new IsPrime();
		ip.num = n;
		ip.isPrime();
		boolean res2 = ip.isPrime();
		if(res2 == true) {
			System.out.println("소수");
		}else if(res2 == false) {
			System.out.println("노소수");
		}
		scan.close();
	}
	/*static boolean isPrime(int num) {
		int cont = 0;
		for (int i = 2; i < num; i++) {
			//i = 2, i < num (i * i <= num) 비교횟수 줄이기
			if(num % i == 0) {
				cont++;
			}
		}
		if (cont == 0) {
			return true;
		}
		else {
			return false;
		}
	}*/
}
class IsPrime {
	public int num;
	private int cont = 0;
	
	boolean isPrime() {
		for (int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
