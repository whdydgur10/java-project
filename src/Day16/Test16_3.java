package Day16;

import java.util.*;

public class Test16_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> comNum = new ArrayList<Integer>();
		int max = 9, min = 1, cnt = 3;
		setCom(comNum, max, min, cnt);
		while (true) {
			if(match(scan, comNum) == false) {
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
	static void setCom(ArrayList<Integer> arr, int max, int min, int cnt) {
		while(arr.size() < cnt) {
			int num = random(max, min);
			if(!arr.contains(num)) {
				arr.add(num);
			}
		}
		System.out.println("숫자가 생성되었습니다.");
	}
	/*static boolean match(Scanner scan, ArrayList<Integer> arr) {
		System.out.println("숫자를 입력해주세요.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int b = 0, s = 0;
		if(num1 == num2 || num2 == num3 || num1 == num3) {
			System.out.println("숫자가 중복됩니다.");
			return true;
		}else {
			if(arr.indexOf(num1) == 0) {
				s++;
			}
			if(arr.indexOf(num2) == 1) {
				s++;
			}
			if(arr.indexOf(num3) == 2) {
				s++;
			}
			if(arr.indexOf(num1) != 0 && arr.contains(num1)) {
				b++;
			}
			if(arr.indexOf(num2) != 1 && arr.contains(num2)) {
				b++;
			}
			if(arr.indexOf(num3) != 2 && arr.contains(num3)) {
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
	}*/
	static boolean match(Scanner scan, ArrayList<Integer> arr) {
		System.out.println("숫자를 입력해주세요.");
		try {
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int num3 = scan.nextInt();
			int b = 0, s = 0;
			if(num1 == num2 || num2 == num3 || num1 == num3) {
				throw new Exception("중복된 숫자입니다.");
			}else {
				if(arr.indexOf(num1) == 0) {
					s++;
				}
				if(arr.indexOf(num2) == 1) {
					s++;
				}
				if(arr.indexOf(num3) == 2) {
					s++;
				}
				if(arr.indexOf(num1) != 0 && arr.contains(num1)) {
					b++;
				}
				if(arr.indexOf(num2) != 1 && arr.contains(num2)) {
					b++;
				}
				if(arr.indexOf(num3) != 2 && arr.contains(num3)) {
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
