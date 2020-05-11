package ProjectTestRemake;

class School{
	static String SchoolName = "고등학교";
	static String[][][] gradeClassNumber = new String[3][5][50];
	static int numList[][] = new int[3][5];
	static int schoolStudentNum;
	public void schoolManu() {
		System.out.println("전체 메뉴입니다.");
		System.out.println("1.학교정보");
		System.out.println("2.학생정보");
		System.out.println("3.교과목정보");
		System.out.println("4.종료");
	}
	void allStudentNum() {
		schoolStudentNum = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				for(int q = 0; q < 50; q++) {
					if(gradeClassNumber[i][j][q] != null) {
						schoolStudentNum++;
					}
				}
			}
		}
	}
	//i는 학년 j는 반 q는 학생수로 반복을 돌리고 이름이 없으면 학생이 없으니 냅두고 그게 아니라면 학생이 있는것이니 1씩 증가시킨다.다 돌리면 총 학생수
	public void showAllClass() {
		System.out.println("학급과 학생수는 다음과 같이 나와있습니다.");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf(" %d학년 %d반 ",i+1,j+1);
			}
			System.out.println();
			for(int j = 0; j < 5; j++) {
				System.out.printf("    %d   ",numList[i][j]);
			}
			System.out.println();
		}
	}
	//i는 학년 j는 반을 나타내고 위에 j는 학년반이 나오게 밑에 j는 그에 따른 학생수가 나오게 한다.
}