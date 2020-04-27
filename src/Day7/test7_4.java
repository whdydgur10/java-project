package Day7;

public class test7_4 {

	public static void main(String[] args) {
		kiaCar car = new kiaCar();
		car.printInfo();//클래스메소드는 KiaCar.printInfo()로 불러올 것
		car.pringCarInfo();
		kiaCar car2 = new kiaCar("뉴그랜버드",6);
		//생성자 오버로딩 초기값 설정
		car2.pringCarInfo();
		kiaCar.printInfo();
		for(int i = 0; i < 10; i++) {
			car2.accelerator();
			car2.printSpeed();
		}
		for(int i = 0; i < 20; i++) {
			car2.breake();
			car2.printSpeed();
			if(car2.speed == 0) {
				car2.turnOff();
				break;
			}
		}

	}

}
class kiaCar {
	private static String factory = "KIA";
	private static int salesNumber = 0;
	int wheel, speed;
	boolean power;
	String carName, carNum;
	public static String getFactory() {
		return factory;
	}
	public static int getSalesNumber() {
		return salesNumber;
	}
	public static void printInfo() {
		System.out.printf("제조사 : %S\n",factory);
		System.out.printf("판매량 : %S대\n",salesNumber);
	}
	public void turnOn() {
		System.out.println("시동온");
		power = true;
	}
	public void turnOff() {
		if (speed == 0) {
			System.out.println("시동오프");
			power = false;
		}else {
			System.out.println("시동오프 불가");
		}
	}
	public void accelerator() {
			speed++;
		
	}
	public void breake() {
		if (speed > 0) {
			speed--;
		}
	}
	public void printSpeed() {
		System.out.printf("속도는 %dkm/h\n",speed);
	}
	public void pringCarInfo() {
		System.out.printf("차종 : %s\n",carName);
		System.out.printf("바퀴수 : %d\n",wheel);
		printSpeed();
	}
	public kiaCar() {
		wheel = 4;
		salesNumber++;
		//메인에서 객체를 생성할때마다 1씩 증가해준다.
		carName = "";
	}
	public kiaCar(String carName, int wheel) {
		this.carName = carName;
		this.wheel = wheel;
		//멤버 변수의 이름과 매개변수의 이름이 같으면 매개변수의 우선순위가 높다.
		//멤버 변수를 선언하기 위해 this.멤버 변수 = 매개변수로 적는다.
		salesNumber++;
	}
}