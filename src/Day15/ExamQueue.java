package Day15;

import java.util.*;

public class ExamQueue {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		// 인터페이스			   	    클래스
		q.offer(1);
		q.offer(2);
		q.offer(3);
		System.out.println(q.poll());
		q.poll();
		//poll은 첫번째 요소를 반환한다. 반환하면 Queue에서 사라진다.
		for(Integer tmp : q) {
			System.out.println(tmp);
		}

	}

}
