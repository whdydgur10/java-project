package Day15;

import java.util.*;

public class ExamSet1 {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		//중복되지 않는 랜덤한 수를 저장
		int size = 3;
		int min = 1;
		int max = 9;
		while(hs.size() < size) {
			int random = new Random().nextInt(max-min+1) + min;
			System.out.print(random + " ");
			hs.add(random);
		}
		System.out.println();
		for(Integer tmp : hs) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		HashSet<Num2> hs2 = new HashSet<Num2>();
		hs2.add(new Num2(1));
		hs2.add(new Num2(1));
		//새로운 hs2라는 객체를 2개를 만들어 equals를 오버라이딩하지 않으면 서로 다른 주소를 갖는 객체로 인식이 되어서
		//오버라이딩을 해 Num2로 만들면 같은 주소를 갖는 객체로 인식하게 한다.
		for(Num2 tmp : hs2) {
			System.out.print(tmp + " ");
		}
	}
}
class Num2{
	int num;
	Num2() {
		
	}
	Num2(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Num2 [num=" + num + "]";
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
		Num2 other = (Num2) obj;
		if (num != other.num)
			return false;
		return true;
	}
	
}