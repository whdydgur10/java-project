package Day5_1;

public class ExamDefaultClass {
//클래스에 접근제한자 public이 붙는 이유
// -파일명과 클래스 이름이 같은 경우에만 public이 붙을 수 있다.
	public static void main(String[] args) {
		System.out.println("접근제한자 : public");
		

	}

}
class ExamDefaultClass2 {
//접근 제한자가 Default이기 때문에 Day5_1 패키지 안에서만 사용가능하다.
	public static void main(String[] args) {
		System.out.println("접근제한자 : default");
	}
}