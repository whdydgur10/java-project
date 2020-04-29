package Day9;

public class Shape {
	private int left;//시작점 x
	private int up;//시작점 y
	private double width;//가로의 길이
	private double height;//세로의 길이
	static protected int shapeNum, ciNum, sqNum;
	//객체를 만들면서 숫자를 세기 때문에 클래스 변수와 메소드로 만들기 전에 해주어야한다.
	//private는 일반적으로 다른 클래스에서 사용할 수 없고 getter/setter를 사용하면 다른 클래스에서도 수정가능하다.
	static public void number() {
		System.out.printf("현재까지 생성된 도형의 갯수 : %d\n", shapeNum);
		System.out.printf("원 : %d 사각형 : %d\n", ciNum, sqNum);
	}
	public void print() {
		System.out.println("	도형의 정보		");
		System.out.printf("시작점은 (%d,%d)\n",left,up);
		System.out.printf("가로 : %.2f\n",width);
		System.out.printf("세로 : %.2f\n",height);
		System.out.println("------------------------");
	}
	public void move(int left, int up) {
		this.left = left;
		this.up = up;
	}
	//move라는 객체 메소드이며 left, up이라는 지역변수를 받아 this.left, this.up으로 클래스의 left, up이라는 전역변수를 수정한다.
	public void resize(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public Shape() {
		shapeNum++;
	}
	public Shape(int left, int up, double width, double height) {
		this.left = left;
		this.up = up;
		this.width = width;
		this.height = height;
		//생성자 오버로딩 같은 이름의 메소드와 다른 매개변수의 수와 형태
		shapeNum++;
	}
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getUp() {
		return up;
	}
	public void setUp(int up) {
		this.up = up;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	//get set => private인 변수들을 다른 클래스에서 사용하기 위한 메소드이다.
}
