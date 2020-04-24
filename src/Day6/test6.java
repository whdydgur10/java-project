package Day6;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*for(int i = 0; i < 5; i++) {
			System.out.print("입력 : ");
			char ch = scan.next().charAt(0);
			if(ch == 'q') {
				System.out.println("종료합니다.");
			}else if (ch == (char)32) {
				break;
			}
			else {
				System.out.println("출력 : " + ch);
			}
		}*/
			
		/*System.out.print("점수 : ");
		int grade = scan.nextInt();
		if (grade >= 90 && grade <= 100) {
			System.out.println("성적 : A");
		}else if (grade >= 80 && grade <= 89) {
			System.out.println("성적 : B");
		}else if (grade >= 70 && grade <= 79) {
			System.out.println("성적 : C");
		}else if (grade >= 60 && grade <= 69) {
			System.out.println("성적 : D");
		}else if (grade >= 0 && grade <= 59) {
			System.out.println("성적 : F");
		}else if (grade > 100 ) {
			System.out.println("잘못된 수입니다.");
		}*/
		
		/*String[] stu = new String[] {"김", "이", "박", "유", "최"};
		for(int i = 0; i< stu.length; i++) {
			System.out.printf("%s의 성적을 입력하세요. :",stu[i]);
			int grade = scan.nextInt();
			if (grade >= 90 && grade <= 100) {
				System.out.printf("%s의 성적은 A입니다\n",stu[i]);
			}else if (grade >= 80 && grade <= 89) {
				System.out.printf("%s의 성적은 B입니다\n",stu[i]);
			}else if (grade >= 70 && grade <= 79) {
				System.out.printf("%s의 성적은 C입니다\n",stu[i]);
			}else if (grade >= 60 && grade <= 69) {
				System.out.printf("%s의 성적은 D입니다\n",stu[i]);
			}else if (grade >= 0 && grade <= 59) {
				System.out.printf("%s의 성적은 F입니다\n",stu[i]);
			}else if (grade > 100 ) {
				System.out.println("잘못된 수입니다.");
			}
		}*/
		/*for(; ;) {
			int grade = 0;
			System.out.printf("성적을 입력하세요. 종료하려면 음수를 입력하세요. :\n",grade);
			grade = scan.nextInt();
			if (grade >= 90 && grade <= 100) {
				System.out.printf("성적은 A입니다\n");
			}else if (grade >= 80 && grade <= 89) {
				System.out.printf("성적은 B입니다\n");
			}else if (grade >= 70 && grade <= 79) {
				System.out.printf("성적은 C입니다\n");
			}else if (grade >= 60 && grade <= 69) {
				System.out.printf("성적은 D입니다\n");
			}else if (grade >= 0 && grade <= 59) {
				System.out.printf("성적은 F입니다\n");
			}else if (grade > 100 ) {
				System.out.println("잘못된 수입니다.");
			}else if (grade < 0) {
				break;
			}
		}
	}
}*/
		Grade gre = new Grade();
		System.out.println("학생수를 입력하세요.");
		gre.n = scan.nextInt();
		System.out.println("학생이름을 입력하세요.");
		System.out.println(gre.n);
		for(int i = 0; i < gre.n; i++) {
			gre.stu[i] = scan.next();
		}
		System.out.println("성적을 순차적으로 입력해주세요.");
		for(int i = 0; i < gre.stu.length; i++) {
			gre.stu_gd[i] = scan.nextInt();
		}
		int num = 0;
		System.out.println("성적을 확인하시겠습니까? 예-1 아니오-2");
		num = scan.nextInt();
		if(num == 1) {
			gre.say();
		}
		scan.close();
	}

}
class Grade {
	int n;
	//n은 바뀌는데 배열에 적용이 안됌.
	/* int n = scan.nextInt();
	 * int[] num = new int[n];*/
	String[] stu = new String[n];
	int[] stu_gd = new int[stu.length];
	public void say() {
		for(int i = 0; i < stu.length; i++) {
			if (stu_gd[i] >= 90 && stu_gd[i] <= 100) {
				System.out.printf("%s의 성적은 A입니다\n",stu[i]);
			}else if (stu_gd[i] >= 80 && stu_gd[i] <= 89) {
				System.out.printf("%s의 성적은 B입니다\n",stu[i]);
			}else if (stu_gd[i] >= 70 && stu_gd[i] <= 79) {
				System.out.printf("%s의 성적은 C입니다\n",stu[i]);
			}else if (stu_gd[i] >= 60 && stu_gd[i] <= 69) {
				System.out.printf("%s의 성적은 D입니다\n",stu[i]);
			}else if (stu_gd[i] >= 0 && stu_gd[i] <= 59) {
				System.out.printf("%s의 성적은 F입니다\n",stu[i]);
			}else if (stu_gd[i] > 100 && stu_gd[i] < 0) {
				System.out.println("잘못된 수입니다.");
			}
		}
	}

}