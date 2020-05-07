package ProjectTest;

import java.util.*;

public class StudentProjectTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int studentNum, adjustmentNum;
		String adjustment, choice ,studentName;
		boolean conti = false;
		while (conti == false) {
			Student.manu();
			int manuNum = scan.nextInt();
			if(manuNum == 6) {
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
						System.out.println("학생정보 수정입니다.");
						System.out.println("1.등록학생순 수정 2.반별 학생 수정");
						int clst = scan.nextInt();
						if(clst == 1) {
							Student.showStudentName();
							System.out.println("정보를 수정할 학생을 선택하세요.");
							studentNum = scan.nextInt() - 1;
							System.out.println("학생정보입니다.");
							Student.adjustmentNum = studentNum;
							System.out.println(studentNum);
							Student.showStudent();
							Student.adjustmentManu();
							adjustmentNum = scan.nextInt();
							if(adjustmentNum == 1) {
								System.out.print("수정할 항목이름을 입력하세요. : ");
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
						}else if(clst == 2) {
							School.showClass();
							System.out.print("반을 입력하세요. : ");
							choice = scan.next();
							School.showClassList(choice);
							Student.showStudentName();
							
							System.out.println("정보를 수정할 학생이름을 입력하세요.");
							studentName = scan.next();
							System.out.printf("%s학생정보입니다.",studentName);
							//Student.findStudentInfo(studentName);
							Student.adjustmentManu();
							adjustmentNum = scan.nextInt();
							if(adjustmentNum == 1) {
								System.out.print("수정할 항목이름을 입력하세요. : ");
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
						}
					}else if(manuNum == 3) {
						Student.showStudentName();
						System.out.println("삭제할 학생정보를 선택하세요.");
						studentNum = scan.nextInt() - 1;
						Student.delStudent(studentNum);
						break;		
					}else if(manuNum == 4) {
						Student.showBasicInfo();
						Student.showAllStudentInfo();
						break;
					}else if(manuNum == 5) {
						School.showClass();
						System.out.print("보고싶은 반을 입력하세요. : ");
						choice = scan.next();
						School.showClassList(choice);
						break;	
					}else if(manuNum == 6) {
						conti = false;	
					}
					else {
						System.out.println("잘못입력하셨습니다.");
						break;
					}
				}
			}
		}
		Student.showBasicInfo();
		Student.showAllStudentInfo();
		School.showGradeStudentNum();
		System.out.println("종료합니다.");
		scan.close();
	}
}
class School{
	static int schoolStudentNum, gradeStudentNum1, gradeStudentNum2, gradeStudentNum3;
	static String[][][] classStudentInfo = new String[3][5][50];
	static int[][] classNum = new int[3][5];
	static void showSchoolStudentNum() {
		schoolStudentNum = gradeStudentNum1 + gradeStudentNum2 + gradeStudentNum3;
		System.out.println("학교 학생 수 : " + schoolStudentNum);
	}
	static void showGradeStudentNum() {
		System.out.println("1학년 학생 수 : " + gradeStudentNum1);
		System.out.println("2학년 학생 수 : " + gradeStudentNum2);
		System.out.println("3학년 학생 수 : " + gradeStudentNum3);
	}
	static void showClass() {
		
		System.out.println("1학년 1반 | 1학년 2반 | 1학년 3반 | 1학년 4반 | 1학년 5반");
		System.out.printf("%4d     %4d      %4d     %4d      %4d\n",classNum[0][0],classNum[0][1],classNum[0][2],classNum[0][3],classNum[0][4]);
		System.out.println("2학년 1반 | 2학년 2반 | 2학년 3반 | 2학년 4반 | 2학년 5반");
		System.out.printf("%4d     %4d      %4d     %4d      %4d\n",classNum[1][0],classNum[1][1],classNum[1][2],classNum[1][3],classNum[1][4]);
		System.out.println("3학년 1반 | 3학년 2반 | 3학년 3반 | 3학년 4반 | 3학년 5반");
		System.out.printf("%4d     %4d      %4d     %4d      %4d\n",classNum[2][0],classNum[2][1],classNum[2][2],classNum[2][3],classNum[2][4]);
	}
	static void showClassList(String choice) {
		String restr = choice.replaceAll("[^0-9]","");
		//문자열에서 0-9의 숫자만 추출
		char gra = restr.charAt(0);
		char gro = restr.charAt(1);
		int ga = Integer.parseInt(""+gra);
		int go = Integer.parseInt(""+gro);
		for(int i = 0; i < School.classNum[ga-1][go-1]; i++) {
			System.out.printf("%S",classStudentInfo[ga-1][go-1][i]);
		}
		/*int tmp = 0;
		if(gra=='1'&&gro=='1')tmp = g11;
		if(gra=='1'&&gro=='2')tmp = g12;
		int ga = Integer.parseInt(""+gra);
		int go = Integer.parseInt(""+gro);
		for(int i=0; i<tmp; i++) {
			System.out.printf("%d.%s ",i+1,classStudentInfo[ga-1][go-1][i]);
		}*/
		System.out.println();
	}
}
class Student extends School{
	static int grade, group, number, studentNum = 0, adjustmentNum;
	static String name, adjustment;;
	static String[] basicInfo = new String[] {"비고", "학년", "반", "번호", "이름", "국어", "영어", "수학", "사회", "과학"};
	static String[][] studentInfo = new String[10][10];
	static void manu() {
		System.out.println("설정메뉴");
		System.out.println("1.학생정보 추가");
		System.out.println("2.학생정보 수정");
		System.out.println("3.학생정보 삭제");
		System.out.println("4.학생정보 출력");
		System.out.println("5.반학생정보 출력");
		System.out.println("6.종료");
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
		studentInfo[studentNum][0] = " ";
		studentInfo[studentNum][1] = grade;
		studentInfo[studentNum][2] = group;
		studentInfo[studentNum][3] = number;
		studentInfo[studentNum][4] = name;
		if(studentInfo[studentNum][1].equals("1")) {
			gradeStudentNum1++;
		}else if(studentInfo[studentNum][1].equals("2")) {
			gradeStudentNum2++;
		}else if(studentInfo[studentNum][1].equals("3")) {
			gradeStudentNum3++;
		}
		A : for(int i = 1; i < 4; i++) {
			for(int j = 1; j < 6; j++) {
				//i가 "1"일때 j가 "1"일때 
				String grad= Integer.toString(i), grou= Integer.toString(j);
				//int값을 String값으로 형변환
				if(studentInfo[studentNum][1].equals(grad) &&studentInfo[studentNum][2].equals(grou)) {
					//학년이 반복i와 같고 반이 반복j와 같을때
					classStudentInfo[i-1][j-1][classNum[i-1][j-1]] = studentInfo[studentNum][4];
					if(i == 1 && j ==1) {
						classNum[i-1][j-1] +=1;
						break A;
					}else if(i == 1 && j == 2) {
						classNum[i-1][j-1] +=1;
						break A;
					}else if(i == 1 && j == 3) {
						classNum[i-1][j-1] +=1;
						break A;
					}else if(i == 1 && j == 4) {
						classNum[i-1][j-1] +=1;
						break A;
					}else if(i == 1 && j == 5) {
						classNum[i-1][j-1] +=1;
						break A;
					}else if(i == 2 && j == 1) {
						classNum[i-1][j-1] +=1;
						break A;
					}else if(i == 2 && j == 2) {
						classNum[i-1][j-1] +=1;
						break A;
					}else if(i == 2 && j == 3) {
						classNum[i-1][j-1] +=1;
						break A;
					}else if(i == 2 && j == 4) {
						classNum[i-1][j-1] +=1;
						break A;
					}else if(i == 2 && j == 5) {
						classNum[i-1][j-1] +=1;
						break A;
					}else if(i == 3 && j == 1) {
						classNum[i-1][j-1] +=1;
						break A;
					}else if(i == 3 && j == 2) {
						classNum[i-1][j-1] +=1;
						break A;
					}else if(i == 3 && j == 3) {
						classNum[i-1][j-1] +=1;
						break A;
					}else if(i == 3 && j == 4) {
						classNum[i-1][j-1] +=1;
						break A;
					}else if(i == 3 && j == 5) {
						classNum[i-1][j-1] +=1;
						break A;
					}
				}
			}
		}
		for(int i = 0; i < basicInfo.length; i++) {
			if(studentInfo[studentNum][i]==null) {
				studentInfo[studentNum][i] = "x";
			}
		}
		for(int i = 0; i < studentNum; i++) {
			for(int j = studentNum; j < 4; j++) {
				if(studentInfo[i][1].equals(studentInfo[j][1])  && studentInfo[i][2].equals(studentInfo[j][2]) && studentInfo[i][3].equals(studentInfo[j][3])) {
					System.out.println("학생정보가 중복됩니다.");
					System.out.println(studentNum);
					delStudent(j);
					break;
				}
			}
		}
	}
	//학년,반,번호,이름 추가에 따른 전체 학생수 추가
	static void adjustmentStudent(String adjustment) {
		int adga = Integer.parseInt(adjustment);
		int adgo = Integer.parseInt(studentInfo[studentNum-1][2]);
		int dega = Integer.parseInt(adjustment);
		System.out.println(dega);
		switch(Student.adjustment) {
		case "학년" : 
			classNum[adga-2][adgo-1] -= 1;
			classNum[adga-1][adgo-1] += 1;
			studentInfo[adjustmentNum][1] = adjustment;
			break;
		case "반" : 
			classNum[adga-1][adgo-1] -= 1;
			classNum[adga-1][adgo] += 1;
			studentInfo[adjustmentNum][2] = adjustment;
			break;
		case "번호" : 
			studentInfo[adjustmentNum][3] = adjustment;
			break;
		case "이름" : 
			studentInfo[adjustmentNum][4] = adjustment;
			break;
		default :	
			System.out.println("잘못된 입력입니다.");
		}
	}
	static void delStudent(int adjustmentNum) {
		if(studentInfo[adjustmentNum][1].equals("1")) {
			gradeStudentNum1--;
		}else if(studentInfo[adjustmentNum][1].equals("2")) {
			gradeStudentNum2--;
		}else if(studentInfo[adjustmentNum][1].equals("3")) {
			gradeStudentNum3--;
		}
		A : for(int i = 1; i < 4; i++) {
			for(int j = 1; j < 6; j++) {
				//i가 "1"일때 j가 "1"일때 
				String gra= Integer.toString(i), gro= Integer.toString(j);
				//int값을 String값으로 형변환
				if(studentInfo[adjustmentNum][1].equals(gra) &&studentInfo[adjustmentNum][2].equals(gro)) {
					classStudentInfo[i-1][j-1][classNum[i-1][j-1]] = studentInfo[studentNum][4];
					if(i == 1 && j ==1) {
						classNum[i-1][j-1] -=1;
						break A;
					}else if(i == 1 && j == 2) {
						classNum[i-1][j-1] -=1;
						break A;
					}else if(i == 1 && j == 3) {
						classNum[i-1][j-1] -=1;
						break A;
					}else if(i == 1 && j == 4) {
						classNum[i-1][j-1] -=1;
						break A;
					}else if(i == 1 && j == 5) {
						classNum[i-1][j-1] -=1;
						break A;
					}else if(i == 2 && j == 1) {
						classNum[i-1][j-1] -=1;
						break A;
					}else if(i == 2 && j == 2) {
						classNum[i-1][j-1] -=1;
						break A;
					}else if(i == 2 && j == 3) {
						classNum[i-1][j-1] -=1;
						break A;
					}else if(i == 2 && j == 4) {
						classNum[i-1][j-1] -=1;
						break A;
					}else if(i == 2 && j == 5) {
						classNum[i-1][j-1] -=1;
						break A;
					}else if(i == 3 && j == 1) {
						classNum[i-1][j-1] -=1;
						break A;
					}else if(i == 3 && j == 2) {
						classNum[i-1][j-1] -=1;
						break A;
					}else if(i == 3 && j == 3) {
						classNum[i-1][j-1] -=1;
						break A;
					}else if(i == 3 && j == 4) {
						classNum[i-1][j-1] -=1;
						break A;
					}else if(i == 3 && j == 5) {
						classNum[i-1][j-1] -=1;
						break A;
					}
				}
			}
		}
		System.out.printf("%s학생의 정보가 삭제되었습니다.\n",studentInfo[adjustmentNum][4]);
		for(int i = adjustmentNum ; i <= studentNum; i++) {
			for(int j = 0; j < basicInfo.length; j++) {
				studentInfo[i][j] = studentInfo[i+1][j];
			}
		}
		studentNum--;
	}
	//static void findStudentInfo(String name) {
		//for(int i = 0; i < classNum[i-1][j-1]; i++) {
			
