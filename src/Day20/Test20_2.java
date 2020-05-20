package Day20;

import java.util.*;

public class Test20_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Word w;
		HashMap<String, HashMap<String, ArrayList<String>>> wor;
		for(int i = 0; i < 3; i++) {
			System.out.println(setWord(scan));
		}
	}
	public static HashMap<String, HashMap<String, ArrayList<String>>> setWord(Scanner scan){
		HashMap<String, HashMap<String, ArrayList<String>>> h1 = new HashMap<String, HashMap<String, ArrayList<String>>>();
		HashMap<String, ArrayList<String>> h2 = new HashMap<String, ArrayList<String>>();
		ArrayList<String> means = new ArrayList<String>();
		String part = "";
		System.out.print("단어 : ");
		String word = scan.next();
		System.out.print("뜻 : ");
		String mean = scan.next();
		means.add(mean);
		h2.put(word,means);
		System.out.println("내용을 추가하시겠습니까?");
		System.out.println("1.예");
		System.out.println("2.아니오");
		int manu = scan.nextInt();
		if(manu == 1) {
			while(true) {
				manu = 0;
				System.out.println("1.등록");
				System.out.println("2.종료");
				manu = scan.nextInt();
				if(manu == 1) {
					System.out.print("폼사 : ");
					part = scan.next();
					System.out.println("뜻 : ");
					mean = scan.next();
					means.add(mean);
					h2.put(part, means);
				}else if(manu == 2) {
					break;
				}else {
					System.out.println("잘못된 입력입니다.");
				}
			}
		}else if(manu == 2) {
			h1.put(word, h2);
			return h1;
			
		}else {
			System.out.println("잘못된 입력입니다.");
		}
		h1.put(word, h2);
		return h1;
	}
	public static boolean addWord() {
		return true;
	}
}
class Wordt{
	HashMap<String, HashMap<String, ArrayList<String>>> word = new HashMap<String, HashMap<String, ArrayList<String>>>();
	HashMap<String, ArrayList<String>> parts = new HashMap<String, ArrayList<String>>();
	ArrayList<String> means = new ArrayList<String>();
	
}
class EnglishDitionaryt{
	static ArrayList<Wordt> englishdictionary = new ArrayList<Wordt>();
}