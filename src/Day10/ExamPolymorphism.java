package Day10;

public class ExamPolymorphism {

	public static void main(String[] args) {
		Tv t = new Tv();
		CaptionTv ct = new CaptionTv();
		Tv t1 = new CaptionTv();
		//조상타입의 참조변수로 자손타입의 인스턴스 참조 가능 
		//t1은 Tv타입의 멤버변수 2개를 사용하겠다. = Caption타입의 멤버변수 3개 중  (3개중 2개 사용하겠다.)
		//CaptionTv ct1 = new Tv();
		//자손타입의 참조변수로 조상타입의 인스턴스 참조 불가능
		//ct1은 Caption타입의 멤버변수 3개를 사용하겠다. = Tv타입의 멤버변수 2개 중  (2개중 3개 사용하겠다.)성립이 안됌
		//리스트에 데이터를 담을 때 사용
		t = ct;
		//조상타입(t) <-(=) 자손타입(ct) 항상 가능
		ct =(CaptionTv)t ;
		//자손타입(ct) <-(=) 자료형변환(Caption) 조상타입(t) 조건부 가능. 상황에 따라 ClassCastException이 발생
		SmartTv st = new SmartTv();
		ct = new CaptionTv();
		Tv.display(st);
		Tv.display(ct);
		//Tv t => t = ct or t = st
	}
}
class Tv{
	boolean power;
	int channel;
	void power() {
		power = !power;
	}//토글작업 : 버튼 on/off
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
	static void display(Tv t) {
		if(t instanceof CaptionTv) {
			//t가 CaptionTv로 자료형변환이 가능하면/ CaptionTv가 Tv의 자손이면
			System.out.println("CaptionTv");
		}else if(t instanceof SmartTv) {
			//t가 SmartTv로 자료형변환이 가능하면/ SmartTv가 Tv의 자손이면
			System.out.println("SmartTv");
		}//아래 메소드들을 하나로 묶음
	}
	/*static void display(CaptionTv t) {
		System.out.println("CaptionTv");
	}
	static void display(SmartTv t) {
		System.out.println("SmartTv");
	}*/
}
class CaptionTv extends Tv{
	String text;
	void caption() {
		System.out.println(text);
	}
}
class SmartTv extends Tv{
	String ip;
}