package Day14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExamRegex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean cur = true;
		String id = null, pwd = null, pwd2;
		while(cur) {
			System.out.print("아이디를 입력하세요. : ");
			id = scan.next();
			Pattern p = Pattern.compile("([a-zA-Z]\\w{4,9})");
			//정규식 패턴 양식
			Matcher m = p.matcher(id);
			//정규식 패턴 양식에 id를 매치
			if(m.matches()) {
				System.out.println("아이디 설정이 되었습니다.");
				cur = false;
			}else {
				System.out.println("다시 입력해주세요.");
				id = null;
			}
		}
		cur = true;
		boolean cur2 = true;
		while(cur2) {
			while(cur) {
				System.out.print("비밀번호를 입력하세요. : ");
				pwd = scan.next();
				Pattern p2 = Pattern.compile("(\\w{8,12})");
				Matcher m2 = p2.matcher(pwd);
				if(m2.matches()) {
					System.out.println("설정되었습니다.");
					System.out.print("다시 한번 입력해주세요. : ");
					cur = false;
				}else {
					System.out.println("다시 입력해주세요.");
					pwd = null;
					cur = true;
				}
			}
			pwd2 = scan.next();
			if(pwd.equals(pwd2)) {
				System.out.println("비밀번호 설정이 되었습니다.");
				cur2 = false;
			}else {
				System.out.println("틀렸습니다. 다시 설정해 주세요.");
				pwd2 = null;
				cur = true;
			}
		}
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호는 : " + pwd);
		scan.close();
	}
}
