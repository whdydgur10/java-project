package Day10;

public class ExamanonymousClass {

	public static void main(String[] args) {
		C c = new C();
		//B를 구현한 C를 객체로 생성
		test(c);
		//test매개변수에 C를 입력
		test(new B1() {
		//인터페이스 B1을 구현한 클래스를 바로 만들어 클래스의 객체를 매개변수로 전달하여 test메소드 실행
			public void func() {
				
			}
		});

	}
	public static void test(B1 b) {
		//인터페이스 B를 요구
		
	}
	class A{
		//내부클래스
	}

}
interface B1{
	public void func();
}
class C implements B1{
	public void func() {
		
	}
}