package Day13;

import java.util.Scanner;

public class ExamException5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			for(;;) {
				System.out.print("정수를 입력하세요. : ");
				int a = scan.nextInt();
			}
		}catch(Exception e) {
			System.out.println("문자를 입력했습니다.");
			e.printStackTrace();
		}
		

	}

}
