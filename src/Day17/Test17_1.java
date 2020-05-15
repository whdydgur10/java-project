package Day17;

import java.util.*;

public class Test17_1 {
	public static void main(String[] args) {
		Test17.set(20, 1);
		Test17.play();
	}
}
//Test16_3내용을 클래스를 나눔
class Test17 {
	static int min = 1, max = 9, strike = 0, ball = 0, cnt = 3;
	static ArrayList<Integer> comNum = new ArrayList<Integer>();
	
	public static void set(int max, int min) {
		Test17.max = max;
		Test17.min = min;
	}
	public static void play() {
		Scanner scan = new Scanner(System.in);
		setCom();
		while (true) {
			if(match(scan) == false) {
				break;
			}
		}
		scan.close();
	}
	static int random(int max, int min) {
		if(max < min) {
			int tmp = max;
			max = min;
			min = tmp;
		}
		return new Random().nextInt(max - min +1 ) + 1;
	}
	private static int random() {
		if(max < min) {
			int tmp = max;
			max = min;
			min = tmp;
		}
		return new Random().nextInt(max - min +1 ) + 1;
	}
	static void setCom() {
		while(comNum.size() < cnt) {
			int num = random();
			if(!comNum.contains(num)) {
				comNum.add(num);
			}
		}
		System.out.println("숫자가 생성되었습니다.");
	}
	static boolean match(Scanner scan) {
		System.out.println("숫자를 입력해주세요.");
		int b = 0, s = 0;
		try {
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int num3 = scan.nextInt();
			if(num1 == num2 || num2 == num3 || num1 == num3) {
				throw new Exception("숫자가 중복 되었습니다.");
			}else {
				if(comNum.indexOf(num1) == 0) {
					s++;
				}
				if(comNum.indexOf(num2) == 1) {
					s++;
				}
				if(comNum.indexOf(num3) == 2) {
					s++;
				}
				if(comNum.indexOf(num1) != 0 && comNum.contains(num1)) {
					b++;
				}
				if(comNum.indexOf(num2) != 1 && comNum.contains(num2)) {
					b++;
				}
				if(comNum.indexOf(num3) != 2 && comNum.contains(num3)) {
					b++;
				}
			}
			System.out.printf("%ds %db\n",s,b);
			if(s == 3) {
				System.out.println("정답입니다.");
				return false;
			}else {
				return true;
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return true;
		}
	}
}
