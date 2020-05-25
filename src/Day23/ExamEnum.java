package Day23;

import java.util.Scanner;

public class ExamEnum {

	public static void main(String[] args) {
		//열거형 : 서로 관련된 상수를 편리하게 선언하기 위한 것
		Type t = null;
		//t는 열거형의 있는 내용 중 교통비로 초기화한다.
		Scanner scan = new Scanner(System.in);
		Type arr[] = Type.values();
		do {
			int cnt = 1;
			System.out.println("분류 리스트");
			for(Type tmp : arr) {
				System.out.println(cnt + "." + tmp);
				cnt++;
			}
			System.out.print("분류를 입력하세요. : ");
			String type = scan.next();
			//type을 콘솔에서 초기화한다.
			//열거형에 있는 모든 값들 각각을 하나의 열거형으로 만들어서 배열을 만듬
			for(Type tmp : Type.values()) {
				if(tmp.toString().equals(type)) {
					t = Type.valueOf(type);
					//t는 type과 열거형 Type과 비교하여 있으면 그 값으로 초기화한다.
				}
			}
		}while(t == null);
		System.out.println(t);
		scan.close();
	}

}
enum Type{
	통신비, 식비, 교통비, 주거비
}