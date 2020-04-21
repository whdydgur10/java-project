package Day3;

import java.util.Scanner;

public class ExamFlow2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i;
		int j;
		/*for( ; ; ) {
			System.out.println("Hello");
		}*/
		//의도적 무한루프
		
		/*int sum = 0;
		for(i = 1; i <= 5; sum++) {
			System.out.println("Hello");
		}*/
		//i값이 변경되지 않은 무한루프
		
		/*for(i = 1; i <= 5; i--) {
		System.out.println("Hello");
		}*/
		//i의 감소로 언더플로우가 발생하여 정수 최댓값이 될때까지 루프
		
		/*for(i = 10; i <= 5; i++) {
		System.out.println("Hello");
		}*/
		//i의 값과 i의 조건이 성립되지 않아 실행되지 않는다.
		
		/*for(j = 1; j <= 5; j++) {
			System.out.println("j");
		}
		System.out.println(j);*/
		//for문 안에서 int j;로 선언하였기 때문에 for문을 벗어나면 사용할 수가 없다.
		
		/*for (i = 1; i <= 5; i++) {
			System.out.println("Hi");
				if (i == 3)
					break;
		}*/
		//break
		
		/*for (i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}*/
		//continue
		
		/*for(i = 1; i <= 3; i++) {
			for(j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		//중첩반복문
		
		/*for (i = 1; i <= 5; i++) {
			for(j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		/*Loop1 : for (i = 2; i <= 9; i++) {
			System.out.println("    " + i +"단");
			for (j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d\n", i, j, i * j);
				if(j == 5) {
					break Loop1;
				}
			}
		}*/
		//break Loop1; i * j에서 j가 5가 되면 Loop1 : for문이 끝나므로 2단의 5까지만 나온다.
		
		/*while(true) {
			System.out.println("Hi");
		}*/
		//무한루프
		
		/*int menu = 0;
		Scanner scan = new Scanner(System.in);
		while (menu != 4) {
			System.out.println("1.메뉴1");
			System.out.println("2.메뉴2");
			System.out.println("3.메뉴3");
			System.out.println("4.종료");
			System.out.println("메뉴를 입력하세요 : ");
			menu = scan.nextInt();
		}*/
		//while
		
		/*int menu = 0;
		do{
			System.out.println("1.메뉴1");
			System.out.println("2.메뉴2");
			System.out.println("3.메뉴3");
			System.out.println("4.종료");
			System.out.println("메뉴를 입력하세요 : ");
			menu = scan.nextInt();
		}while (menu != 4);*/
		//do while
		scan.close();
	}

}
