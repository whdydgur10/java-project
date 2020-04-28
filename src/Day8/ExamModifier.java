package Day8;

public class ExamModifier {

	public static void main(String[] args) {
		final int MAX = 10;//final 변수는 상수이다.
		System.out.println(Math.PI);//상수는 대문자
		D d = new D();
		Object o1 = new Object();
		d.print(o1);
		A a = new A();
		d.print(a);
		//d.print(newA()); 

	}

}
final class A{//final 클래스는 부모가 될 수 없다. String클래스, Math클래스
	public int a;
}
class B {
	public void print() {//final 메소드는 오버라이딩 할 수 없다.
		System.out.println("B");
	}
}
class C extends B{
	public final int num; 
	public C() {
		num = 0;
	}
	public C(int num) {
		this.num = num;
	}//final 변수는 선언과 동시에 초기화해야하지만 생성자를 통해 초기화를 따로 할 수 있다.
	
}
class D{
	public void print(Object obj) {//매개변수로 클래스 Object의 객체 obj가 오면 실제 넣어주는 정보는 Object클래스의 객체도 가능하지만
		if(obj instanceof A) {	   //Object 클래스를 상속받은 자식 클래스도 가능
		//obj객체가 클래스 A로 형변환 가능한지를 확인
			System.out.println("A클래스변환");
		}else {
			System.out.println("Object");	   
		}
	}
	public void print2(B obj) {//매개변수로 클래 B의 객체 obj라서 B클래스의 객체나 B클래스를 상속받은 C객체를 매개변수로 넣어줄 수있다.
		System.out.println("B");
	}
}