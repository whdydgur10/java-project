package Day23;

import java.util.*;

public class ExamDate1 {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(2020, (10 - 1), 5);
		//월은 0부터 시작한다. 원하는 달 - 1
		System.out.println(toString(date));
		date.add(Calendar.DATE, -14);
		System.out.println(toString(date));

	}
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "-" 
				+ ((date.get(Calendar.MONTH)) + 1<10?"0":"")
				+ (date.get(Calendar.MONTH) + 1) + "-" 
				//입력한 월값 + 1
				+ ((date.get(Calendar.DATE))<10?"0":"")
				//10보다 작으면 앞에 0을 쓰고 크면 아무것도 적지 않는다.
				+ (date.get(Calendar.DATE));
						
	}
}
