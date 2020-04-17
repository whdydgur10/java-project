package Day1;

import java.util.Scanner;

public class ExamVariable {


	public static void main(String[] args) {
	    //main은 콘솔응용프로그램이 실행되기 위해 꼭 필요한 것(메소드,기능)
	    System.out.println("Hello world!");
	    //println : 콘솔에 원하는 문자열을 출력한 후에 엔터를 치는 것(메소드)
	    System.out.println(7+7);
	    System.out.println(""+7+7);
	    //앞에 ""이 나올 경우 뒤에 나오는 수가 문자열이 된다.
	    System.out.println(""+(7+7));
	    //앞에 ""이 있더라도 괄호 안의 사칙연산이 먼저 작동한다.
	    System.out.println();
	    System.out.print("\n");
	    //\n은 줄바꿈
	    int num1 = 10, num2 = 20;
	    System.out.printf(num1 + "," + num2 + "\n");
	    num1 = 9;
	    num2 = 11;
	    System.out.printf(num1 + "," + num2 + "\n");
	    System.out.printf("%2d,%d\n", num1, num2);
	    //%와 d사이의 숫자로 자릿수를 맞출 수 있다. ex) 2 , 4
	    double dnum = 1.23;
	    System.out.println(dnum);
	    System.out.printf("%.2f\n",dnum);
	    //%와 f사이의 소수점숫자로 소수자릿수를 맞출 수 있다. ex) .2 , .4
	    System.out.printf("%7.2f\n",dnum);

	    Scanner scan = new Scanner(System.in);
	    //scan은 변수
	    int num3 = scan.nextInt();
	    //nextint는 숫자
	    System.out.println(num3);
	    char ch = scan.next().charAt(0);
	    //next는 문자열 charAt는 몇번째 문자열을 가져올것인가
	    System.out.println(ch);
	    String str = new String();
	    //문자열을 관리하는 String 클래스
	    str = scan.next();
	    System.out.print(str);
	    
	    scan.close();
	  }
	} 
	// // : //나온 뒤 그 줄의 모든 내용을 주석 처리
	// /**/ : /*와 */사이의 내용을 주석 처리