	static void showStudent() {
		for(int i = 0; i<basicInfo.length; i++) {
			System.out.printf("%5s",basicInfo[i]);
		}
		System.out.println();
		System.out.printf("%4s %4s%4s%4s %4s%4s %4s%4s %4s%4s",studentNum,studentInfo[adjustmentNum][1],
				studentInfo[adjustmentNum][2],studentInfo[adjustmentNum][3],studentInfo[adjustmentNum][4],
				studentInfo[adjustmentNum][5],studentInfo[adjustmentNum][6],studentInfo[adjustmentNum][7],
				studentInfo[adjustmentNum][8],studentInfo[adjustmentNum][9]);
		System.out.println();
		//특정학생정보배열 나타내기
	}
	static void showBasicInfo() {
		for(int i = 0; i < basicInfo.length; i++) {
			System.out.printf("%5s",basicInfo[i]);
		}
		System.out.println();
	}
	static void showStudentName() {
		for(int i = 0; i < studentNum; i++) {
			if (studentInfo[i][4] != null) {
				System.out.print((i + 1) + "." + studentInfo[i][4] + " ");
			}else {
				break;
			}
		}
		System.out.println();
	}
	static void showAllStudentInfo() {
		for(int i = 0; i < studentInfo.length; i++) {
			if(Student.studentInfo[i][0] != null) {
				System.out.printf("%4s %4s%4s%4s %4s%4s %4s%4s %4s%4s",i+1,studentInfo[i][1],
						studentInfo[i][2],studentInfo[i][3],studentInfo[i][4],
						studentInfo[i][5],studentInfo[i][6],studentInfo[i][7],
						studentInfo[i][8],studentInfo[i][9]);
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
		studentInfo[adjustmentNum][5] = language;
		studentInfo[adjustmentNum][6] = english;
		studentInfo[adjustmentNum][7] = math;
		studentInfo[adjustmentNum][8] = society;
		studentInfo[adjustmentNum][9] = science;
	}
}
