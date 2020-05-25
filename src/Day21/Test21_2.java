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
		householdManager(scan, dayList);
		scan.close();
	}
	public static void householdManager(Scanner scan, ArrayList<Household> list) {
		while(true) {
			showHousehold();
			int menu = scan.nextInt();
			if(menu == 1) {
				addHousehold(makeHousehold(scan), list);
			}else if(menu == 2) {
				modifyMenu();
				modifyMenu(list, scan);
			}else if(menu == 3) {
				selectMenu();
				selectMenu(list, scan);
			}else if(menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("잘못된 입력입니다.");
			}
			sort(list);
		}
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
		System.out.print("연도 : ");
		String date = scan.next();
		if(!date.contains("년")) {
			hh.date = date + "년";
		}else {
			hh.date = date;
		}
		
		System.out.print("수입/지출 : ");
		String income = "";
		while (true) {
			income = scan.next();
			if(income.equals("수입") || income.equals("지출")) {
				break;
			}
			System.out.println("잘못된 입력입니다.");
		}
		hh.income = income;
		while(true){
			try {
				System.out.print("금액 : ");
				String pay = scan.next();
				Integer.parseInt(pay);
				if(!pay.contains("원")) {
					hh.pay = pay + "원";
					break;
				}else {
					hh.pay = pay;
					break;
				}
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력해주세요.");
			}
		}
		System.out.print("분류 : ");
		String type = scan.next();
		hh.type = type;
		scan.nextLine();
		System.out.print("내용 : ");
		String content = scan.nextLine();
		hh.content = content;
		return hh;
	}
	//내역 설정하는 기능
	public static boolean addHousehold(Household hh, ArrayList<Household> list) {
		if(hh == null) {
			return false;
		}
		if(list.size() == 0) {
			System.out.println("등록되었습니다.");
			return list.add(hh);
		}else {
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).equals(hh)) {
					System.out.println("중복된 등록입니다.");
					return false;
				}else {
					System.out.println("등록되었습니다.");
					return list.add(hh);
				}
			}
		}
		return false;
	}
	//등록하는 기능
	public static void modifyMenu() {
		System.out.println("수정 메뉴입니다.");
		System.out.println("1.수정");
		System.out.println("2.삭제");
	}
	public static void modifyMenu(ArrayList<Household> list, Scanner scan) {
		System.out.println("메뉴를 선택해주세요.");
		int menu = scan.nextInt();
		/*if(menu == 1) {
			allData(list);
			System.out.println("수정하고 싶은 내역을 입력하세요.");
			Household hh = makeHousehold(scan);
			list.remove(hh);
			System.out.println("수정 내용을 입력하세요.");
			hh = makeHousehold(scan);
			list.add(hh);
			System.out.println("내역이 수정되었습니다.");
		}else if(menu == 2) {
			allData(list);
			System.out.println("삭제하고 싶은 내역을 입력해주세요.");
			Household hh = makeHousehold(scan);
			list.remove(hh);
			System.out.println("내역이 삭제되었습니다.");
			//내용 입력으로 수정
		}*/
		if(menu == 1) {
			allData(list);
			System.out.println("수정하고 싶은 내역 번호를 선택하세요.");
			int dex = scan.nextInt();
			list.remove(dex-1);
			System.out.println("수정 내용을 입력하세요.");
			Household hh = makeHousehold(scan);
			list.add(hh);
			System.out.println("내역이 수정되었습니다.");
		}else if(menu == 2) {
			allData(list);
			System.out.println("삭제하고 싶은 내역 번호를 입력해주세요.");
			int dex = scan.nextInt();
			list.remove(dex-1);
			System.out.println("내역이 삭제되었습니다.");
			//번호로 수정
		}else {
			System.out.println("잘못된 입력입니다.");
		}
	}
	//수정하는 기능
	public static void selectMenu() {
		System.out.println("확인 메뉴입니다.");
		System.out.println("1.일시별 확인");
		System.out.println("2.수입/지출별 확인");
		System.out.println("3.분류별 확인");
		System.out.println("4.전체 확인");
		System.out.println("5.정산");
	}
	public static void selectMenu(ArrayList<Household> list, Scanner scan) {
		System.out.println("메뉴를 선택해주세요.");
		int menu = scan.nextInt();
		if(menu == 1) {
			selectDate(scan, list);
		}else if(menu == 2) {
			selectIncome(scan, list);
		}else if(menu == 3) {
			selectType(scan, list);
		}else if (menu == 4) {
			allData(list);
		}else if(menu == 5) {
			calculate(list);
		}else {
			System.out.println("잘못된 입력입니다.");
		}
	}
	public static void selectDate(Scanner scan, ArrayList<Household> list) {
		int cnt = 1, inMoney = 0, outMoney = 0;
		System.out.println("일시를 입력해주세요.");
		String date = scan.next();
		Household hh = new Household(date,"","","","");
		System.out.println("일시 : " + date + "별 내역입니다.");
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).equals(hh)) {
				System.out.print(cnt + "." + list.get(i));
				if(list.get(i).income.equals("수입")) {
					 inMoney += Integer.parseInt(list.get(i).pay.replaceAll("[^0-9]",""));
				}else if(list.get(i).income.equals("지출")) {
					 outMoney += Integer.parseInt(list.get(i).pay.replaceAll("[^0-9]",""));
				}
				cnt++;
			}
		}
		if(cnt == 1) {
			System.out.println(date + "에 맞는 내역이 없습니다.");
		}
		System.out.println("총 수입 : " + inMoney + "원");
		System.out.println("총 지출 : " + outMoney + "원");
	}
	//일시별 내역보는 기능
	public static void selectIncome(Scanner scan, ArrayList<Household> list) {
		int cnt = 1, inMoney = 0, outMoney = 0;
		System.out.println("수입/지출을 입력해주세요.");
		String income = scan.next();
		Household hh = new Household("",income,"","","");
		System.out.println(income + "별 내역입니다.");
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).equals(hh)) {
				System.out.print(cnt + "." + list.get(i));
				if(list.get(i).income.equals("수입")) {
					 inMoney += Integer.parseInt(list.get(i).pay.replaceAll("[^0-9]",""));
				}else if(list.get(i).income.equals("지출")) {
					 outMoney += Integer.parseInt(list.get(i).pay.replaceAll("[^0-9]",""));
				}
				cnt++;
			}
		}
		if(cnt == 1) {
			System.out.println(income + "에 맞는 내역이 없습니다.");
		}
		if(income.equals("수입")) {
			System.out.println("총 수입 : " + inMoney + "원");
		}
		if(income.equals("지출")) {
			System.out.println("총 지출 : " + outMoney + "원");
		}		
	}
	//수입/지출별 내역보는 기능
	public static void selectType(Scanner scan, ArrayList<Household> list) {
		int cnt = 1, inMoney = 0, outMoney = 0;
		System.out.println("분류를 입력해주세요.");
		String type = scan.next();
		Household hh = new Household("","","",type,"");
		System.out.println("분류 : " + type + "별 내역입니다.");
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).equals(hh)) {
				System.out.print(cnt + "." + list.get(i));
				if(list.get(i).income.equals("수입")) {
					 inMoney += Integer.parseInt(list.get(i).pay.replaceAll("[^0-9]",""));
				}else if(list.get(i).income.equals("지출")) {
					 outMoney += Integer.parseInt(list.get(i).pay.replaceAll("[^0-9]",""));
				}
				cnt++;
			}
		}
		if(cnt == 1) {
			System.out.println(type + "에 맞는 내역이 없습니다.");
		}
		System.out.println("총 수입 : " + inMoney + "원");
		System.out.println("총 지출 : " + outMoney + "원");
	}
	//분류별 내역보는 기능
	public static void allData(ArrayList<Household> list) {
		System.out.println("전체내역입니다.");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(i+1 + "." + list.get(i));
		}
	}
	//전체 내역보는 기능
	public static void calculate(ArrayList<Household> list) {
		int inMoney = 0;
		int outMoney = 0;
		System.out.println("정산내역입니다.");
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).income.equals("수입")) {
				 inMoney += Integer.parseInt(list.get(i).pay.replaceAll("[^0-9]",""));
			}else if(list.get(i).income.equals("지출")) {
				 outMoney += Integer.parseInt(list.get(i).pay.replaceAll("[^0-9]",""));
			}
		}
		System.out.println("총 수입 : " + inMoney + "원");
		System.out.println("총 지출 : " + outMoney + "원");
	}
	//정산하는 기능
	public static ArrayList<Household> sort(ArrayList<Household> list) {
		for(int j = 0; j < list.size(); j++) {
			for(int i = 0; i < list.size()-1; i++) {
				int od = Integer.parseInt(list.get(i).date.replaceAll("[^0-9]",""));
				int nd = Integer.parseInt(list.get(i+1).date.replaceAll("[^0-9]",""));
				if(od  > nd) {
					Household h = list.get(i);
					list.remove(h);
					list.add(h);
				}
			}
		}
		return list;
	}
	//리스트를 정렬하는 기능
}
class Household{
	String date; 
	String income;
	String pay;
	String type;
	String content;
	//가계부라는 배열 한줄마다 들어가는 값은 날짜 하나, 수입/지출 하나, 금액 하나, 분류 하나, 내용하나이다.
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((income == null) ? 0 : income.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "연도 : " + date + " | 수입/지출 : " + income + " | 금액 : " + pay + " | 분류 : " + type + " | 내용 : "
				+ content + "\n";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Household other = (Household) obj;
		if(date.equals(other.date) && income.equals(other.income) && pay.equals(other.pay) && type.equals(other.type) && content.equals(other.content) ) {
			return true;
		}
		if(other.date != "") {
			if(date.equals(other.date) && other.income == "" && other.pay == "" && other.type == "" && other.content == "") {
				return true;
			}
		}if(other.income != "") {
			if(income.equals(other.income) && other.date == "" && other.pay == "" && other.type == "" && other.content == "") {
				return true;
			}
		}if(other.type != "") {
			if(type.equals(other.type) && other.income == "" && other.pay == "" && other.date == "" && other.content == "") {
				return true;
			}
		}
		return false;
	}
}