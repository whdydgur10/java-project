package Day1;

import java.util.Scanner;

public class Test1 {

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
		//System.out.println("두 값의 몫은 : " + num / num2 + "입니다.");
		//System.out.println("두 값의 나머지는 : " + num % num2 + "입니다.");
		int quo = num / num2;
		int newquo = quo;
		int i = 1;
		int [] num4 = new int[32];
		int b = 0;
		while (newquo > 0 ) {
			System.out.println(i + "번째 몫은" + newquo + "입니다.");
			int rema = quo % num2;
			System.out.println("나머지는 " + rema + "입니다.");
			quo = newquo;
			newquo = quo / num2;
			num4[b] = rema;
			b = i;
			i++;
		}
		for(int j = 0; j <= b; j++) {
			System.out.print(num4[j]);
		}
		
		/*while(num != 1) {
			num4[b++] = num % num2;
			num = num / num2;
		}
		num4[b] = num;
		for(int j = b; j > 0; j--) {
			System.out.print(num4[j]);
		}*/
		//10진수를 2진수로 바꾸는 공식
		
		//for (int j = 0; j < num4.length; j++)
		/*String str = new String();
		str = scan.next();
		System.out.println(str);*/
		scan.close();
	}

}
