package Day9;

public class Test9 {

	public static void main(String[] args) {
		Shape s = new Shape();
		Shape s1 = new Shape(5, 5, 10, 10);
		//Shape클래스를 통해 s1이라는 객체를 생성하는데 객체의 변수 값이 (5, 5, 10, 10)이다.
		s1.print();
		//Shape클래스와 연결된 s1이라는 객체의 print()메소드를 실행한다.
		s1.resize(4, 5);
		//s1객체를 통해 resize()메소드를 실행하는데 매개변수가 (4, 5)이다.
		s1.move(10, 10);
		//s1객체를 통해 move()메소드를 실행하는데 매개변수가 (10, 10)이다.
		s1.print();
		Shape.number();
		Square sq1 = new Square(5, 5, 10, 10);
		Square sq2 = new Square();
		//Square클래스를 통해 sq1이라는 객체를 생성하는데 객체의 변수 값이 (5, 5, 10, 10)이다.
		sq1.print();
		//sq1객체를 통해 print()메소드를 실행한다.
		Circle c1 = new Circle(0, 0, 5);
		c1.print();
		c1.move(0, 5);
		c1.print();
		c1.resize(2);
		c1.print();
		Shape.number();

	}

}
