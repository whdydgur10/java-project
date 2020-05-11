package Day13;

public class ExamString1 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1 == str2);
		//문자열 리터럴은 재사용을 하기 때문에 str1에서 이미 "abc"라는 문자열을 생성했기 때문에 str2도 같은 문자열을 재사용했다.
		String str3 = new String("abc");
		String str4 = new String("abc");
		str3 = str3.intern();
		str4 = str4.intern();
		//"abc"가 상수에 등록이 되어있고 str3과 str4를 새롭게 만들지만 이미 "abc"인 상수가 있어 주소값을 가져왔다.
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		//str3와 str4는 "abc"라는 문자열을 가지고 새로운 객체를 만들어 다른 주소를 가진다.
		String str6 = "abcdabcd";
		String str7 = str6.replace("abc", "def");
		System.out.println(str6);
		System.out.println(str7);
		String str8 = str6.replaceAll("abc", "def");
		System.out.println(str6);
		System.out.println(str8);
		String str9 = "123456-1234567";
		String reg[] = str9.split("-");
		for(String tmp : reg) {
			System.out.println(tmp);
		}//split equals indexOf 자주쓰임
		System.out.println(str9.substring(0));
		String str10 = String.join("^", reg);
		System.out.println(str10);
	}
}
