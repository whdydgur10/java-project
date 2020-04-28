package Day8;

public class ExamRecursiva {

	public static void main(String[] args) {
		//System.out.println(factorial(5));
		int num = 5;
		int res = 1;
		for(int i = 1; i <=num; i++) {
			res *= i;
		}
		if(num < 0) {
			System.out.println(0);
		}else {
			System.out.println(res);
		}
	}
	/*public static int factorial(int num) {
		if (num == 1 || num == 0) {
			return 1; //기저조건 : 무한반복을 피하는 특정조건. 리턴값이 num-1이 아니라 반복문을 빠져나간다.
		}
		if (num < 0) {
			return 0;
		}
		System.out.println(num);
		return num * factorial(num -1);
		
	}*//* -> 6 -> 8 -> 9 -> 12 -> 15(n=5) -> 8 -> 9 -> 12 -> 15(n=4) -> 8 -> 9 -> 12 -> 15(n=3) -> 8 -> 9 -> 12 
	-> 15(n=2) -> 8 -> 9 -> 12 -> 15(n=1) -> 8 -> 9 -> 10 -> 15(n=2) -> 15(n=3) -> 15(n=4) -> 15(n=5) -> 6 -> 7*/
	//for문의 반대												(		실			행			중		)

}
