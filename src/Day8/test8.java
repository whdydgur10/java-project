package Day8;

public class test8 {

	public static void main(String[] args) {
		int num1 = 1, num2 = 2;
		int res = sum2(num1, num2, 3);
		System.out.println(res);
	}
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}//5 -> 6 -> 7 -> 10 -> 11 -> 7 -> 8 -> 9
	//void값이면 sum메소드를 끝까지 돌렸다가 넘어가고 return값이 있으면 바로 넘어간다.
	//실행은 메인에서 하기때문에 마지막 실행문은 메인의 마지막줄이다.
	public static int sum2(int num1, int num2, int num3) {
		return sum(num1, num2) + num3;
	}//5 -> 6 -> 7 -> 15 -> 16 -> 10 -> 11 -> 16 -> 7 -> 8 -> 9
}
