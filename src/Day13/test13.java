package Day13;

import java.util.Scanner;

public class test13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*System.out.print("제목을 입력하세요. : ");
		String str = scan.nextLine();
		System.out.print("단어를 입력하세요. : ");
		String str1 = scan.nextLine();
		int a = str.indexOf(str1);
		if(a != -1) {
			System.out.println("Java의 정석에는 java라는 단어가 있습니다.");
		}else {
			System.out.println("Java의 정석에는 java라는 단어가 없습니다.");
		}*/
		System.out.print("주민번호를 입력하세요. : ");
		String str2 = scan.next();
		String str3[] = str2.split("-");
		char ch = str3[1].charAt(0);
		if(ch == '1') {
			System.out.println("해당 주민번호는 남성입니다.");
		}else if (ch == '2') {
			System.out.println("해당 주민번호는 여성입니다.");
		}

	}

}
