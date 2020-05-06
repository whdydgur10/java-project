package Project;

import java.util.*;

public class StudentProject {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int studentNum, adjustmentNum;
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
						Student.studentNum++;
						break;
					}else if(manuNum == 2) {
						Student.showStudentName();
						System.out.println("정보를 수정할 학생을 선택하세요.");
						studentNum = scan.nextInt() - 1;
						System.out.println("학생정보입니다.");
						Student.adjustmentNum = studentNum;
						Student.showStudent();
						Student.adjustmentManu();
						adjustmentNum = scan.nextInt();
						if(adjustmentNum == 1) {
							System.out.print("수정할 항목을 입력하세요. : ");
							Student.adjustment = scan.next();
							System.out.print("수정 내용을 입력하세요. : ");
							adjustment = scan.next();
							Student.adjustmentStudent(adjustment);
							break;
						}else if(adjustmentNum == 2) {
							System.out.print("국어 : ");
							String language= scan.next(); 
							System.out.print("영어 : ");
							String english=scan.next();
							System.out.print("수학 : ");
							String math=scan.next();
							System.out.print("사회 : ");
							String society=scan.next();
							System.out.print("과학 : ");
							String science=scan.next();
							Subject.adjustmentScore(language, english, math, society, science);
							break;
						}
					}else if(manuNum == 3) {
						Student.showStudentName();
						System.out.println("삭제할 학생정보를 선택하세요.");
						studentNum = scan.nextInt() - 1;
						Student.delStudent(studentNum);
						break;		
					}else if(manuNum == 4) {
						Student.showBasicStat();
						Student.showAllStudentStat();
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
		School.showClassStudentNum();
		System.out.println("종료합니다.");
	}
}
class School{
	static int schoolStudentNum, classStudentNum1, classStudentNum2, classStudentNum3;
	static void showSchoolStudentNum() {
		schoolStudentNum = classStudentNum1 + classStudentNum2 + classStudentNum3;
		System.out.println("학교 학생 수 : " + schoolStudentNum);
	}
	static void showClassStudentNum() {
		System.out.println("1학년 학생 수 : " + classStudentNum1);
		System.out.println("2학년 학생 수 : " + classStudentNum2);
		System.out.println("3학년 학생 수 : " + classStudentNum3);
	}
	
}
class Student extends School{
	static int grade, group, number, studentNum = 0, adjustmentNum;
	static String name, adjustment;;
	static String[] basicStat = new String[] {"비고", "학년", "반", "번호", "이름", "국어", "영어", "수학", "사회", "과학"};
	static String[][] studentStat = new String[10][10];
	static void manu() {
		System.out.println("설정메뉴");
		System.out.println("1.학생정보 추가");
		System.out.println("2.학생정보 수정");
		System.out.println("3.학생정보 삭제");
		System.out.println("4.학생정보 출력");
		System.out.println("5.종료");
		System.out.print("메뉴를 선택하세요. : ");
	}
	static void adjustmentManu() {
		System.out.println("수정할 항목을 선택하세요.");
		System.out.println("1.학생정보");
		System.out.println("2.학생성적");
	}
	static void Student() {
		
	}
	static void Student(String grade, String group, String number, String name) {
		studentStat[studentNum][0] = " ";
		studentStat[studentNum][1] = grade;
		studentStat[studentNum][2] = group;
		studentStat[studentNum][3] = number;
		studentStat[studentNum][4] = name;
		if(studentStat[studentNum][1].equals("1")) {
			classStudentNum1++;
		}else if(studentStat[studentNum][1].equals("2")) {
			classStudentNum2++;
		}else if(studentStat[studentNum][1].equals("3")) {
			classStudentNum3++;
		}
		for(int i = 0; i < studentNum; i++) {
			for(int j = studentNum; j < 4; j++) {
				if(studentStat[i][1].equals(studentStat[j][1])  && studentStat[i][2].equals(studentStat[j][2]) && studentStat[i][3].equals(studentStat[j][3])) {
					System.out.println("학생정보가 중복됩니다.");
					System.out.println(studentNum);
					delStudent(j);
					break;
				}
			}
		}
		for(int i = 0; i < basicStat.length; i++) {
			if(studentStat[studentNum][i]==null) {
				studentStat[studentNum][i] = "x";
			}
		}
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
		default :	
			System.out.println("잘못된 입력입니다.");
		}
	}
	static void delStudent(int adjustmentNum) {
		if(studentStat[adjustmentNum][1].equals("1")) {
			classStudentNum1--;
		}else if(studentStat[adjustmentNum][1].equals("2")) {
			classStudentNum2--;
		}else if(studentStat[adjustmentNum][1].equals("3")) {
			classStudentNum3--;
		}
		for(int i = adjustmentNum ; i <= studentNum; i++) {
			for(int j = 0; j < basicStat.length; j++) {
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
		System.out.printf("%3s%4s%4s%4s%4s%4s%4s%4s%4s%4s",studentNum,studentStat[adjustmentNum][1],
				studentStat[adjustmentNum][2],studentStat[adjustmentNum][3],studentStat[adjustmentNum][4],
				studentStat[adjustmentNum][5],studentStat[adjustmentNum][6],studentStat[adjustmentNum][7],
				studentStat[adjustmentNum][8],studentStat[adjustmentNum][9]);
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
				System.out.print((i + 1) + "." + studentStat[i][4] + " ");
			}else {
				break;
			}
		}
		System.out.println();
	}
	static void showAllStudentStat() {
		for(int i = 0; i < studentStat.length; i++) {
			if(Student.studentStat[i][0] != null) {
				System.out.printf("%3s%4s%4s%4s%4s%4s%4s%4s%4s%4s",i+1,studentStat[i][1],
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
