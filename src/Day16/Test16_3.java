package Day16;

import java.util.*;

public class Test16_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> comNum = new ArrayList<Integer>();
		//ArrayList<Integer> userNum = new ArrayList<Integer>();
		int max = 9, min = 1, cnt = 3;
		setCom(comNum, max, min, cnt);
		/*while(userNum.size() < cnt) {
			setUser(userNum, max, min);
		}
		userNum = createRandomList(cnt, max, min);
		System.out.print("숫자가 생성되었습니다.");
		for(int tmp : userNum) {
			System.out.print(tmp + " ");
		}*/
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
	}//랜덤수를 만들고 최대치와 최소치가 바뀔 경우 수를 바꿔줌
	static void setCom(ArrayList<Integer> arr, int max, int min, int cnt) {
		while(arr.size() < cnt) {
			int num = random(max, min);
			if(!arr.contains(num)) {
				arr.add(num);
			}
		}
		System.out.println("숫자가 생성되었습니다.");
	}//한번에 숫자 3개를 넣는 메소드
	/*static ArrayList<Integer> setUser(ArrayList<Integer> arr, int max, int min) {
		int num = random(max, min);
		if(!arr.contains(num)) {
			arr.add(num);
			return arr;
		}
		return arr;
	}*///한번에 숫자 1개를 넣는 메소드
	/*static ArrayList<Integer> createRandomList(int size, int max, int min) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(list.size() < size) {
			int r = random(max, min);
			if(!list.contains(r)) {
				list.add(r);
			}
		}
		return list;
	}*///리스트를 자체적으로 만드는 메소드
	static boolean match(Scanner scan, ArrayList<Integer> arr) {
		System.out.println("숫자를 입력해주세요.");
		//int cnt = 0;
		int b = 0, s = 0;
		/*while(cnt < 3) {
			int num = scan.nextInt();
			if(arr.indexOf(num) == cnt) {
				s++;
			}
			if(arr.indexOf(num) != cnt && arr.contains(num)) {
				b++;
			}
			cnt++;
		}
		System.out.printf("%ds %db\n",s,b);
		if(s == 3) {
			System.out.println("정답입니다.");
			return false;
		}else {
			return true;
		}*/
		//같은 값을 던져도 건들수 없음
		try {
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int num3 = scan.nextInt();
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
		}//같은 값을 던지면 중복오류로 판별
	}
	/*static boolean setNum(Scanner scan, int max, int min, List<Integer> list, int cnt) {
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
		try {
			while(list.size() < cnt) {
				if(num > max || num < min) {
					throw new Exception("범위를 벗어났습니다.");
				}else {
					num = random(max, min);
					if(!list.contains(num)) {
						list.add(num);
					}
				}
			}
			if(list.size() == 0) {
				return false;
			}else {
				return true;
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
			if(list.size() == 0) {
				return false;
			}else {
				return true;
			}
		}
	}*///숫자를 입력해 넣는데 중복하거나 최대치 최소치를 넘어가면 오류가 난다.
}
