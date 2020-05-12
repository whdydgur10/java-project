package Day14;

import java.util.Objects;

public class ExamObjects {

	public static void main(String[] args) {
		String str = null;
		System.out.println(Objects.isNull(str));
		//str이 null인가 => true | false
		System.out.println(!Objects.isNull(str));
		System.out.println(!Objects.nonNull(str));
		String str2 = "";
		System.out.println(str.equals(str2));
		//str를 기준으로 str2와 비교하는데 str값이 없으므로 비교할 수가 없다.
		System.out.println(Objects.equals(str, str2));
		//str이란 매개변수와 str2란 매개변수를 비교하므로 str이 없다 하더라도 비교할 수 있다.

	}

}
