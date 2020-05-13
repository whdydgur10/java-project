package Day15;

import java.util.*;


public class ExamSet2 {

	public static void main(String[] args) {
		HashSet<Integer> hs1 = new HashSet<Integer>();
		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs1.add(1);
		hs1.add(3);
		hs1.add(2);
		hs2.add(1);
		hs2.add(4);
		hs2.add(3);
		Iterator<Integer> it1 = hs1.iterator();
		Iterator<Integer> it2 = hs2.iterator();
		int i = 1;
		while(it1.hasNext() && it2.hasNext()) {
			Integer num1 = it1.next();
			Integer num2 = it2.next();
			if(num1.equals(num2)) {
				System.out.println(i + "번째로 가져온 두 값"+ num1 + "은 같습니다.");
			}else { 
				System.out.println(i + "번째로 가져온 두 값" + num1 + "과" + num2 + "는 다릅니다.");
			}
			i++;
		}

	}

}
