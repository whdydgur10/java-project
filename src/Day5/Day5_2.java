package Day5;

import java.util.Scanner;

public class Day5_2 {

	public static void main(String[] args) {
		int y, n;
		Scanner scan = new Scanner(System.in);
		//scan이란 스캐너만들기
		Iphone phone = new Iphone();
		//Iphone 클래스와 연결된 phone이라는 객체를 생성
		int sound = phone.bolum_s;
		//정수형 sound는 phone이라는 객체의 bolum_s값이다.
		String number = phone.phone_num;
		//문자열 number는 phone이라는 객체의 phone_num값이다.
		String b_s;
		//문자열 b_s를 선언
		System.out.print("설정하시겠습니까? 예-0 아니오-1 : ");
		y = scan.nextInt();
		//정수형 y를 입력
		A : while(y == 0) {
		//y가 0이면 계속 실행한다
			System.out.print("1.취소 2.볼륨 3.번호 : ");
			n = scan.nextInt();
			//정수형 n을 입력
			if(n == 1) {
			//정수형 n이 1일때
				break A;
				//끝낸다
			}
			else if(n == 2) {
			//정수형 n이 2일때
				System.out.print("볼륨을 키우려면 up, 낮추려면 down을 입력하세요. : ");
				b_s = scan.next();
				//문자열 b_s를 입력
				//nextLine()은 정수형 n의 값을 입력하고 enter를 한 값이 남아있다 적용이 되어 넘어가게 된다.
				if(b_s.equals("up")) {
				//문자열 b_s에 "up"을 적었을 때
				//==는 주소값을 비교하고 equals는 내용을 비교한다.
					sound += 1;
					//정수형 sound를 +1한다
					phone.setBolum_s(sound);
					phone.bolum_s(sound);
					//phone이라는 객체를 통해 Bolum_s를 sound로 설정한다.
				}else if(b_s.compareTo("down") == 0) {
				//문자열 b_s에 "down"을 적었을 때
				//a.compareTo(b) 숫자를 비교할 때는 -1, 0, 1만을 나타내고 문자열은 다양하게 나타낸다.
					sound -= 1;
					//정수형 sound를 -1한다
					phone.setBolum_s(sound);
					phone.bolum_s(sound);
					//phone이라는 객체를 통해 Bolum_s를 sound로 설정한다.
				}else {
					System.out.println("잘못입력하셨습니다.");
				}
			}
			else if(n == 3) {
				System.out.print("전화번호를 입력해주세요. : ");
				number = scan.nextLine();
				number = scan.nextLine();
				//문자열 number를 입력
				//정수형 n의 값을 입력하고 남은 enter값을 날려주기 위해 nextLine을 한번 더 사용했다.
				phone.set_num(number);
				//phone이라는 객체를 통해 Phone_num을 number로 설정한다
			}
			System.out.print("다시 설정하겠습니까? 예-0 아니오-1 : ");
			y = scan.nextInt();
			//정수형 y를 입력
		}
		phone.phone_s();
		//phone이라는 객체를 통해 phone_s을 실행한다
	}

}
class Iphone {
//class 클래스명
	static String make;
	//class변수 제조사
	String phone_num = "010-1234-5678";
	//객체변수 폰번호
	int bolum_s = 5;
	//객체변수 볼륨크기
	public void bolum_s(int s) {
	//객체메소드 볼륨조절
		bolum_s = s;
	}
	public void set_num(String s) {
	//객체메소드 번호설정
		phone_num = s;
	}
	//볼륨 줄이고 올리고
	//전화번호설정
	public String getPhone_num() {
	//Phone_num 가져오기
		return phone_num;
	}
	public void setPhone_num(String phone_num) {
	//Phone_num 설정하기 문자열 폰번호
		this.phone_num = phone_num;
	}
	public int getBolum_s() {
	//Bolum_s 가져오기
		return bolum_s;
	}
	public void setBolum_s(int bolum_s) {
	//Bolum_s 설정하기 정수 볼륨
		this.bolum_s = bolum_s;
	}
	public void phone_s() {
	//객체메소드
		System.out.printf("현재 설정된 볼륨은 %d이고, 전화번호는 %s입니다.",bolum_s,phone_num);
	}
}