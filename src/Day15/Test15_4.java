package Day15;

import java.util.*;

public class Test15_4 {

	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<Integer>(6);
		HashSet<Integer> auto = new HashSet<Integer>();
		int bonus;
		int max = 15, min = 1, cnt = 6;
		makeArray(lotto, max, min, cnt);
		auto = makeArray(max, min, cnt);
		bonus = match(lotto, max, min);
		print(lotto);
		System.out.print("보너스 : " + bonus);
		System.out.println();
		print(auto);
		System.out.println();
		int rank =rank(lotto, bonus, auto);
		if(rank != -1) {
			System.out.println(rank+ "등 당첨!");
		}else {
			System.out.println("꽝");
		}
	}
	static int random(int max, int min) {
		if(max < min) {
			int tmp = max;
			max = min;
			min = tmp;
		}
		return new Random().nextInt(max-min+1)+min;
	}
	static int match(HashSet<Integer> lotto, int max, int min) {
		while(true) {
			int bonus = random(max, min);
			if(!lotto.contains(bonus)) {
				return bonus;
			}
		}
	}
	
	static HashSet<Integer> makeArray(HashSet<Integer> arr, int max, int min, int cnt) {
		while(cnt > arr.size()) {
			int num = random(max, min);
			arr.add(num);
		}
		return arr;
	}
	static HashSet<Integer> makeArray(int max, int min, int cnt) {
		HashSet<Integer> arr = new HashSet<Integer>(cnt);
		while(cnt > arr.size()) {
			int num = random(max, min);
			arr.add(num);
		}
		return arr;
	}	
	static void print(HashSet<Integer> arr) {
		for(Integer tmp : arr) {
			System.out.printf("%2d ",tmp);
		}
	}
	static int rank(HashSet<Integer> lotto, int bonus, HashSet<Integer> auto) {
		int cnt = 0;
		for(int tmp : lotto) {
			if(auto.contains(tmp)) {
				cnt++;
			}
		}
		switch(cnt) {
		case 6:
			return 1;
		case 5:
			if(auto.contains(bonus)) {
				return 2;
			}else {
				return 3;
			}
		case 4:
			return 4;
		case 3:
			return 5;
		}
		return -1;
	}
	
}
