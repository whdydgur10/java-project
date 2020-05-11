package Day13;

public class ExamObject1 {

	public static void main(String[] args) {
		A a1 = new A();
		//A속성을 가진 A형태의 a1
		A a2 = a1;
		//a1속성을 가진 A형태의 a2
		System.out.println(a1.num + "," + a2.num);
		a1.num = 20;
		System.out.println(a1.num + "," + a2.num);
		a2.num = 30;
		System.out.println(a1.num + "," + a2.num);
		//a1에서 만든 객체를 a2가 같이 공유한다.
		try {
			A a3 = (A) a1.clone();
			//a3는 a1의 값을 복사한다.
			a3.num = 40;
			System.out.println(a1.num + "," + a3.num);
		}catch(Exception e) {
			System.out.println("실패");
		}
		B b1 = new B();
		b1.a = new A();
		b1.a.num = 10;
		B b2 = b1.clone();
		System.out.println(b1.a.num + "," + b2.a.num);
		b2.a.num = 30;
		System.out.println(b1.a.num + "," + b2.a.num);
		A a4 = new A();
		A a5 = new A();
		System.out.println(a4.num + "," + a5.num);
		System.out.println(a4.equals(a5));
		C c = new C();
		System.out.println(c);
	}

}
/*class A implements Cloneable{
	int num;
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public A() {
		
	}
	public A(int num) {
		this.num = num;
	}
}*/
class A implements Cloneable{
	int num;
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public A() {
		
	}
	public A(int num) {
		this.num = num;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			//A클래스와 obj클래스가 다르다면
			return false;
		if(!(obj instanceof A)) {
			//obj를 A로 형변환할수 없다면
			return false;
		}
		A other = (A) obj;
		if (num != other.num)
			return false;
		return true;
	}
}
class B implements Cloneable{
	A a;
	public B clone() {
		Object obj = null;
		try {
			obj = super.clone();
		}catch(Exception e) {
			System.out.println("예외");
		}
		return (B)obj;
	}
}//얕은 복사
/*class B implements Cloneable{
	A a;
	public B clone() {
		B obj = null;
		try {
			obj = (B)super.clone();
		}catch(Exception e) {
			System.out.println("예외");
		}
		if(obj instanceof B) {
			obj.a = new A(((B)obj).a.num);
		}
		return (B)obj;
	}
}깊은복사 자주쓰임*/
class C{
	int num1, num2, num3, num4, num5;

	@Override
	public String toString() {
		return "C [num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + ", num4=" + num4 + ", num5=" + num5 + "]";
	}	
}
//자주쓰임