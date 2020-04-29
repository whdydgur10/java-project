package Day9;

public class Circle extends Shape {
	private double centerX, centerY;
	public void print() {
		System.out.println("	 원의 정보		");
		System.out.printf("중심점은 (%.1f,%.1f)\n",centerX,centerY);
		System.out.printf("반지름 : %.2f\n",getWidth()/2);
		System.out.println("------------------------");
	}
	public Circle() {
		ciNum++;
	}
	public Circle(int left, int up, double radius) {
		//super(left, up, radius*2(=width), radius*2(=height)); 부모 생성자에서 지역변수 4개 선언이었으므로 4개를 가져온다.
		//지역변수 4개가 선언이 되었어도 left와 up은 위에 선언이 되어 있지만 width와 height는 선언이 되어 있지 않으므로 radius로 썼다.
		setLeft(left);
		//시작점 (left.up)
		setUp(up);
		setWidth((radius*2));
		//가로 = 반지름 * 2
		setHeight(radius*2);
		//세로 = 반지름 * 2
		//원을 만들어도 기본형이 사각형에 갇혀 있으니 가로와 세로의 길이는 각각 원의 반지름 * 2이다.
		centerX = left + radius;
		//(left.up)에서 x축 좌표 오른쪽 +
		centerY = up - radius;
		//(left.up)에서 y축 좌표 아래쪽 -
		ciNum++;
	}
	public void move(int left, int up) {
		super.move(left, up);
		//move메소드에 넣는 변수가 같다.
		centerX = left + getRadius();
		centerY = up - getWidth()/2;
	}//오버라이딩(이름 변수 같음)
	public void resize(double radius) {
		resize(radius*2, radius*2);
		//resize메소드에 넣는 변수가 다르다.
		centerX = getLeft() + radius;
		centerY = getUp() - radius;
	}//오버로딩(이름 같은 변수 다름)
	public double getRadius() {
		return getWidth() / 2;
	}
	//반지름 호출
}
