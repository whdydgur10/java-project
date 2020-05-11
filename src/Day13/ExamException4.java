package Day13;

import java.util.*;

public class ExamException4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			for(;;) {
				System.out.print("문자를 입력하세요 : ");
				char ch = scan.next().charAt(0);
				if(ch == '1') {
					throw new ArithmeticException("1입니다.");
				}	
			}
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		//발생한 예외가 RuntimeException이면 메소드 옆에 발생 가능한 예외를 생략해도 되지만
		//RuntimeException이 아닌 경우는 옆에 발생 가능한 예외를 써 주어야한다.
		catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			//예외 발생과 상관없이 무조건 실행되어야 하는 코드
		}
	}

}
