package Day15;

import java.util.*;

public class ExamArrayList {

	public static void main(String[] args) {
		ArrayList<Object> list1 = new ArrayList<Object>();
		//<>는 어떠한 객체를 저장할 것인지 적는다. 생략가능하나 적는 것이 좋다. ()안엔 크기
		ArrayList<Num> list2 = new ArrayList<Num>();
		//Num 클래스의 객체만 저장 가능한 list2를 ArrayList로 생성
		list2.add(new Num());
		//이름없는 Num클래스 객체를 추가
		list1.add(new Ch());
		//list2.add(new Ch());
		//Ch클래스는 Num클래스를 상속받지 않지만 Object클래스의 상속은 받는다.
		Object obj = new Num();
		//자식클래스에서 부모클래스는 자동형변환
		ArrayList list3 = new ArrayList();
		//일반배열 만드는 것과 동일
		list3.add(new Num(1));
		list3.add(new Ch('a'));
		for(int i = 0; i < list3.size(); i++) {
			System.out.println(list3.get(i));
		}
		for(Object tmp : list3) {
			System.out.print(tmp + " ");
		}
		//list3는 default Object에 대한것으로
		list2.add(new Num());
		list2.add(new Num(1));
		list2.add(new Num(100));
		printList(list2);
		list2.remove(new Num());
		//Num()안에 설정한 값을 지운다. equals를 오버라이드하지 않으면 제대로 작동하지 않는다.
		System.out.println("num가 0인 객체를 지운 후");
		printList(list2);
		ArrayList<Num> list4 = new ArrayList<Num>(list2);
		System.out.println("복사 생성자를 이용한 list4");
		printList(list4);
		list2.add(1,new Num(200));
		System.out.println("1번지에 200을 추가 후 list2");
		printList(list2);
		list4.clear();
		System.out.println("list4를 clear한 후 list4");
		printList(list4);
		list4.addAll(list2);
		System.out.println("list2를 list4에 추가 후 list4");
		printList(list4);
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i)+ " ");
		}
		System.out.println();
		System.out.println("iterator를 이용한 출력문");
		Iterator<Num> it = list2.iterator();
		while(it.hasNext()) {
			//0번지 보다 전부터 시작하고 다음번지가 있는지 확인
			System.out.print(it.next()+" ");
			//다음번지가 있으면 넘어가서 그 번지값 출력
		}
		System.out.println();
		list2.ensureCapacity(100);
		//list2의 용량을 최소 100만큼으로 설정한다.
		List<Num> list5 = list2.subList(0, 2);
		ArrayList<Num> list6 =new ArrayList<Num>(list2.subList(0, 2));
		//부분 리스트는 새로 만들기
		System.out.println("0번지에서 2번지 사이의 부분 리스트");
		printList(list5);
		list2.sort(new Comparator<Num>() {
			//익명 클래스 메소드에서 인터페이스를 구현할 클래스가 필요할 때 메소드의 기능이 하나뿐 일때
			@Override
			public int compare(Num o1, Num o2) {
				if(o1.num > o2.num) {
					return 1;
					//앞이 클 경우 sort에게 리턴값 1을 주어 바꾼다.
				}else if(o1.num < o2.num) {
					return -1;
					//
				}else {
				return 0;
				}
			}
		});
		System.out.println("정렬 후 list2");
		printList(list2);
	}
	private static void printList(List<Num> list5) {
		for(Num tmp : list5) {
			System.out.print(tmp + " ");
		}
		System.out.println();
	}

	private static void printList(ArrayList<Num> list2) {
		for(Num tmp : list2) {
			System.out.print(tmp + " ");
		}
		System.out.println();
	}
}
class Num{
	int num;

	@Override
	public String toString() {
		return "num=" + num ;
	}
	public Num() {
		
	}
	public Num(int num) {
		this.num = num;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Num other = (Num) obj;
		if (num != other.num)
			return false;
		return true;
	}
	
}
class Ch{
	char ch;
	public Ch() {
		
	}
	public Ch(char ch) {
		this.ch = ch;
	}

	@Override
	public String toString() {
		return "ch=" + ch;
	}
}