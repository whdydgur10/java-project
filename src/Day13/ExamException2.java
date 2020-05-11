package Day13;

public class ExamException2 {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 0;
		char op = '?';
		try {
			switch(op) {
			case '+' :
				System.out.println(num1+num2);
				break;
			case '-' :
				System.out.println(num1-num2);
				break;
			case '*' :
				System.out.println(num1*num2);
				break;
			case '/' :
				System.out.println(num1/num2);
				break;
			case '%' :
				System.out.println(num1%num2);
				break;
			default :
				throw new Exception("잘못된 연산자");	
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
