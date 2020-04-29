package Day9;

public class ExamRecursive {

	public static void main(String[] args) {
		//CB b = new CB();
		//b.print(1);
		System.out.println(operator(100.0,'%', 1.0));
		//System.out.println(a(10));

	}
	static double operator(double max,char c, double min) {
		System.out.printf("%.1f %c %.1f\n",max,c,min);
		if (min == max) {
			return (double) max;
		} 
	  	if( max < min) {
			double tmp = max;
			max = min;
			min = tmp;
		}
		if(c == '+') {
			return (double)(min + operator(max, c, min +1 ));
		}else if(c == '-') {
			return (double)(min - operator(max, c, min +1 ));
		}else if(c == '*') {
			return (double)(min * operator(max, c, min +1 ));
		}else if(c == '/') {
			return (double)(min / operator(max, c, min +1 ));
		}else if(c == '%') {
			return (double)(min % operator(max, c, min +1 ));
		}else {
			return (double) 0;
		}
		
		
	}
	static int sum(int max, int min) {
		if( max < min) {
			int tmp = max;
			max = min;
			min = tmp;
		}
		if (min == max) {
			return min;
		}
		System.out.println(max);
		return max + sum(max-1, min);
	}
	static int a(int a) {
		if (a < 0) {
			return 0;
		}
		return a + a(a-1);
	}//재귀함수 기본형

}
/*class CA{
	public void print() {
		System.out.println("A클");
	}
}
class CB extends CA{
	public void print() {
		super.print();//print()만 적으면 CB클래스의 print()를 가져오므로 print()사이에서 재귀 호출로 스택오버플로우 에러가 발생한다.
		System.out.println("B클");
	}//오버라이딩
	public void print(int num) {
		print();
		System.out.println("B클");
	}//오버로딩
}*/