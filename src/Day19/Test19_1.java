package Day19;

import java.util.*;

public class Test19_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Student> studentList = new ArrayList<Student>();
		Student s = new Student();
		while(true) {
			showManu();
			int manu = scan.nextInt();
			if(manu == 1) {
				insertStudent(studentList, inputStudent(scan));
			}else if(manu == 2) {
				modifyStudent(studentList, inputStudent(scan));
			}else if(manu == 3) {
				deleteStudent(studentList, inputStudent(scan));
			}else if(manu == 4) {
				printStudent(studentList);
			}else if(manu == 5) {
				break;
			}
		}
		scan.close();
	}
	public static void showManu() {
		System.out.println("메뉴입니다.");
		System.out.println("1.학생정보 추가");
		System.out.println("2.학생정보 수정");
		System.out.println("3.학생정보 삭제");
		System.out.println("4.학생정보 출력");
		System.out.println("5.종료");
	}
	public static Student inputStudent(Scanner scan) {
	
		Student s = new Student();
		System.out.print(" 학  번  : ");
		String num = scan.next();
		System.out.print(" 학  년  : ");
		String grade = scan.next();
		System.out.print(" 전  공  : ");
		String major = scan.next();
		System.out.print(" 이  름  : ");
		String name = scan.next();
		s.num = num;
		s.grade = grade;
		s.major = major;
		s.name = name;
		return s;
	}//객체를 생성하는 메소드
	public static boolean insertStudent(List<Student> list, Student s) {
		System.out.println("학생정보 추가입니다.");
		if(list == null || s == null) {
			return false;
		}
		if(list.contains(s)) {
			System.out.println("중복된 학번이 있습니다.");
			return false;
		}
		list.add(s);
		System.out.println(s.name+"학생이 추가되었습니다.");
		return true;
	}
	public static boolean modifyStudent(List<Student> list, Student s) {
		System.out.println("학생정보 수정입니다.");
		if(list == null || s == null) {
			return false;
		}
		if(!list.contains(s)) {
			System.out.println("없는 학생 정보입니다.");
			return false;
		}
		list.remove(s);
		list.add(s);
		System.out.println(s.name+"학생이 수정되었습니다.");
		return true;
	}
	public static boolean deleteStudent(List<Student> list, Student s) {
		System.out.println("학생정보 삭제입니다.");
		if(list == null || s == null) {
			return false;
		}
		if(!list.contains(s)) {
			System.out.println("없는 학생 정보입니다.");
			return false;
		}
		list.remove(s);
		System.out.println(s.name+"학생이 삭제되었습니다.");
		return true;
	}
	public static void printStudent(List<Student> list) {
		System.out.println("학생정보 출력입니다.");
		if(list.size() == 0) {
			System.out.println("학생정보가 없습니다.");
		}else {
			
			System.out.println();
			for(Student tmp : list) {
				System.out.printf("%6s",tmp);
			}
			System.out.println();
		}
	}	
	public static void adjStident(String num) {
		
	}//학번으로 정보를 수정할 학생을 찾아 수정한다. 
	public static void delStudent(String num) {
		
	}//학번으로 정보를 삭제할 학생을 찾아 삭제한다. 학교 학생수를 삭제한다. 
	public static void setMajor(String major) {
		
	}//전공에 몇명의 학생이 있는지 확인한다.
	public static void addMajor(String num, String major) {
		
	}//복수전공을 할 경우 추가해준다. 복수전공은 전공인원에 포함하지 않는다.
	public static String numYear(String year) {
		return year.substring(2, 4);
	}//입학년도를 입력받으면 뒤 두자리를 반환한다.

}
class Student{
	String name;
	String num;
	String major;
	String grade;
	static int schoolNum = 1;
	public Student() {
		
	}
	public Student(String num, String grade, String major, String name) {
		super();
		this.name = name;
		this.num = num;
		this.major = major;
		this.grade = grade;
	}
	@Override
	public String toString() {
		System.out.println();
		return  " " + num + "  " +  grade + "  " +  major + "  " + name ;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((num == null) ? 0 : num.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		return true;
	}//비교할 때 num의 값만 비교하도록 하였다.
}