package Day13;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*while(true) {
			System.out.print("제목을 입력하세요. : ");
			String str = scan.nextLine();
			if(str.equals("exit")) {
				System.out.println("종료");
				break;
			}
			System.out.print("단어를 입력하세요. : ");
			String str1 = scan.next();
			int a = str.indexOf(str1);
			if(a != -1) {
				System.out.println(str +"의 정석에는 " + str1 + "라는 단어가 있습니다.");
			}else {
				System.out.println(str +"의 정석에는 " + str1 + "라는 단어가 없습니다.");
			}
			if(str.contains(str1)) {
				System.out.println(str +"의 정석에는 " + str1 + "라는 단어가 있습니다.");
			}else {
				System.out.println(str +"의 정석에는 " + str1 + "라는 단어가 없습니다.");
			}
			scan.nextLine();
		}*/
		
		System.out.print("주민번호를 입력하세요. : ");
		String str2 = scan.nextLine();
		str2.replace("-", "");
		str2.replace(" ", "");
		if(str2.length() != 13) {
			System.out.println("잘못됨");
			scan.close();
			return;
		}
		if(!isValid(str2.substring(0,6))) {
			System.out.println("잘못됨");
			scan.close();
			return;
		}
		char ch1 = str2.charAt(6);
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
