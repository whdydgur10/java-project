package Day2;

import java.util.Scanner;

public class ExamFlow {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			/*System.out.print("숫자를 입력해주세요 : ");
			int num = scan.nextInt();
			if (num == 0) {
				System.out.println("0입니다.");
			}else if (num % 2 == 1) { //else if (num % 2 != 0){
				System.out.println(num + " :은(는) 홀수입니다.");
			}else {
				System.out.println(num + " :은(는) 짝수입니다.");
			}*/
			//if~ else if~ else~ 조건문*/
			
			/*System.out.print("숫자를 입력해주세요 : ");
			int num1 = scan.nextInt();
			switch(num1 % 2) {
			case 0:
				System.out.println(num1 + "은(는) 짝수입니다.");
				break;
			case 1:
				System.out.println(num1 + "은(는) 홀수입니다.");
				break;
			}*/
			//case조건문
			
			/*System.out.print("원하는 달을 입력해주세요. : ");
			int month = scan.nextInt();
			switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println("마지막 날은 31일입니다.");
				break;
			case 2:
				System.out.println("마지막 날은 28일입니다.");
				break;
			case 4: case 6: case 9: case 11:
				System.out.println("마지막 날은 30일입니다.");
				break;
			//default :
			//	System.out.println("마지막 날은 28일입니다.");
			}*/
			
			/*int min = 0;
			int max = 10;
			int random = 0;
			random = (int)(Math.random() * (max-min+1)) + min;
			System.out.println(random);
			random = (int)(Math.random() * (max-min+1)) + min;
			System.out.println(random);
			random = (int)(Math.random() * (max-min+1)) + min;
			System.out.println(random);*/
			//랜덤 함수 생성
			
			/*for (int i=1; i<=5; i++) {
				System.out.println("Hello World");
			}
			System.out.println("------------------------------");
			for (int i=1; i<=5; i++) {
				System.out.println("Hello World");
			}*/
			
			scan.close();
		}
}
