package Day23;

import java.util.Scanner;

public class Test23_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.print(num + "은(는) 짝수입니까? : ");
		System.out.println(num % 2 == 0);
		System.out.println(is(scan));

	}
	public static boolean is(Scanner scan) {
		int num = scan.nextInt();
		System.out.print(num + "은(는) 짝수입니까? : ");
		return num % 2 == 0;
	}
}
