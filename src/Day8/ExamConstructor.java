package Day8;

public class ExamConstructor {
	public static void main(String[] args) {
		Point point = new Point();//기본생성자로 point생성
		point.print();
		Point point1 = new Point(1, 2);//생성자 오버로딩으로 x = 1, y =2 값을 가진 point1생성
		point1.print();
		Point point2 = new Point(point1);//복사 생성자로 point1의 값을가진 point2생성
		point2.print();
		display("Hello" , "World", "Korea");
		int num1;
		int num2 = 10;
		num1 = num2;//num1은 num2로 초기화하고 num2는 num1의 초기화에 사용했다. 
	}
	public static void display(String... strs) {
		for (String s : strs) {
			System.out.println("가변인수형태:" + s);
		}
	}
}
class Point{
	int x;
	int y;
	void print() {
		System.out.printf("(%d,%d)\n",x,y);
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point() {
		//this(0,0);
	}
	public Point(Point p) {
		this(p.x, p.y); //다른 생성자 this()를 이용할 때에는 메소드의 첫번째줄에 넣어야한다.
		//this.x = p.x;
		//this.y = p.y;
	}//복사 생성자
}
