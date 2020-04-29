package Day9;

public class Test9_1 {

	public static void main(String[] args) {
		Test9_1 aaa = new Test9_1();
		System.out.println(aaa.sum(1,2));
		System.out.println(aaa.sum(1.1, 2.1));
		System.out.println(aaa.sum(1.1, 2.1, 3.1));
		System.out.println(aaa.sum(1.1, 2.1, 3.2));
		System.out.println(aaa.sum(1.1, 2.1, 3.5));
		double arr[] = new double[] {1, 2, 3, 4.1};
		System.out.println(aaa.sum(arr));
		

	}
	public int sum(int n1, int n2) {
		int c = n1 + n2;
		return c;
	}
	public double sum(double n1, double n2) {
		return n1 + n2;
	}
	public double sum(double n1, double n2, double n3) {
		return n1 + n2 + n3;
	}
	public double sum(double...ds) {
		double res = 0.0;
		for(double tmp : ds) {
			res += tmp;
		}
		//가변인자는 향상된 for문 ds(=arr)[0]배열의 tmp, ds(=arr)[1]배열의 tmp, ds(=arr)[2]배열의 tmp
		return res;
	}
}
