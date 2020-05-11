package Day13;

public class ExamException {

	public static void main(String[] args) {
		
		try {
			//예외가 발생할 수 있는 코드
			//System.out.println(1/0);
			int arr[] = new int[4];
			arr[4] = 10;
			//예외가 발생하면 그 이후 코드는 건너뛰고 해당 catch문을 간다.
			System.out.println("Hello");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(IndexOutOfBoundsException e) {
			System.out.println("배열 관련 예외가 발생");
		}catch(Exception e) {
			System.out.println("예외 발생");
			
		}

	}

}
