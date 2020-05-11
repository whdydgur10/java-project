package ProjectTestRemake;

import java.util.*;

public class StudentProjectTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		School school = new School();
		Student student = new Student();
		SubJect subject = new SubJect();
		boolean schoolOver = true, studentOver;
		int allManu, studentManu, adjustManu, delManu,subjectManu, studentGrade, studentGroup, studentNumber, set=0;
		String studentName, adjustGroup, delGroup, lang, eng, math, soci, sci, comm, atti;
		System.out.printf("%s입니다.\n",School.SchoolName);
		while (schoolOver) {
			//종료전까지 실행
			school.schoolManu();
			allManu = scan.nextInt();
			//학교메뉴보여주기
			if(allManu == 1) {
				//1이면 학교 학급 내용
				school.showAllClass();
			}else if(allManu == 2) {
				//2이면 학생정보로 이동
				studentOver = true;
				while(studentOver) {
					set = 0;
					//되돌리기전까지 실행
					student.StudentManu();
					studentManu = scan.nextInt();
					//학생메뉴보여주기
					if(studentManu == 1) {
						//1이면 학생등록
						school.allStudentNum();
						System.out.println("학생 등록하기입니다.");
						System.out.println("등록할 학생의 학년 반 이름 입력해주세요.");
						System.out.print("학년 : ");
						studentGrade = scan.nextInt();
						System.out.print("반 : ");
						studentGroup = scan.nextInt();
						System.out.print("이름 : ");
						studentName = scan.next();
						student.StudentAdd(studentGrade, studentGroup, studentName);
						System.out.println(studentName+"학생이 등록되었습니다.");
					}else if(studentManu == 2) {
						//2이면 학생정보 수정
						System.out.println("학생정보 수정하기입니다.");
						System.out.println("1.학급별 학생정보 찾기 2.이름별 학생정보 찾기");
						adjustManu = scan.nextInt();
						if(adjustManu == 1) {
							//1이면 학급별
							school.showAllClass();
							System.out.println("원하는 학급을 입력하세요.");
							adjustGroup = scan.next();
							student.getNum(adjustGroup);
							System.out.printf("%d학년 %d반 학생명단입니다.\n",student.grade,student.group);
							student.showClassStudent(student.grade, student.group);
							System.out.println("학생이름을 적어주세요.");
							studentName = scan.next();
							System.out.println("원하는 수정사항을 입력하세요.");
							System.out.println("1.교실 이동 2.성적");
							adjustManu = scan.nextInt();
							if(adjustManu == 1) {
								//1이면 반 이동
								student.studentDel(studentName);
								System.out.println("이동할 교실을 입력해주세요.");
								System.out.print("학년 : ");
								studentGrade = scan.nextInt();
								System.out.print("반 : ");
								studentGroup = scan.nextInt();
								student.StudentAdd(studentGrade, studentGroup, studentName);
								System.out.println(studentName+"학생이 재등록되었습니다.");
							}else if (adjustManu == 2) {
								//2이면 성적
								System.out.println("점수 입력하기입니다.");
								System.out.println("1.중간고사 2.기말고사");
								subjectManu = scan.nextInt();
								if(subjectManu == 1) {
									school.showAllClass();
									System.out.println("원하는 학급을 입력하세요.");
									adjustGroup = scan.next();
									student.getNum(adjustGroup);
									System.out.printf("%d학년 %d반 학생명단입니다.\n",student.grade,student.group);
									student.showClassStudent(student.grade, student.group);
									System.out.println("학생이름을 적어주세요.");
									System.out.print("학년 : ");
									studentGrade = scan.nextInt();
									System.out.print("반 : ");
									studentGroup = scan.nextInt();
									System.out.print("번호 : ");
									studentNumber = scan.nextInt();
									System.out.print("이름 : ");
									studentName = scan.next();
									while(student.match(studentGrade,studentGroup,studentNumber)) {
										System.out.println("점수를 입력해주세요.");
										System.out.print("국어 : ");
										lang = scan.next();
										System.out.print("영어 : ");
										lang = scan.next();
										System.out.print("수학 : ");
										lang = scan.next();
										System.out.print("사회 : ");
										lang = scan.next();
										System.out.print("과학 : ");
										lang = scan.next();
										System.out.print("수행평가 : ");
										lang = scan.next();
										System.out.print("태도점수 : ");
										lang = scan.next();
										break;
									}
								}else if(subjectManu == 2) {
									
								}else {
									System.out.println("잘못된 입력으로 취소됩니다.");
								}
							}else {
								System.out.println("잘못된 입력으로 취소됩니다.");
							}
						}else if(adjustManu == 2) {
							//2이면 이름별
							System.out.println("학생 이름을 적어주세요.");
							studentName = scan.next();
							System.out.println(studentName+"학생 명단입니다.");
							student.findStudent(studentName);
							System.out.println("수정할 학생의 학년 반 번호를 입력하세요.");
							System.out.print("학년 : ");
							studentGrade = scan.nextInt();
							System.out.print("반 : ");
							studentGroup = scan.nextInt();
							System.out.print("번호 : ");
							studentNumber = scan.nextInt();
							System.out.println("원하는 수정사항을 입력하세요.");
							System.out.println("1.교실 이동 2.성적");
							adjustManu = scan.nextInt();
							if(adjustManu == 1) {
								//1이면 반 이동
								student.studentDel(studentGrade, studentGroup, studentNumber);
								System.out.println("이동할 교실을 입력해주세요.");
								System.out.print("학년 : ");
								studentGrade = scan.nextInt();
								System.out.print("반 : ");
								studentGroup = scan.nextInt();
								student.StudentAdd(studentGrade, studentGroup, studentName);
								System.out.println(studentName+"학생이 재등록되었습니다.");
							}else if (adjustManu == 2) {
								System.out.println("점수 입력하기입니다.");
								System.out.println("1.중간고사 2.기말고사");
								subjectManu = scan.nextInt();
								if(subjectManu == 1) {
									System.out.println("점수를 입력해주세요.");
									System.out.print("국어 : ");
									lang = scan.next();
									System.out.print("영어 : ");
									eng = scan.next();
									System.out.print("수학 : ");
									math = scan.next();
									System.out.print("사회 : ");
									soci = scan.next();
									System.out.print("과학 : ");
									sci = scan.next();
									System.out.print("수행평가 : ");
									comm = scan.next();
									System.out.print("태도점수 : ");
									atti = scan.next();
									subject.middleTest(studentGrade, studentGroup, studentNumber, lang, eng, math, soci,sci,comm, atti);
									
								}else if(subjectManu == 2) {
									
								}else {
									System.out.println("잘못된 입력으로 취소됩니다.");
								}
							}else {
								System.out.println("잘못된 입력으로 취소됩니다.");
							}
						}else {
							System.out.println("잘못된 입력으로 취소됩니다.");
						}
					}else if(studentManu == 3) {
						//3이면 학생정보 삭제
 						System.out.println("학생정보 삭제하기입니다.");
						System.out.println("1.학급별 학생정보 찾기 2.이름별 학생정보 찾기");
						delManu = scan.nextInt();
						if(delManu == 1) {
							//1이면 학급별
							school.showAllClass();
							System.out.println("원하는 학급을 입력하세요.");
							delGroup = scan.next();
							student.getNum(delGroup);
							System.out.printf("%d학년 %d반 학생명단입니다.\n",student.grade,student.group);
							student.showClassStudent(student.grade, student.group);
							System.out.println("학생이름을 적어주세요.");
							studentName = scan.next();
							student.studentDel(studentName);
							System.out.println(studentName+"학생이 삭제되었습니다.");
						}else if(delManu == 2) {
							//2이면 이름별
							System.out.println("학생 이름을 적어주세요.");
							studentName = scan.next();
							System.out.println(studentName+"학생 명단입니다.");
							student.findStudent(studentName);
							System.out.println("삭제할 학생의 학년 반 번호를 입력하세요.");
							System.out.print("학년 : ");
							studentGrade = scan.nextInt();
							System.out.print("반 : ");
							studentGroup = scan.nextInt();
							System.out.print("번호 : ");
							studentNumber = scan.nextInt();
							System.out.println(studentName+"학생이 삭제되었습니다.");
							student.studentDel(studentGrade, studentGroup, studentNumber);
						}else {
							System.out.println("잘못된 입력으로 취소됩니다.");
							}
					}else if(studentManu == 4) {
						//4이면 학생정보 출력
						while(student.studentArr.length-1 > set) {
							subject.showGrade(set);
							set++;
						}
					}else if(studentManu == 5) {
						//5이면 학교정보로 돌아가기
						studentOver = false;
					}else {
						System.out.println("잘못된 입력으로 취소됩니다.");
					}
				}
			}else if(allManu == 3) {
				//3이면 교과목메뉴로 이동
				System.out.println("미구현입니다.");
			}else if(allManu == 4) {
				//4이면 프로그램 종료
				school.allStudentNum();
				schoolOver = false;
			}else {
				System.out.println("잘못된 입력으로 취소됩니다.");
			}
		}
		scan.close();
	}
}