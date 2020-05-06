package Project;

import java.util.*;

public class StudentProject {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int studentNum;
		String adjustment;
		boolean conti = false;
		while (conti == false) {
			Student.manu();
			int manuNum = scan.nextInt();
			if(manuNum == 5) {
			conti = true;	
			}else {
				while (true) {
					if(manuNum == 1) {
						System.out.println("새로운 학생의 정보를 적어주세요.");
						System.out.print("학년 : ");
						String grade= scan.next(); 
						System.out.print("반 : ");
						String group=scan.next();
						System.out.print("번호 : ");
						String number=scan.next();
						System.out.print("이름 : ");
						String name=scan.next();
						Student.Student(grade, group, number, name);
						break;
					}else if(manuNum == 2) {
						Student.showStudentName();
						System.out.println("정보를 수정할 학생을 선택하세요.");
						studentNum = scan.nextInt();
						System.out.println("학생정보입니다.");
						Student.adjustmentNum = studentNum;
						Student.showStudent();
						System.out.println("수정할 항목을 입력하세요..");
						Student.adjustment = scan.next();
						System.out.println("수정 내용을 입력하세요.");
						adjustment = scan.next();
						Student.adjustmentStudent(adjustment);
						break;
					}else if(manuNum == 3) {
						Student.showStudentName();
						System.out.println("삭제할 학생정보를 선택하세요.");
						studentNum = scan.nextInt();
						Student.studentNum = studentNum;
						Student.delStudent(studentNum);
						break;		
					}else if(manuNum == 4) {
						break;
					}else if(manuNum == 5) {
						conti = false;	
					}
					else {
						System.out.println("잘못입력하셨습니다.");
						break;
					}
				}
			}
		}
		Student.showBasicStat();
		Student.showAllStudentStat();
		System.out.println("종료합니다.");
	}
}
class Student{
	static String[] basicStat = new String[] {"비고", "학년", "반", "번호", "이름", "국어", "영어", "수학", "사회", "과학"};
	static String[][] studentStat = new String[5][10];
	static int grade, group, number, studentNum = 0, adjustmentNum;
	static String name, adjustment;;
	static void manu() {
		System.out.println("설정메뉴");
		System.out.println("1.학생정보 추가");
		System.out.println("2.학생정보 수정");
		System.out.println("3.학생정보 삭제");
		System.out.println("4.학생정보 출력");
		System.out.println("5.종료");
		System.out.print("메뉴를 선택하세요. : ");
	}
	//학생정보 메뉴
	static void Student() {
		
	}
	static void Student(String grade, String group, String number, String name) {
		studentStat[studentNum][0] = "   ";
		studentStat[studentNum][1] = grade;
		studentStat[studentNum][2] = group;
		studentStat[studentNum][3] = number;
		studentStat[studentNum][4] = name;
		for(int i = 0; i < basicStat.length; i++) {
			if(studentStat[studentNum][i]==null) {
				studentStat[studentNum][i] = "x";
			}
		}
		studentNum++;
	}
	//학년,반,번호,이름 추가에 따른 전체 학생수 추가
	static void adjustmentStudent(String adjustment) {
		switch(Student.adjustment) {
		case "학년" : 
			studentStat[adjustmentNum][1] = adjustment;
			break;
		case "반" : 
			studentStat[adjustmentNum][2] = adjustment;
			break;
		case "번호" : 
			studentStat[adjustmentNum][3] = adjustment;
			break;
		case "이름" : 
			studentStat[adjustmentNum][4] = adjustment;
			break;
		case "국어" : 
			studentStat[adjustmentNum][5] = adjustment;
			break;
		case "영어" : 
			studentStat[adjustmentNum][6] = adjustment;
			break;
		case "수학" : 
			studentStat[adjustmentNum][7] = adjustment;
			break;
		case "사회" : 
			studentStat[adjustmentNum][8] = adjustment;
			break;
		case "과학" : 
			studentStat[adjustmentNum][9] = adjustment;
			break;
		default :	
			System.out.println("잘못된 입력입니다.");
		}
	}
	static void delStudent(int adjustmentNum) {
		for(int i = adjustmentNum ; i < studentNum+1; i++) {
			for(int j = 0; j < studentStat.length; j++) {
				studentStat[i][j] = studentStat[i+1][j];
			}
		}
		studentNum--;
	}
	static void showStudent() {
		for(int i = 0; i<basicStat.length; i++) {
			System.out.printf("%5s",basicStat[i]);
		}
		System.out.println();
		//비고
		for(int i = 0; i<basicStat.length; i++) {
			System.out.printf(" %3s ",studentStat[adjustmentNum][i]);
		}
		System.out.println();
		//특정학생정보배열 나타내기
	}
	static void showBasicStat() {
		for(int i = 0; i < basicStat.length; i++) {
			System.out.printf("%5s",basicStat[i]);
		}
		System.out.println();
	}
	static void showStudentName() {
		for(int i = 0; i < studentNum; i++) {
			if (studentStat[i][4] != null) {
				System.out.print(i + "." + studentStat[i][4] + " ");
			}else {
				break;
			}
		}
		System.out.println();
	}
	static void showAllStudentStat() {
		for(int i = 0; i < studentStat.length; i++) {
			if(Student.studentStat[i][0] != null) {
				System.out.printf("%4s%4s%5s%4s%5s%4s%4s%5s%4s%5s",i+1,studentStat[i][1],
						studentStat[i][2],studentStat[i][3],studentStat[i][4],
						studentStat[i][5],studentStat[i][6],studentStat[i][7],
						studentStat[i][8],studentStat[i][9]);
			}else {
				break;
			}
			System.out.println();
		}
	}
}
class Subject extends Student{
	static String language, english, math, society, science;
	static void adjustmentScore(String language, String english, String math, String society,String science) {
		studentStat[adjustmentNum][5] = language;
		studentStat[adjustmentNum][6] = english;
		studentStat[adjustmentNum][7] = math;
		studentStat[adjustmentNum][8] = society;
		studentStat[adjustmentNum][9] = science;
	}
}
