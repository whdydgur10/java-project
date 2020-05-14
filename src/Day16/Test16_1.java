package Day16;

import java.util.*;

public class Test16_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, String> make = new HashMap<String, String>();
		//Map 인터페이스를 이용하여 객체를 만들 수 없지만 Map을 구현한 Hash map으로 저장할 수 있다. 
		int manu;
		String id, pw, pw2;
		//inputInfo(scan, make);
		while(true) {
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1.등록 2.검색 3.수정 4.삭제 5.종료");
			manu = scan.nextInt();
			if(manu == 1) {
				System.out.println("아이디를 등록합니다.");
				System.out.println("아이디를 입력해주세요.");
				id = scan.next();
				while(true) {
					System.out.println("비밀번호를 입력해주세요.");
					pw = scan.next();
					System.out.println("다시 한번 입력해주세요.");
					pw2 = scan.next();
					//make란 해쉬맵에 키 id와 값 pw를 저장
					if(pw.equals(pw2)) {
						break;
					}else {
						System.out.println("비밀번호가 다릅니다.");
					}
				}
				make.put(id, pw);
				System.out.println("등록되었습니다.");
			}else if(manu == 2) {
				System.out.println("아이디를 검색합니다.");
				System.out.print("id : ");
				id = scan.next();
				if(make.containsKey(id)) {
					//make란 해쉬맵에 키 id가 있을 경우
					System.out.printf("id : %s의 pw는 %s입니다.\n",id,make.get(id));
					//id란 키의 값을 반환
				}else {
					System.out.printf("%s는 없는 아이디입니다.\n",id);
				}
			}else if(manu == 3) {
				System.out.println("비밀번호를 수정합니다.");
				System.out.println("아이디를 입력해주세요.");
				System.out.println("id : ");
				id = scan.next();
				System.out.println("비밀번호를 입력해주세요.");
				pw = scan.next();
				if(make.containsKey(id) && pw.equals(make.get(id))) {
					//make란 해쉬맵에 키 id가 있을 경우
					while(true) {
						System.out.println("수정할 비밀번호를 입력해주세요.");
						pw = scan.next();
						System.out.println("다시 한번 입력해주세요.");
						pw2 = scan.next();
						//make란 해쉬맵에 키 id와 값 pw를 저장
						if(pw.equals(pw2)) {
							break;
						}else {
							System.out.println("비밀번호가 다릅니다.");
						}
					}
					make.put(id, pw);
					System.out.println("비밀번호가 수정되었습니다.");
				}else if(make.containsKey(id) && !pw.equals(make.get(id))) {
					System.out.println("비밀번호가 다릅니다.");
				}else {
					System.out.printf("%s는 없는 아이디입니다.\n",id);
				}
			}else if(manu == 4) {
				System.out.println("아이디를 삭제합니다.");
			}else if(manu == 5) {
				System.out.println("종료합니다.");
				scan.close();
				break;
			}else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
	public static void printMenu() {
		System.out.println("====메뉴====");
		System.out.println("1. 등록");
		System.out.println("2. 검색");
		System.out.println("3. 수정");
		System.out.println("4. 종료");
		System.out.println("===========");
		System.out.print("메뉴를 선택하세요. : ");
	}
	public static void inputInfo(Scanner scan, Map<String, String> map) {
		//콘솔창에 입력과 맵을 가져왔다.
		System.out.println("아이디를 등록합니다.");
		System.out.println("아이디를 입력해주세요.");
		System.out.print("ID : ");
		String id = scan.next();
		//콘솔창에 입력을 받는다.
		while (true) {
			System.out.println("비밀번호를 입력해주세요.");
			System.out.print("PW : ");
			String pw = scan.next();
			System.out.println("다시 한번 입력해주세요.");
			System.out.print("PW : ");
			String pw2 = scan.next();
			if(pw.equals(pw2)) {
				map.put(id, pw);
				System.out.println("등록되었습니다.");
				break;
			}else {
				System.out.println("비밀번호가 다릅니다.");
			}
		}
	}
	public static void searchInfo(Scanner scan, Map<String, String> map) {
		System.out.println("아이디를 검색합니다.");
		System.out.println("아이디를 입력해주세요.");
		System.out.println("ID : ");
		String id = scan.next();
		String pw = map.get(id);
		if(pw == null) {
			System.out.printf("%s는 없는 아이디입니다.\n",id);
		}else {
			System.out.printf("id : %s의 pw는 %s입니다.\n",id,pw);
		}
	}
	public static void adjustInfo(Scanner scan, Map<String, String> map) {
		System.out.println("비밀번호를 수정합니다.");
		System.out.println("아이디를 입력해주세요.");
		System.out.println("ID : ");
		String id = scan.next();
		System.out.println("비밀번호를 입력해주세요.");
		System.out.print("PW : ");
		String pw = scan.next();
		if(pw.equals(map.get(id))) {
			while (true) {
				System.out.println("수정할 비밀번호를 입력하세요.");
				System.out.print("PW : ");
				pw = scan.next();
				System.out.println("다시 한번 입력하세요.");
				System.out.print("PW : ");
				String pw2 = scan.next();
				if(pw.equals(pw2)) {
					map.put(id, pw);
					break;
				}else {
					System.out.println("비밀번호가 다릅니다.");
				}
			}
		}
	}
}
