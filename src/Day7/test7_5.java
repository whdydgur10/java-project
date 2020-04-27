package Day7;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class test7_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student student = new Student();
		student.showStudent();
		student.inClass();
		student.showStudent();
		student.inClass();
		student.showStudent();
		//String stu_name = scan.next();
		//String cla_name = scan.next();
		//Student student2 = new Student(stu_name, cla_name);
		//student2.showStudent();
		//Student student3 = new Student("김기동", "java");
		//student3.showStudent();
		//Student.showClass();
		scan.close();

	}

}
class Student{
	private int cardNum = 1;
	String studentName = "홍길동";
	String className = "java";
	private String inTime;
	private String outTime;
	private String inday;
	private String outday;
	private int inClass = 0;
	static int java = 0, python = 0, studentNum = 0, cnt = 0;;
	SimpleDateFormat format = new SimpleDateFormat("HH시 mm분 ss초");
	SimpleDateFormat format2 = new SimpleDateFormat("yyyy년 MM월 dd일");
	Date time = new Date();
	Date day = new Date();
	public void inClass() {
		if(cnt == 0) {
			System.out.println("입실");
			inTime = format.format(time);
			inday = format2.format(day);
			inClass = 1;
			cnt++;
		}else {
			System.out.println("퇴실");
			outTime = format.format(time);
			outday = format2.format(day);
			inClass = 2;
			cnt++;
		}
	}
	public void showStudent() {
		System.out.printf("카드번호 : %d\n",cardNum);
		System.out.printf("학생이름 : %s\n",studentName);
		System.out.printf("강좌이름 : %s\n",className);
		if(cnt > 1) {
			System.out.printf("퇴실시간 : %s\n",outTime);
		}else {
			if (inClass == 1) {
				System.out.printf("입실시간 : %s\n",inTime);
			}else if(inClass == 2) {
				System.out.printf("퇴실시간 : %s\n",outTime);
			}else if(inClass == 0) {
				System.out.println("입실전");
			}
		}
	}
	public static void showClass() {
		System.out.printf("학원 학생수 : %d\n",studentNum);
		System.out.printf("현재 java과정 학생수 : %d\n",java);
		System.out.printf("현재 python과정 학생수 : %d\n",python);
	}
	public Student(){
		studentNum++;
		java++;
		
	}
	public Student(String studentName, String className){
		cardNum++;
		this.studentName = studentName;
		this.className = className;
		studentNum++;
		if(className.equals("java")) {
			java++;
		}else if(className.equals("python")) {
			python++;
		}
	}
}
	/*public static void main(String[] args) {
		Student s1 = new Student();
		s1.printInfo();
		s1.in();
		s1.printInfo();
		Student s2 = new Student("컨버전스","이순신");
		s2.in();
		s2.out();
		s2.printInfo();

	}

}
class Student{
	private String name;
	private boolean isEntrance;
	private String course;
	private String inTime, outTime;
	SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
	Date time = new Date();
	public void in() {
		System.out.printf("%s님 입실\n", name);
		isEntrance = true;
		inTime = format.format(time);
	}
	public void out() {
		System.out.printf("%s님 퇴실\n",name);
		isEntrance = false;
		outTime = format.format(time);
	}
	public void printInfo() {
		System.out.printf("과정 : %s\n",course);
		System.out.printf("이름 : %s\n",name);
		if(isEntrance == true) {
			System.out.println("입실 중");
			System.out.printf("입실시간 : %s\n",inTime);
		}else {
			System.out.println("퇴실");
			System.out.printf("입실시간 : %s\n",inTime);
			System.out.printf("퇴실시간 : %s\n",outTime);
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isEntrance() {
		return isEntrance;
	}
	public void setEntrance(boolean isEntrance) {
		this.isEntrance = isEntrance;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getInTime() {
		return inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}
	public String getOutTime() {
		return outTime;
	}
	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}
	public Student() {
		course = "자바";
		name = "홍길동";
	}
	public Student(String course, String name) {
		this.course = course;
		this.name = name;
	}
}*/