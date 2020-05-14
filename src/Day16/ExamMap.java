package Day16;

import java.util.*;

public class ExamMap {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("abcde","1234");
		//		    키           값
		map.put("abcde","12345");
		//		    키           값
		map.put("abcdef","1234");
		//		    키           값
		//하나의 키에 대한 값이 변할 때 마지막 값으로 바뀐다.
		Set set = map.entrySet();
		//entrySet은 변수 map의 키와 값을 하나로 저장한다.
		//set은 존재하는 변수 map의 키와 값들을 하나로 저장한 entrySet을 저장한다.
		//Map은 Collection의Iterator인터페이스를 사용할 수 없기 때문이다.
		
		//Set KeySet = map.keySet(); 키만 저장할 경우
		//Collection valueSet = map.values(); 값만 저장할 경우
		Iterator it = set.iterator();
		//it 은 set에 저장되어 있는 요소들을 읽어온다.
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			//Entry클래스에는 키와 값이 있다.
			System.out.println("id : " + e.getKey());
			System.out.println("pw : " + e.getValue());
		}
	}

}
