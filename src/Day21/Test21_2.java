package Day21;

import java.util.*;

public class Test21_2 {
	/*가계부 프로그램을 작성하시오.
	 메뉴
	 1. 등록
	   - 일시, 내용, 수입/지출, 금액, 분류를 등록
	 2. 수정
	   - 등록된 리스트 중에 수정할 내용을 선택 => 선택한 내용을 수정
	 3. 확인
	   - 일시를 기준으로 확인
	   - 수입/지출을 기준으로 확인
	   - 분류를 기준으로 확인
	 4. 종료*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Household> dayList = new ArrayList<Household>();
		Household hh = null;
		for(int i = 0; i < 3; i++) {
			hh = makeHousehold(scan);
			dayList.add(hh);
		}
		System.out.println(dayList);
		selectMenu();
		selectMenu(dayList, scan);

	}
	public static void showHousehold() {
		System.out.println("메뉴입니다.");
		System.out.println("1.가계부 등록");
		System.out.println("2.가계부 수정");
		System.out.println("3.가계부 확인");
		System.out.println("4.종료");
		System.out.println("메뉴를 선택해주세요.");
	}
	public static Household makeHousehold(Scanner scan) {
		Household hh = new Household();
		System.out.print("일시 : ");
		String date = scan.next();
		hh.date = date;
		System.out.print("수입/지출 : ");
		String income = scan.next();
		hh.income = income;
		System.out.print("금액 : ");
		String pay = scan.next();
		hh.pay = pay;
		System.out.print("분류 : ");
		String type = scan.next();
		hh.type = type;
		scan.nextLine();
		System.out.print("내용 : ");
		String content = scan.nextLine();
		hh.content = content;
		return hh;
	}
	public static boolean addHousehold(Household hh, ArrayList<Household> list) {
		if(list == null || hh == null) {
			return false;
		}if(list.contains(hh)) {
			System.out.println("중복된 등록입니다.");
			return false;
		}
		System.out.println("등록되었습니다.");
		return list.add(hh);
	}
	public static void selectMenu() {
		System.out.println("확인 메뉴입니다.");
		System.out.println("1.일시별 확인");
		System.out.println("2.수입/지출별 확인");
		System.out.println("3.분류별 확인");
	}
	public static void selectMenu(ArrayList<Household> list, Scanner scan) {
		System.out.println("메뉴를 선택해주세요.");
		int menu = scan.nextInt();
		if(menu == 1) {
			System.out.print("일시를 입력해주세요. : ");
			Household hh = selectDate(scan);
			for(Household tmp : list) {
				if(tmp.equals(hh)) {
					System.out.println(tmp);
				}
			}
		}/*else if(menu == 2) {
			System.out.println("수입/지출을 입력해주세요.");
			String income = scan.next();
			if(hh.income.contains(income)) {
				for(Household tmp : list) {
					if(tmp.equals(hh)) {
						System.out.println(tmp);
					}
				}
			}
		}else if(menu == 3) {
			System.out.println("분류를 입력해주세요.");
			String type = scan.next();
			if(list.contains(type)) {
				for(Household tmp : list) {
					if(tmp.equals(hh)) {
						System.out.println(tmp);
					}
				}
			}
		}else {
			System.out.println("잘못된 입력입니다.");
		}*/
	}
	public static Household selectDate(Scanner scan) {
		return new Household(scan.next(),"","","","");
	}
}
class Household{
	String date; 
	String income;
	String pay;
	String type;
	String content;
	public Household() {
		
	}
	public Household(String date, String income, String pay, String type, String content) {
		super();
		this.date = date;
		this.income = income;
		this.pay = pay;
		this.type = type;
		this.content = content;
	}

	@Override
	public String toString() {
		return "가계부 [일시=" + date + ", 수입/지출=" + income + ", 금액=" + pay + ", 분류=" + type + ", 내용="
				+ content + "\n";
	}
}