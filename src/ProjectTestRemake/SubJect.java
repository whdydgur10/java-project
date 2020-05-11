package ProjectTestRemake;

public class SubJect extends Student {
	
	int testNum = 3, subNum = 9, studentNum = 100, studentCnt, stuNum, classNum;
	String lang, eng, math, soci, sci, comm, atti;
	String test[][][] = new String[studentNum][testNum][subNum];
	public void basicScore(int studentNum) {
		test[studentNum][0][0] = "시험점수";
		test[studentNum][0][1] = "국 어";
		test[studentNum][0][2] = "영 어";
		test[studentNum][0][3] = "수 학";
		test[studentNum][0][4] = "사 회";
		test[studentNum][0][5] = "과 학";
		test[studentNum][0][6] = "수 행";
		test[studentNum][0][7] = "태 도";
		test[studentNum][0][8] = "평 균";
		test[studentNum][1][0] = "중간고사";
		test[studentNum][2][0] = "기말고사";
		for(int i = 0; i < studentNum+1; i++) {
			for(int j = 0; j < testNum; j++) {
				for(int q = 0; q < subNum ; q++) {
					if(test[i][j][q] == null) {
						test[i][j][q] = "0";
					}
				}
			}
		}
	}
	public void showGrade(int number) {
		basicScore(number);
		A : for(int i = 0; i < 3; i++) {
			for(int j = classNum; j < 5; j++) {
				for(int q = stuNum; q < 50; q++) {
					if(gradeClassNumber[i][j][q] != null) {
						System.out.printf("%d.%d학년 %d반 %d번 %s\n",number+1,i+1,j+1,q+1,gradeClassNumber[i][j][q]+ " ");
						stuNum = q;
						break A;
					}else {
						break;
					}
				}
			}
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 9; j++) {
				System.out.printf("%4s",test[number][i][j]);
			}
			System.out.println();
		}
	}
	
	
	
	
	public void middleTest(int grade, int group, int number, String lang,String eng, String math, String soci, String sci, String comm, String atti) {
		//학년 반 번호를 넣으면 이름이 나온다.
		//학생을 등록할 때 학생마다 번호를 매긴다.
		//학년 번호 이름과 학생 등록 이름이 같으면
		//학생 번호에 점수를 넣는다.
		int i;
		int num = 0;
		for(i = 0; i < studentNum; i++) {
			if(gradeClassNumber[grade][group][number] == studentArr[i]) {
				num = i;
				break;
			}
		}
		System.out.println(num);
		test[i][1][1] = lang;
		test[i][1][2] = eng;
		test[i][1][3] = math;
		test[i][1][4] = soci;
		test[i][1][5] = sci;
		test[i][1][6] = comm;
		test[i][1][7] = atti;
		test[i][1][8] = Integer.toString((Integer.parseInt(lang)+Integer.parseInt(eng)+Integer.parseInt(math)+Integer.parseInt(soci)+Integer.parseInt(sci))/5*6/10+Integer.parseInt(comm)*3/10+Integer.parseInt(atti));
		
	}/*
	public void finalTest(String lang,String eng, String math, String soci, String sci) {
		test[studentCnt][2][1] = lang;
		test[studentCnt][2][2] = eng;
		test[studentCnt][2][3] = math;
		test[studentCnt][2][4] = soci;
		test[studentCnt][2][5] = sci;
	}
	public void commitTest(String lang,String eng, String math, String soci, String sci) {
		test[studentCnt][3][1] = lang;
		test[studentCnt][3][2] = eng;
		test[studentCnt][3][3] = math;
		test[studentCnt][3][4] = soci;
		test[studentCnt][3][5] = sci;
	}
	public void attiTest(String lang,String eng, String math, String soci, String sci) {
		test[studentCnt][4][1] = lang;
		test[studentCnt][4][2] = eng;
		test[studentCnt][4][3] = math;
		test[studentCnt][4][4] = soci;
		test[studentCnt][4][5] = sci;
	}
	public void insertScore(String studentName, String testName) {
		//점수를 넣는다. 점수 넣을 시험 이름과 누구의 점수인지
		switch(testName) {
		case "중간고사" :
			middleTest(lang,eng,math,soci,sci);
			break;
		case "기말고사" :
			finalTest(lang,eng,math,soci,sci);
			break;
		case "수행평가" :
			commitTest(lang,eng,math,soci,sci);
			break;
		case "태도점수" :
			attiTest(lang,eng,math,soci,sci);
			break;
		}
	}
	public void insertScore(int grade, int group, int number, String testName) {
		//점수를 넣는다. 점수 넣을 시험 이름과 누구의 점수인지
		switch(testName) {
		case "중간고사" :
			middleTest(lang,eng,math,soci,sci);
			break;
		case "기말고사" :
			finalTest(lang,eng,math,soci,sci);
			break;
		case "수행평가" :
			commitTest(lang,eng,math,soci,sci);
			break;
		case "태도점수" :
			attiTest(lang,eng,math,soci,sci);
			break;
		}
	}*/

}
