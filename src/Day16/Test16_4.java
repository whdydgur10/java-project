package Day16;

import java.util.*;

public class Test16_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		ArrayList<Integer> user = new ArrayList<Integer>();
		int max = 45, min = 1, cnt = 6;
		makeLotto(lotto, cnt, max, min);
		int bonus = lotto.remove(cnt);
		makeUser(scan, user, cnt, max, min);
		play(lotto, user, cnt, bonus);
	}
	static int random(int max, int min) {
		if(max < min) {
			int tmp = max;
			max = min;
			min = tmp;
		}
		return new Random().nextInt(max - min +1) + min;
	}
	static void makeLotto(ArrayList<Integer> list, int cnt, int max, int min) {
		while(list.size() < cnt + 1) {
			int num = random(max, min);
			if(!list.contains(num)) {
				list.add(num);
			}
		}
		Collections.sort(list);
		System.out.println("로또번호가 생성되었습니다.");
	}
	static void makeUser(Scanner scan, ArrayList<Integer> list, int cnt, int max, int min) {
		System.out.println("번호를 입력해주세요.");
		while(list.size() < cnt) {
			int num = scan.nextInt();
			if(!(num > max) || !(num < min)) {
				if(!list.contains(num)) {
					list.add(num);
				}else {
					System.out.println("숫자가 중복됩니다.");
				}
			}
		}
		Collections.sort(list);
		//오른차순 정렬
	}
	static void match(ArrayList<Integer> list, ArrayList<Integer> list2, int cnt, int bonus) {
		int n = 0, b = 0;
		while(list2.size() > 0) {
			int num = list2.remove(cnt - 1);
			if(list.contains(num)) {
				n++;
			}else if(num == bonus) {
				b++;
			}
			cnt--;
		}
		if(n == 6) {
			System.out.print("1등");
		}else if(n == 5) {
			if(b == 1) {
				System.out.print("2등");
			}
			System.out.print("3등");
		}else if(n == 4) {
			System.out.print("4등");
		}else if(n == 3) {
			System.out.print("5등");
		}else {
			System.out.print("꽝!");
		}
		System.out.println(" 당첨");
	}
	static void play(ArrayList<Integer> list, ArrayList<Integer> list2, int cnt, int bonus) {
		System.out.print("출력된 번호 : ");
		for(Integer tmp : list) {
			System.out.printf("%4d",tmp);
		}
		System.out.println("보너스 번호 : " + bonus);
		System.out.print("입력한 번호 : ");
		for(Integer tmp : list2) {
			System.out.printf("%4d",tmp);
		}
		System.out.println();
		match(list, list2, cnt, bonus);
	}
}
