package Day5;

//import Day4.test4;
import Day5_1.*;

public class ExamClass {

	public static void main(String[] args) {
		//int res = sum(1, 2);
		//char res2 = sum(1,2); sum의 자료형이 int이다.
		//System.out.println(res);
		
		//test4.main(null);
		ExamDefaultClass.main(null);
		//ExamDefaultClass2.main(null); 
		//접근제한자가 default이기때문에 Day5_1패키지가 아닌 Day5패키지에는 불러올 수 없다.
		Point p1 = new Point();
		//p1 = new Point(1);
		//매개변수 1개에 대한 생성자가 없다.
		p1 = new Point(1,2);
		p1.x1 = 10;
		//p1.x1은 default이기 때문에 Point와 같은 패키지인 ExamClass에서 쓸 수 있다.
		//p1.x2는 private이기 때문에 Point와 다른 클래스인 ExamClass에서도 쓸 수 없다.
		p1.x3 = 10;
		//p1.x3는 public이기 때문에 누구든지 사용 가능하다.
		
	}
}
//Point : 2차원 좌표평면에서 점 1개를 나타내는 클래스
class Point{
	int x1;//x축의 좌표
	int y1;//y촉의 좌표
	private int x2;
	private int y2;
	public int x3;
	public int y3;
	public Point() {
		x1 = x2 = x3 = 0;
		y1 = y2 = y3 = 0;
		System.out.println("Point의 기본 생성자 호출");
	}
	//기본값으로 0이 설정되어 있다.
	public Point(int x, int y) {
		x1 = x2 = x3 = x;
		y1 = y2 = y3 = y;
		System.out.println("Point의 생성자 오버로딩 호출");
	}
	//생성자 오버로딩
		/* 기능 : 두 정수의 합을 알려주는 메소드
		 * 매개변수 : 두 정수 => int num1, int num2
		 * 리턴타입 : 합 => 정수 => int
		 * 메서드명 : sum
		 */
	public static int sum(int num1, int num2) {
		return num1 + 
				num2;
		//메서드를 종료하고 값을 전달한다. 메서드 sum을 통해 알고 싶은 결과
	}
	
}