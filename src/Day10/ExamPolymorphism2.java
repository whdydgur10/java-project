package Day10;

public class ExamPolymorphism2 {

	public static void main(String[] args) {
		Car[] arr = new Car[10];
		//입고된 차량 관리 배열 전체차량 관리이기때문에 Car클래스로 연결한다.
		arr[0] = new KiaCar();
		arr[1] = new HyundaiCar();
		//부모클래스를 통해 하나의 배열로 통합
		
		/*KiaCar[] karr = new KiaCar[10];
		HyundaiCar[] harr = new HyundaiCar[10];
		//제조사별 차량 관리 배열 제조사별차량 관리이기때문에 Kia,Hyundai클래스로 각각 연결한다.
		karr[0] = new KiaCar();
		harr[1] = new HyundaiCar();*/
		//각각의 자식클래스로 각각의 배열
		Car[] carr1 = new Car[10];
		carr1[0] = new KiaCar("모닝");
		carr1[1] = new KiaCar("k3");
		carr1[2] = new KiaCar("쏘울");
		carr1[3] = new HyundaiCar("아반떼");
		carr1[4] = new HyundaiCar("쏘나타");
		carr1[5] = new HyundaiCar("그랜저");
		showCar(carr1);
		
	}
	public static void showCar(Car[] carr1) {
		System.out.println("입고 차량 리스트");
		for(int i = 0; i < carr1.length; i++) {
			if(carr1[i] != null) {
				if(carr1[i] instanceof KiaCar) {
					System.out.println(carr1[i].manufacturer + " : " + carr1[i].name + " : " + ((KiaCar)carr1[i]).Kia);
				}else if(carr1[i] instanceof HyundaiCar) {
					System.out.println(carr1[i].manufacturer + " : " + carr1[i].name + " : " + ((HyundaiCar)carr1[i]).Hyundai);
				}
			}
		}
	}
}
class Car{
	int wheel;
	String type, manufacturer, name;
	public Car() {
		
	}
	public Car(String manufacturer, String name) {
		this.manufacturer = manufacturer;
		this.name = name;
	}
}
class KiaCar extends Car{
	String Kia = "기아차";
	public KiaCar() {
		manufacturer = "Kia";
	}
	public KiaCar(String name) {
		super("Kia",name);
	}
}
class HyundaiCar extends Car{
	String Hyundai = "현대차";
	public HyundaiCar() {
		manufacturer = "Hyundai";
	}
	public HyundaiCar(String name) {
		super("Hyundai",name);
	}
}