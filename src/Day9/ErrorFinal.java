package Day9;

public class ErrorFinal {

	public static void main(String[] args) {
		final double PI = 3.141592;
		PI = 3.14;
		//final로 최종값을 입력했기 때문에 수정할 수 없다.
		//지역변수는 자동으로 초기화가 안됨
		int[] arr = new int[10];
		System.out.println(arr.length);
		arr.length = 11;
		//length가 class D에서 선언한 final length이기 때문에 수정이 안된다.
		D arr2 = new D(5);
		arr2.push(1);
		arr2.push(2);
		arr2.push(3);
		arr2.push(4);
		//arr2.push는 arr2의 0번지부터 순서대로 1, 2, 3, 4를 넣는다.
		System.out.println(arr2.get(3));
		System.out.println(arr2.get(4));
		//arr2.get은 (n)번지의 값을 받아오는데 3번지엔 4가, 4번지는 입력을 안했으므로 리턴값인 0이 출력된다.
		for(int i = 0; i < 5; i++) {
			System.out.println(arr2.pop());
		//배열의 값이 들어가있는 3번지부터 0번지까지 출력이 되고 마지막은 배열주소가 없을 때 반환되는 0이다.
		}
	

	}

}
final class A extends C{
	@Override
	public void print() {
		//C의 print()를 오버라이딩나 하이딩을 할 수 없다.
		System.out.println("A클");
	}
}
//final클래스지만 C의 자식이 될 수 있다.
//하지만 B의 부모는 될 수 없다. final 뜻 그대로 마지막이라는 뜻이기 때문이다.
class B extends A{
	
}
class C{
	final void print() {
		System.out.println("C클");
	}
}
class D{
	public final int width;
	//자동으로 초기화가 되지만 수정할 수 없기 때문에 초기값을 설정하라는 뜻으로 에러가 뜬다.
	public final int length;
	//생성자에서 length=10이라는 초기값을 입력해주었기 때문에 성립한다.
	private int arr[];
	//arr배열 생성
	private int index = 0;
	//arr배열의 주소값 설정
	public D() {
		length = 10;
		arr = new int[length];
	}
	public D(int length) {
		this.length = length;
		arr = new int[length];
	}
	public void push(int num) {
		if(index < length) {
			arr[index] = num;
			//첫 수가 1일때 arr[0]에 1, 그 다음수가 2일때 arr[1]에 2
			index++;
		}
		/*else {
			1. 안내 메세지만 처리
			2. 배열의 확장 추가
		}*/
	}
	public int get(int index) {
		if(this.index > index ) {
			//배열에 값이 들어 있는 수가 index보다 클 때
			return arr[index];
			//arr의 index만큼의 주소의 값을 리턴한다.
		}
		return 0; //잘못된 접근으로 return 0 대신 예외처리를 사용
	}
	public int pop() {
		if(index == 0) {
			return 0;//배열의 갯수가 0이면 출력할 값이 없어 예외처리로 해야한다. 일단은 0으로 리턴
		}
		index--;
		return arr[index];
		//현재 index값은 배열에 값이 들어있는 만큼이므로 3번지부터 시작한다.
	}
}