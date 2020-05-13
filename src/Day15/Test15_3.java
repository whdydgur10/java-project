package Day15;

import java.util.*;

public class Test15_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[6];
		int max = 45;
		int min = 1;
		int cnt = 6;
		int[] auto = null;
		int bonus;
		try {
			createRandomArray(max, min, lotto);
			auto = createRandomArray(max, min, cnt);
			bonus = min -1;
			while(!(bonus >= min && bonus <= max)) {
				bonus = random(max, min);
				if(contains(lotto, bonus)) {
					bonus = min -1;
				}
			}
			printArray(lotto);
			System.out.println("보너스 : "+ bonus);
			printArray(auto);
			System.out.println();
			int rank =rank(lotto, bonus, auto);
			if(rank != -1) {
				System.out.println(rank+ "등 당첨!");
			}else {
				System.out.println("꽝");
			}
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		scan.close();
	}
	static int random(int max, int min) {
		if (max < min) {
			throw new ArithmeticException("예외 : 최댓값과 최소값의 순서가 바뀌었습니다.");
		}
		return new Random().nextInt(max-min+1)+min;
	}
	static boolean contains(int arr[], int num) {
		for(int tmp : arr) {
			if(tmp == num) {
				return true;
			}
		}
		return false;
	}
	static void createRandomArray(int max, int min, int arr[]) throws Exception, NullPointerException{
		//최대값 최소값 배열
		if(arr == null) {
			throw new NullPointerException("예외 : 빈 배열입니다.");
		}
		if(arr.length > max-min +1) {
			throw new Exception("예외 : 랜덤한 수의 범위보다 배열의 크기가 큽이다.");
		}
		int cnt = 0;
		while(cnt < arr.length) {
			int num = random(max, min);
			if(!contains(arr, num)) {
				arr[cnt] = num;
				cnt++;
			}
		}
	}
	static int[] createRandomArray(int max, int min, int cnt) throws Exception {
		if(cnt > max-min +1) {
			throw new Exception("예외 : 랜덤한 수의 범위보다 배열의 크기가 큽이다.");
		}
		int[] arr = new int[cnt];
		int nowCnt = 0;
		while(nowCnt < arr.length) {
			int num = random(max, min);
			if(!contains(arr, num)) {
				arr[nowCnt] = num;
				nowCnt++;
			}
		}
		return arr;
	}
	static void printArray(int[] array) {
		for(int tmp : array) {
			System.out.printf("%2d ",tmp);
		}
	}
	static int rank(int[] lotto, int bonus, int[] auto) {
		int same = 0;
		for(int tmp : lotto) {
			if(contains(auto, tmp)) {
				same++;
			}
		}
		switch(same) {
		case 6:
			return 1;
		case 5:
			if(contains(auto, bonus)) {
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