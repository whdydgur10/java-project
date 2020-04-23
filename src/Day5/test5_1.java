package Day5;

public class test5_1 {

	public static void main(String[] args) {
		Point1.printCount();
		//p1이라는 객체 생성전이라 클래스인 Point1을 호출하여야만 printCount라는 클래스 메소드를 가져올 수 있다.
		Point1 p1 = new Point1();
		//Point1을 p1이라는 객체로 생성하여 객체인 p1을 통해 클래스 메소드를 가져올 수 있다. 
		p1.printPoint();
		p1.movePoint(1, 3);
		//movePoint 매개변수를 x = 1, y = 3으로 입력
		p1.printPoint();
		p1.setX1(2);
		//x1 = 2로 설정
		p1.printPoint();
		p1.setY1(7);
		//y1 = 7로 설정
		p1.printPoint();
		p1.printCount();
		Point1 p2 = new Point1(10,10);
		//p2라는 Point1을 선언
		p2.printPoint();
		p1.printCount();

	}

}
class Point1 {
	private int x1, y1;
	private static int count;
	//클래스변수
	public void printPoint() {
		System.out.printf("현재좌표는 (%d, %d)이다\n",x1,y1);
	}
	/* 메소드
	 * 기능 : 현재 내 좌표를 출력하는 기능
	 * 매개변수 : 없음
	 * 리턴타입 : 없음
	 * 메소드명 : printPoint*/
	public void movePoint(int x, int y) {
		x1 = x;
		y1 = y;
	}
	/* 메소드
	 * 기능 : x,y좌표가 주어지면 해당 좌표로 이동하는 기능
	 * 매개변수 : int x, int y
	 * 리턴타입 : 없음
	 * 메소드명 movePoint*/
	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getY1() {
		return y1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	//getter, setter는 멤버변수가 private인 경우 직접 멤버 변수를 건들 수 없기 때문에 이를 통해 get 가져오기,
	//set 설정하기가 가능한 메소드이다.
	public Point1() {
		count++;
	}
	//p1을 위한 기본 생성자
	//생성자가 하나도 없을 때는 기본 생성자를 생략해도 자동으로 만들어져 객체가 생성 된다.
	public Point1(int x, int y) {
		x1 = x;
		y1 = y;
		count++;
	}
	//p2를 위한 생성자 오버로딩
	//생성자 오버로딩만 있을 경우에는 기본 생성자가 자동으로 만들어지지 않는다.
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Point1.count = count;
	}
	public static void printCount() {
		//System.out.println(x1); = x1이라는 객체변수는 printcCount라는 클래스 메소드에 x1이라는 객체가 없어
		//사용할 수가 없다.
		System.out.println(count);
	}
	/* 클래스변수 static은 클래스를 만듦과 동시에 생성된다. 그 후 동작에 따라 static을 가지지않는 객체 변수가 생성된다.
	 * 그래서 객체를 선언하기 전에 클래스 메소드를 실행시키려면 객체는 없는 것이기때문에 클래스끼리 실행해야한다.
	 * 하지만 객체가 생성된 후에는 클래스 메소드는 이미 있던 것이기때문에 객체를 이용한 클래스 메소드 실행이 가능하다. 
	 * 생성순서 : 클래스 -> 클래스변수 -> 클래스메소드 -> 객체생성 -> 객체변수 -> 객체메소드
	 *   시점  : 클래스메소드 시점에서는 객체메소드를 봤을 때 없는 것이고, 객체메소드 시점에서는 클래스메소드가 있다.
	 */
}
