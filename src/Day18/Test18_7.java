package Day18;

import java.util.*;

public class Test18_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*System.out.print("정수를 입력하세요. : ");
		int num = scan.nextInt();
		int tmp = num;
		String str = "";
		while(0 < num) {
			int num2 = num % 10;
			num = num / 10;
			str += Integer.toString(num2);
		}
		System.out.print("거꾸로한 정수 : ");
		System.out.println(str);
		int num2 = Integer.parseInt(str);
		System.out.print("결과 : ");
		System.out.print(tmp + num2);*/
		scan.close();
		String str5 = "01";
		System.out.println(str5);
		str5 += 1;
		System.out.println(str5);
		str5 += str5;
		System.out.println(str5);
		int num5 = Integer.parseInt(str5);
		System.out.println(num5);
		num5 += Integer.parseInt(str5);
		System.out.println(num5);
	}
}
