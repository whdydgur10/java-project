package ProjectTestRemake;

public class StudentProjectTest {

	public static void main(String[] args) {
		

	}

}
class School{
	private static String SchoolName = "고등학교";
	private static int[][][] gradeClassNumber = new int[3][5][50];
	private static int schoolStudentNum;
	private void allStudentNum() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				for(int q = 0; q < 50; q++) {
					if(gradeClassNumber[i][j][q] != 0) {
						schoolStudentNum++;
					}
				}
			}
		}
	}
	//총 학생수 구하기
	public void showSchool() {
		System.out.printf("학교이름은 : %s입니다.\n",SchoolName);
		System.out.printf("총 학생의 수는 : %d명입니다.\n",schoolStudentNum);
	}
	//학교이름과 총 학생수 출력
	public void showClass() {
		System.out.println("학급은 다음과 같이 나와있습니다.");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf(" %d학년 %d반 ",i,j);
			}
			System.out.println();
		}
	}
	//학교의 학년과 반 나타내기
	public static String getSchoolName() {
		return SchoolName;
	}
	public static void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}
	public static int[][][] getGradeClassNumber() {
		return gradeClassNumber;
	}
	public static void setGradeClassNumber(int[][][] gradeClassNumber) {
		School.gradeClassNumber = gradeClassNumber;
	}
	public static int getSchoolStudentNum() {
		return schoolStudentNum;
	}
	public static void setSchoolStudentNum(int schoolStudentNum) {
		School.schoolStudentNum = schoolStudentNum;
	}
}
class Student extends School{
	private String studentName;
	String[] StudentList = new String[School.getSchoolStudentNum()];
	
}