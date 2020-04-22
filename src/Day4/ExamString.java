package Day4;

import java.util.Scanner;

public class ExamString {

	public static void main(String[] args) {
		/*String str = "홍길동"; //기존위치에 홍길동을 입력
		String str1 = new String("임꺽정"); //새로운 위치에 임꺽정을 입력
		String[] arr = new String[3];
		arr[0] = str; //arr[0]번에 str을 공유
		arr[1] = str1; //arr[1]번에 str1을 공유
		arr[2] = "이순신"; //arr[2]번에 이순신을 생성
		for(String s : arr) {
			System.out.print(s + " ");
		}*/
		
		String[] arr2 = new String[5];
		Scanner scan= new Scanner(System.in);
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = scan.next();
		}
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+ " ");
		}
		System.out.println();
		for(String tmp : arr2) {
			System.out.print(tmp + " ");
		}//문자 입출력
		scan.close();
	}

}
