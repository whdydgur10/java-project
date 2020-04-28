package Day8;

public class ExamOverriding {

	public static void main(String[] args) {
		Duck d = new Duck();//객체 d를 만들때 Duck클래스에 기본생성자를 확인한다.
		d.cry();
		Sparrow s = new Sparrow();
		s.cry();
		s.cry(0);
		Sparrow s2 = new Sparrow(1);
		System.out.println(s.getWing());
		System.out.println(s2.getWing());

	}

}
class Bird{
	protected int wing;
	public void cry() {
		System.out.println("새가 움");
	}
	public Bird() {
		wing = 2;
	}
	public Bird(int wing) {
		this.wing = wing;
	}
	public int getWing() {
		return wing;
	}
	public void setWing(int wing) {
		this.wing = wing;
	}
}
class Duck extends Bird{
	@Override
	//protected void cry() 부모클래스에서 public이기 때문에 그보다 작은 범위인 protected는 사용할 수 없다.
	public void cry() {
		super.cry(); //오버라이딩 작업 중 부모클래스와 같은 메소드명의 메소드 호출 시 super를 사용하지 않으면 자식클래스의 메소드의 호출로 재귀호출 에러가 뜬다.
		System.out.println("오리 움");
	}//메소드 오버라이딩
	//public Duck() {super();}  생성자가 하나도 없으면 기본생성자가 자동으로 생성됨 부모클래스의 기본생성자로 됨
}//					 (생략가능)
class Sparrow extends Bird{
	public void cry(int num) {
		cry(); //부모클래스의 cry메소드 호출
		System.out.println("참새 움");
	}//메소드 오버로딩

	public Sparrow() {
		super();//부모클래스 기본생성자
	}

	public Sparrow(int wing) {
		super(wing);//부모클래스 생성자 오버로딩
	}
}
//메인 - 부모 - 자식이 있으면 자식 객체에 대해 실행할 때 자식클래스에 메소드나 생성자가 있는지 보고 없으면 부모클래스에 있는 메소드나 생성자를 가져온다. 
//메인 -> 자식 -> 부모 -> 자식 -> 메인