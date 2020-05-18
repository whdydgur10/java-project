package Day18;

import java.util.*;

public class Test18_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.print("입력받을 정수의 갯수 : ");
		int cnt = scan.nextInt();
		System.out.print("정수 "+cnt+"개를 입력하세요. : ");
		for(int i = 0; i < cnt; i++) {
			int num = scan.nextInt();
			list.add(num);
		}
		System.out.print("입력 받은 정수를 거꾸로 출력 : ");
		for(int i = 0; i < cnt; i++) {
			System.out.print(list.get(list.size()-1-i) + " ");
		}//특정 주소값 보존중 출력
		System.out.println();
		System.out.println(list.size());
		System.out.print("입력 받은 정수를 거꾸로 출력 : ");
		for(int i = 0; i < cnt; i++) {
			System.out.print(list.remove(list.size()-1) + " ");
		}//특정 주소값 삭제중 출력
		System.out.println();
		System.out.println(list.size());*/
		Stack<Integer> list2 = new Stack<Integer>();
		System.out.print("입력받을 정수의 갯수 : ");
		int cnt = scan.nextInt();
		System.out.print("정수 "+cnt+"개를 입력하세요. : ");
		for(int i = 0; i < cnt; i++) {
			int num = scan.nextInt();
			list2.push(num);
		}
		System.out.print("입력 받은 정수를 거꾸로 출력 : ");
		for(int i = 0; i < cnt; i++) {
			System.out.print(list2.pop() + " ");
		}
		scan.close();
	}
}
