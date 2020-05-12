package Day14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test14_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean tu = true;
		String ch = null;
		while(tu) {
			ch = null;
			System.out.print("문양을 입력하세요. : ");
			ch = scan.next();
			Pattern p = Pattern.compile("([^\\w])");
			Matcher m = p.matcher(ch);
			if(m.matches()) {
				tu = false;
			}else {
				tu = true;
				System.out.println("문양이 아닙니다.");
				System.out.println("다시 입력하세요.");
			}
		}
		System.out.print("갯수를 입력하세요. : ");
		int num = scan.nextInt();
		show(ch, num);
		System.out.println(show2(ch, num));
		scan.close();
	}
	static void show(String ch,int num) {
		for(int i = 0; i < num; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	static String show2(String ch,int num) {
		StringBuffer res = new StringBuffer(num);
		for(int i = 0; i < num; i++) {
			res.append(ch);
		}
		return res.toString();
	}
}
