package Day13;

public class ExamException6 {

	public static void main(String[] args) {
		try {
			throw new MyException(100, "예외");
			//강제로 발생
		}catch (MyException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println("Exception");
		}

	}

}
class MyException extends Exception{
	//예외처리 클래스를 만들기 위해선 최상위 Exception을 상속받아야 한다.
	private final int ERR_CODE;
	public MyException(int err_code, String msg) {
		super(msg);
		ERR_CODE = err_code;
	}
	public MyException() {
		ERR_CODE = -1;
	}
	public MyException(int err_code) {
		ERR_CODE = err_code;
	}
	public MyException(String msg) {
		super(msg);
		ERR_CODE = -1;
	}
	public int getERR_CODE() {
		return ERR_CODE;
	}
	public String getMessage() {
		
		return "ERR_CODE : " + ERR_CODE + ", MSG : " + super.getMessage();
	}
}