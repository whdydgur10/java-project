package Day54;

import java.util.*;

public class test54_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Point p = new Point();
		for(int i = 0; i < 5; i++) {
			System.out.println(p);
			System.out.println("움직일 좌표");
			System.out.print("X : ");
			int x = scan.nextInt();
			System.out.print("Y : ");
			int y = scan.nextInt();
			p.move(x, y);
		}
		System.out.println(p);
//		System.out.println(p.distance(3, 4));
		System.out.println(p.getWay());
		scan.close();
	}

}
class Point{
	private int x;
	private int y;
	private ArrayList<String> way = new ArrayList<String>();
	public void move(int x, int y) {
		String load = "("+x+","+y+")";
		this.way.add(load);
		this.x = x;
		this.y = y;
	}
	public double distance(int x, int y) {
		double res = 0;
		int disX = this.x - x;
		int disY = this.y - y;
		res = Math.pow(disX, 2.0) + Math.pow(disY, 2.0);
		return Math.sqrt(res);
	}
	public Point() {
		
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "현재위치 = (" + x + "," + y + ")";
	}
	public ArrayList<String> getWay() {
		return way;
	}
	public void setWay(ArrayList<String> way) {
		this.way = way;
	}
}