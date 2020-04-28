package Day8;

public class ExamInheritance {

	public static void main(String[] args) {
		Child c = new Child();
		c.print();//Child를 통해 Parent의 멤버 메소드 사용
		c.print2();

	}

}
class Child extends Parent{
	private int e;
	public void print2() {
		System.out.printf("a=%d, b=%d, c=%d, d=%d, e=%d\n",a, b, c, getD(), e);
		//d는 private이기 때문에 Child클래스에서 사용할 수 없지만 가져오는 함수 getD()를 이용하면 사용할 수 있다.
	}
}
class Parent{
	public int a;
	protected int b;
	int c;
	private int d;
	public void print() {
		System.out.printf("a=%d, b=%d, c=%d, d=%d\n",a, b, c, d);
	}
	public Parent() {
	}
	public Parent(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
}