package Day14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExamRegex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요. : ");
		String str2 = scan.nextLine();
		Pattern p = Pattern.compile("(\\d{6}-\\d{7})|(\\d{13})");
		//정규식 패턴으로 숫자6자리 - 숫자 7자리 또는 숫자가 13자리
		Matcher m = p.matcher(str2);
		//입력한 문자열 str2와 패턴p를 비교한다.
		if(!m.matches()) {
			System.out.println("잘못됨");
			scan.close();
			return;
		}
		if(!isValid(str2.substring(0,6))) {
			System.out.println("잘못됨");
			scan.close();
			return;
		}
		char ch1;
		if(str2.contains("-")) {
			ch1 = str2.charAt(7);
		}else {
			ch1 = str2.charAt(6);
		}
		switch (ch1) {
		case '1': case '3': case '9':
			System.out.println("해당 주민번호는 남성입니다.");
			break;
		case '2': case '4': case '0':
			System.out.println("해당 주민번호는 여성입니다.");
			break;
		case '5': case '7':
			System.out.println("해당 주민번호는 외국인 남성입니다.");
			break;
		case '6': case '8':
			System.out.println("해당 주민번호는 외국인 여성입니다.");
			break;
		}
		/*String str3[] = str2.split("-");
		char ch2 = str3[1].charAt(0);
		if(ch2 == '1' || ch2 == '3') {
			System.out.println("해당 주민번호는 남성입니다.");
		}else if (ch2 == '2' || ch2 == '4') {
			System.out.println("해당 주민번호는 여성입니다.");
		}*/
		scan.close();
	}
	public static boolean isValid(String birth) {
		if(birth == null || birth.length() != 6) {
			return false;
		}
		String sYear = birth.substring(0,2);
		String sMonth = birth.substring(2,4);
		String sDay = birth.substring(4,6);
		int year, month, day;
		try {
			year = Integer.parseInt(sYear);
			month = Integer.parseInt(sMonth);
			day = Integer.parseInt(sDay);
		}catch(Exception e) {
			return false;
		}
		int lastDay = 31;
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			lastDay = 31;
			break;
		case 4: case 6: case 9: case 11:
			lastDay = 30;
		case 2:
			lastDay = 28;
		default:
			return false;
		}
		if(day < 1 || day > lastDay) {
			return false;
		}else {
			return true;
		}
	}
}

