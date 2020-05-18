package Day18;

import java.util.*;

public class Test18_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요. : ");
		int num = scan.nextInt();
		String str = "";
		while(0 < num) {
			int num2 = num % 10;
			num = num / 10;
			str += Integer.toString(num2);
		}
		System.out.print("결과 : ");
		System.out.println(str);
		scan.close();
	}
}
