package Day53;

import java.util.*;

public class test53_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("성적을 입력하세요. : ");
		int grade = 80;//scan.nextInt();
		if(grade >= 95 && grade <= 100) {
			System.out.println("A+");
		}else if(grade >= 90 && grade < 95) {
			System.out.println("A");
		}else if(grade >= 85 && grade < 90) {
			System.out.println("B+");
		}else if(grade >= 80 && grade < 85) {
			System.out.println("B");
		}else if(grade >= 75 && grade < 80) {
			System.out.println("C+");
		}else if(grade >= 70 && grade < 75) {
			System.out.println("C");
		}else if(grade >= 65 && grade < 70) {
			System.out.println("D+");
		}else if(grade >= 60 && grade < 65) {
			System.out.println("D");
		}else if(grade >= 0 && grade < 60) {
			System.out.println("F");
		}else {
			System.out.println("잘못된 입력입니다.");
		}
		int num = 9;
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d\n",num,i,num*i);
		}
		char ch = ' ';
		for(; ch != 'y' && ch != 'Y' ;) {
			System.out.print("입력 : ");
			ch = 'y';//scan.next().charAt(0);
			System.out.println(ch);
		}
		System.out.println("끝");
		int num2 = 9;
		int cnt = 1;
		while(cnt < 10) {
			System.out.printf("%d X %d = %d\n",num2,cnt,num2*cnt);
			cnt++;
		}
		char ch2 = ' ';
		while(ch2 != 'y' && ch2 != 'Y') {
			System.out.print("입력 : ");
			ch2 = 'y';//scan.next().charAt(0);
		}
		int num3 = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				num3 += i;
			}
		}
		System.out.println(num3);
		scan.close();
	}
}
