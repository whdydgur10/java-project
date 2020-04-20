package Day1;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		System.out.print("첫번째 정수를 입력하세요. : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.print("두번째 정수를 입력하세요. : ");
		int num2 = scan.nextInt();
		int num3 = 0;
		if(num < num2) {
			num3 = num;
			num = num2;
			num2 = num3;		
		}
		System.out.println("두 값의 몫은 : " + num / num2 + "입니다.");
		System.out.println("두 값의 나머지는 : " + num % num2 + "입니다.");
		int a = num / num2;
		int c = a;
		int i = 1;
		while (c > 1 ) {
			System.out.println(i + "번째 몫은" + c + "입니다.");
			i++;
			c = num / num2;
			int b = num % num2;
			System.out.println(b);
			
		}
		String str = new String();
		str = scan.next();
		System.out.println(str);
		scan.close();
	}

}
