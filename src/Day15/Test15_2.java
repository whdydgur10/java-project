package Day15;

import java.util.*;

public class Test15_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//ArrayList<String> list = new ArrayList<String>();
		ArrayList<Do> doList = new ArrayList<Do>();
		char asw = 'y';
		while (asw == 'y') {
			System.out.print("오늘의 할일을 추가하시겠습니까?(y/n) : ");
			asw = scan.next().charAt(0);
			scan.nextLine();
			if(asw == 'y') {
				System.out.print("오늘의 할일을 입력하세요. : ");
				String doIt = scan.nextLine();
				doList.add(new Do(doIt));
				//리스트에 추가할 때 ()값을 가진 새로운 객체를 만들어 내니까 생성자는 필수
				//list.add(doIt);
			}
		}
		//for(int i = 0; i < list.size(); i++) {
		//	System.out.println(i+1 + ". " + list.get(i));
		//}
		printList(doList);
		System.out.println("프로그램을 종료합니다.");
		scan.close();
	}
	private static void printList(ArrayList<Do> doList) {
		for(int i = 0; i < doList.size(); i++) {
			System.out.println(i+1 +". "+ doList.get(i));
			//ArrayList를 불러올 땐 변수명.get(인덱스값)으로 가져온다.
		}
	}
}
class Do{
	String doIt = new String();
	
	@Override
	public String toString() {
		return doIt;
	}
	//오버라이드를 하지 않으면 값을 불러낼 수 없다.
	Do() {
		
	}
	Do(String doIt) {
		this.doIt = doIt;
	}
}