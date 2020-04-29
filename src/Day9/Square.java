package Day9;

public class Square extends Shape {
	public void print() {
		System.out.println("	사각형의 정보	");
		System.out.printf("시작점은 (%d,%d)\n",getLeft(),getUp());
		System.out.printf("가로 : %.2f\n",getWidth());
		System.out.printf("세로 : %.2f\n",getHeight());
		System.out.println("------------------------");
	}//메소드 오버라이딩 상위 클래스에 있는 print를 가져와 하위 클래스에서 수정

	public Square() {
		super();//생략가능
		sqNum++;
	}
	public Square(int left, int up, double width, double height) {
		//super(left, up, width, height); 부모 생성자 오버로딩 호출
		setLeft(left);
		setUp(up);
		setWidth(width);
		setHeight(height);
		sqNum++;
	}//Square란 생성자가 두개 있으므로 오버로딩이고 기본값 설정을 부모클래스에서 따올 것이므로 super를 사용한다.
	//super를 이용해 접근을 하든 set을 이용해 접근을 하는 이유는 print()메소드에서 부모클래스의 변수를 썼기 때문이다.
}
