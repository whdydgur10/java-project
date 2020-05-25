package Day23;

import java.util.*;

public class Test23_1 {
	//정수 5개를 입력받아 리스트에 저장하고, 저장된 값을의 합과 평균을 구하는 코드를 작성하세요.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = "1";
		int num = 1;
		System.out.println(str + 1 + num);
		System.out.println(str + (1 + num));
		ArrayList<Integer> list = new ArrayList<Integer>();
		//ArrayList<Integer>()의 괄호 : 전체 배열의 용량
		//size() : 현재 저장된 배열의 용량
		System.out.print("입력할 정수의 갯수 : ");
		int cnt = scan.nextInt();
		int sum = 0;
		for(int i = 0; i < cnt; i++) {
			System.out.print(i+1 + "번째 숫자 : ");
			list.add(scan.nextInt());
		}
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println("리스트의 합 : " + sum);
		System.out.println("리스트의 평균 : " + (double)sum / cnt);
		System.out.println("리스트의 합 : " + sum(list));
		System.out.println("리스트의 평균 : " + avg(list));
		HashSet<Integer> list2 = new HashSet<Integer>();
		while(list2.size() < cnt) {
			//System.out.print("중복되지 않는 " + list2.size()+1 + "번째 숫자 : ");
			//"중복되지 않는"이란 문자열과 list2.size()라는 정수형이 먼저 더해지면서 list2.size()가 문자열로 변형된다.
			System.out.print("중복되지 않는 " + (list2.size()+1) + "번째 숫자 : ");
			list2.add(scan.nextInt());
		}
		sum = 0;
		Iterator<Integer> it2 = list2.iterator();
		while(it2.hasNext()) {
			Integer tmp = it2.next();
			if(tmp != null) {
				sum += tmp;
			}
		}
		System.out.println("리스트2의 합 : " + sum);
		System.out.println("리스트2의 평균 : " + (double)sum / cnt);
		System.out.println("리스트2의 합 : " + sum(list2));
		System.out.println("리스트2의 평균 : " + avg(list2));
		scan.close();
	}
	public static int sum(Collection<Integer> list) {
		//Collection은 리스트와 셋을 가지므로 Collection으로 묶어두면 사용하기 편하다.
		int sum = 0;
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			Integer tmp = it.next();
			if(tmp != null) {
				sum += tmp;
			}
		}
		/*for(Integer tmp : list) {
			sum += tmp;
		}*/
		return sum;
	}
	public static double avg(Collection<Integer> list) {
		return (double)sum(list)/list.size();
	}
}
