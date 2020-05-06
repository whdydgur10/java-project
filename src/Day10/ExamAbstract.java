package Day10;

public class ExamAbstract {

	public static void main(String[] args) {
		

	}

}
abstract class A{
//추상 클래스
	int a;
	public void print() {
		System.out.println(a);
	}
	public abstract void test();
	//추상메소드
}
class B extends A{
	public void test() {

	}
	//추상메소드 구현 필수
}