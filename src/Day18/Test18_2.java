package Day18;

import java.util.Scanner;

public class Test18_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		setGrade(scan);

	}
	static void setGrade(Scanner scan) {
		System.out.println("성적을 입력해주세요.");
		int grade = scan.nextInt();
		if(grade >= 90 && grade <= 100) {
			System.out.println("A학점");
		}else if(grade >= 80 && grade < 90) {
			System.out.println("B학점");
		}else if(grade >= 70 && grade < 80) {
			System.out.println("C학점");
		}else if(grade >= 60 && grade < 70) {
			System.out.println("D학점");
		}else if(grade >= 0 && grade < 60) {
			System.out.println("F학점");
		}else {
			System.out.println("성적을 잘못입력했습니다.");
		}
	}

}
