package Day14;

import java.util.Random;

public class ExamRandom {

	public static void main(String[] args) {
		double r1 = Math.random();
		//0보다 크거나 같고 1보다 작은 랜덤한 수
		System.out.println(r1);
		Random random = new Random();
		//현재시간을 기준으로 random 객체를 생성
		//시드값에 대한 랜덤수를 만들기 때문에 시드값이 고정되어 있으면 랜덤값도 고정되어 있다.
		double r2 = random.nextDouble();
		System.out.println(r2);
		double r3 = new Random().nextDouble();
		System.out.println(r3);
		//r3라는 새로운 랜덤객체를 만들었기 때문에 계속 값이 바뀐다.
		double r4 = random.nextDouble();
		System.out.println(r4);
		//100의 시드값을 가진 random객체를 통해 r4를 만들었으므로 고정값을 갖는다.
		String str = "123 afd \ta1 \n";
		System.out.println(str.trim().charAt(0));
		//trim()은 결과가 String이기 때문에 바로 charAt()을 호출할 수 있다.
		//a1기준으로 왼쪽 \t공백 삭제  ""기준으로 \n공백 삭제
		int max = 10, min = 1;
		int ran1 = (int)(Math.random()*(max-min+1)+min);
		//0부터 시작이기 때문에 +1을 해줘야 1부터 값을 얻는다.
		System.out.println(ran1);
		int ran2 = random.nextInt(max-min+1) + min;
		System.out.println(ran2);
		//nextInt(a) 0 ~ a 사이의 랜덤한 수

	}

}
