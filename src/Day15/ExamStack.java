package Day15;

import java.util.*;

public class ExamStack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(new Integer(2));
		stack.push(Integer.parseInt("3"));
		System.out.println(stack.pop());
		stack.pop();
		//pop은 마지막 요소를 반환한다. 반환하면 stack에서 사라진다.
		for(Integer tmp : stack) {
			System.out.println(tmp);
		}

	}

}
