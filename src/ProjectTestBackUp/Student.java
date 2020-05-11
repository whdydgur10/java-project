package ProjectTestBackUp;

class Student extends School{
	

		int grade, group, studentCnt;
		public void StudentManu() {
			System.out.println("학생정보 메뉴입니다.");
			System.out.println("1.학생 등록하기");
			System.out.println("2.학생정보 수정하기");
			System.out.println("3.학생정보 삭제하기");
			System.out.println("4.학생정보 출력하기");
			System.out.println("5.돌아가기");
		}
		public void getNum(String Group) {
			String restr = Group.replaceAll("[^0-9]","");
			//문자열에서 0-9의 숫자만 추출
			char gra = restr.charAt(0);
			char gro = restr.charAt(1);
			grade = Integer.parseInt(""+gra);
			group = Integer.parseInt(""+gro);
		}
		//학급별 학생명단을 볼 때 학급을 검색하면 (1학년1반) 학년1과 반1을 추출하여 grade와 group에 저장한다.
		public Student() {
			
		}
		public void StudentAdd(int studentGrade, int studentGroup, String studentName) {
			//1.학생등록하기
			studentGrade -= 1;
			studentGroup -= 1;
			//학년 반
			numList[studentGrade][studentGroup]++;
			//학급 학생수 늘리기
			studentCnt = numList[studentGrade][studentGroup];
			//반복횟수
			for(int i = 0; i < studentCnt; i++) {
				if(gradeClassNumber[studentGrade][studentGroup][i] == null) {
					//학급에 반복을 해 값이 null이면
					gradeClassNumber[studentGrade][studentGroup][i] = studentName;
					//그 값에 이름을 넣는다.
				}
			}
		}
		//매개변수값으로 학년,반,이름을 (1학년 1반 홍길동) numList[학년-1][반-1]배열을 1증가시키고 그 배열값만큼 반복을 돌려
		//1학년1반1번값이 (gradeClassNumber[학년-1][반-1][i]번) null이라면 null에 이름을 넣는다.
		public void studentAdj(String studentName) {
			//2.이름으로 학생정보 수정하기
			
		}
		public void studentAdj(int grade, int group, int number) {
			//2.학년 반 번호로 학생정보 수정하기
		}
		public void studentDel(String studentName) {
			//3.이름으로 학생정보 삭제하기
			grade -=1;
			group -=1;
			int j = 0;
			for(int i = 0; i < numList[grade][group]; i++) {
				if(gradeClassNumber[grade][group][i].equals(studentName)) {
					j = i;
					break;
				}
			}
			//학급 학생 숫자만큼 반복 이름이 발견될때까지
			for(int i = j; i < numList[grade][group]; i++) {
				if(gradeClassNumber[grade][group][i] != null) {
					gradeClassNumber[grade][group][i] = gradeClassNumber[grade][group][i+1];
				}else {
					break;
				}
			}
			//학급 학생 숫자만큼 반복 발견된 이름부터
			numList[grade][group]--;
			//학급 학생 수 줄이기	
		}
		public void studentDel(int grade, int group, int number) {
			//3.학년 반 번호로 학생정보 삭제하기
			grade -= 1;
			group -= 1;
			number -= 1;
			int i;
			for(i = number; i < numList[grade][group]; i++) {
				gradeClassNumber[grade][group][i] = gradeClassNumber[grade][group][i+1];	
			}
			numList[grade][group]--;
		}
		public void showStudent() {
			//4.학생정보 출력하기
			int cntNum =1;
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 5; j++) {
					for(int q = 0; q < 50; q++) {
						if(gradeClassNumber[i][j][q] == null) {
							break;
						}else {
							System.out.printf("%d.%d학년 %d반 %d번 %s\n",cntNum,i+1,j+1,q+1,gradeClassNumber[i][j][q]+ " ");
							cntNum++;
						}
					}
				}
			}
			if(cntNum == 1) {
				System.out.println("등록된 학생이 없습니다.");
			}
		}
		//학년 i, 반 j, 번호 q로 1학년 1반부터 시작해서 순서대로 이름을 나타내고 (1.홍길동) 없으면 다음반으로 넘어간다.
		public void showClassStudent(int grade, int group) {
			//4.반학생정보 출력하기
			grade -= 1;
			group -= 1;
			for(int number = 0; number < 50; number++) {
				if(gradeClassNumber[grade][group][number] != null) {
					System.out.printf("%d.%s\n",number+1,gradeClassNumber[grade][group][number]);
				}else {
					break;
				}
			}
		}
		//학급별 학생이름을 나타낸다. 최대 50명으로 설정하였고 기본값은 null로 등록을 하지 않았으면 break걸린다.
		public void findStudent(String studentName) {
			//이름으로 학생찾기
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 5; j++) {
					 for(int q = 0; q < 50; q++) {
						if(gradeClassNumber[i][j][q] != null && gradeClassNumber[i][j][q].equals(studentName)) {
							//이름이 null이 아니고 똑같을 때
							System.out.printf("%d학년 %d반 %d번 %s\n",i+1,j+1,q+1,gradeClassNumber[i][j][q]);
						}
					}
				}
			}
		}
		//이름을 검색하면 학년,반,번호,이름이 나온다.
		public void findStudent(int grade,int group, int number) {
			//학년 반 번호로 학생찾기
			System.out.println(gradeClassNumber[grade][group][number]);
		}
		//학년,반,번호를 검색하면 학년,반,번호,이름이 나온다.
	}