package Day23;

import java.text.SimpleDateFormat;
import java.util.*;

public class ExamDate2 {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.add(Calendar.DATE, 7);
		//현재를 기준으로 7일 후
		Date today = date.getTime();
		//7일 후인 날짜를 변수에 입력
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(format.format(today));
		//yyyy년 MM월 dd일 포맷에 맞춘 7일 후인 날짜 변수 출력
		format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		System.out.println(format.format(today));
		//많이 쓰는 포맷
	}

}
