package Day14;

public class Test14_1 {

	public static void main(String[] args) {
		Point p = new Point();
		Point p1 = new Point(1,5);
		p.equals(2, 8);
		System.out.println(p);
		System.out.printf("%s과 %s의 거리는 %.1f입니다.\n",p,p1,p.distance(p1));
		System.out.printf("%s과 %s는 같은 점입니까? : %b\n",p,p1,p.equals(p1));
		p1.x = 0;
		p1.y = 0;
		System.out.printf("%s과 %s는 같은 점입니까? : %b\n",p,p1,p.equals(p1));
	}
}
class Point{
	int x, y;
	public void equals(int x, int y) {
		if(this.x == x && this.y == y ) {
			System.out.println("두 점이 같다.");
			System.out.println("거리는 0이다.");
		}else if(this.x == x){
			System.out.println("x축이 같다.");
			distance(x,y);
		}else if(this.y == y) {
			System.out.println("y축이 같다.");
			distance(x,y);
		}else {
			System.out.println("두 점이 다르다.");
			distance(x,y);
		}
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			//NullPointerException이 발생하는걸 막는다.
			return false;
		if (getClass() != obj.getClass())
			//비교할 obj가 Point 클래스가 아닌 경우
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Point (" + x + "," + y + ")";
	}
	Point() {
		
	}
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void distance(int x, int y) {
		double dis = Math.sqrt(Math.pow(this.x-x, 2)+Math.pow(this.y-y, 2));
		System.out.printf("두 점 사이의 거리는 %.1f이다.\n",dis);
	}
	double distance(Point other) {
		int disX = x - other.x;
		int disY = y - other.y;
		double result = (Math.sqrt(Math.pow(disX, 2) + Math.pow(disY, 2)));
		return result;
	}
}