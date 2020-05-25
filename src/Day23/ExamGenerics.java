package Day23;

public class ExamGenerics {
	//지네릭스 < > : 클래스(A) 안의 멤버 변수의 클래스(B)를 미리 지정해 놓지 않고, 클래스(A)를 생성할 때 결정해주는 것 
	public static void main(String[] args) {
		Student<Integer> s = new Student<Integer>();
		s.kor = 10;
		System.out.println(s.kor);
	}
}
class Student<T>{
	String name;
	T kor;
	T eng;
	T math;
}