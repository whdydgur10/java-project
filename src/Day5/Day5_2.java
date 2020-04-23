package Day5;

import java.util.Scanner;

public class Day5_2 {

	public static void main(String[] args) {
		int y, n;
		Scanner scan = new Scanner(System.in);
		Iphone phone = new Iphone();
		int b = phone.getBolum_s();
		System.out.print("설정하시겠습니까? 예-0 아니오-1 : ");
		y = scan.nextInt();
		String phone_n = phone.getPhone_num();
		String b_s;
		while(y == 0) {
			System.out.print("1.취소 2.볼륨 3.번호 : ");
			n = scan.nextInt();
			switch(n) {
			case 1:
				break;
			case 2:
				System.out.print("볼륨을 키우려면 up, 낮추려면 down을 입력하세요. : ");
				b_s = scan.nextLine();
					if(b_s == "up") {
						++b;
						phone.setBolum_s(b);
						break;
					}else if(b_s == "down") {
						--b;
						phone.setBolum_s(b);
						break;
					}
			case 3:
				System.out.print("전화번호를 입력해주세요. : ");
				phone_n = scan.nextLine();
				phone.setPhone_num(phone_n);
				break;
			}
			System.out.print("다시 설정하겠습니까? 예-0 아니오-1 : ");
			y = scan.nextInt();
		}
		phone.phone_s();
	}

}
class Iphone {
	public static String make;
	public String phone_num = "010-1234-5678";
	public int bolum_s = 5;
	public void bolumup(int s) {
		bolum_s = s;
	}
	public void set_num(String s) {
		phone_num = s;
	}
	//볼륨 줄이고 올리고
	//전화번호설정
	public String getPhone_num() {
		return phone_num;
	}
	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}
	public int getBolum_s() {
		return bolum_s;
	}
	public void setBolum_s(int bolum_s) {
		this.bolum_s = bolum_s;
	}
	public void phone_s() {
		System.out.printf("현재 설정된 볼륨은 %d이고, 전화번호는 %s입니다.",bolum_s,phone_num);
	}
}