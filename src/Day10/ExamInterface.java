package Day10;

public class ExamInterface {

	public static void main(String[] args) {
		
	}

}
interface RemoteController{
	int num = 10; //(public)(final)int num = 10;
	public int chUp(int ch);
	public int chDown(int ch);
	public int volUp(int vol);
	public int volDown(int vol);
	//멤버 변수가 없다. 추상메소드
	public default void test() {
		
	}
	//인터페이스에 메소드를 추가함에 따라 구현하기 위한 클래스들에게도 그 메소드를 오버라이딩을 해야하는 번거로움이 있어
	//default메소드를 사용한다.필요한 구현클래스에서만 사용하면 된다.
}
class TvRemoteController implements RemoteController{
	public int chUp(int ch) {
		return ++ch;
	}
	public int chDown(int ch) {
		return --ch;
	}
	public int volUp(int vol) {
		return ++vol;
	}
	public int volDown(int vol) {
		return --vol;
	}
	//메소드 오버라이딩을 통한 구현 필수
}