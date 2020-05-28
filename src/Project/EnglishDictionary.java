package Project;

import java.util.*;

public class EnglishDictionary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Word w = new Word();
		System.out.println(w.makeWord(scan));

	}

}

class Word{
	String part;
	String mean;
	ArrayList<String> parts = new ArrayList<String>();
	Map<String, ArrayList<String>> words = new HashMap<String, ArrayList<String>>();
	
	public Map<String, ArrayList<String>> makeWord(Scanner scan) {
		Map<String, ArrayList<String>> words = new HashMap<String, ArrayList<String>>();
		ArrayList<String> list = new ArrayList<String>();
		System.out.print("단어 : ");
		String word = scan.next();
		System.out.println("뜻 : ");
		mean = scan.next();
		list.add(mean);
		System.out.print(word + "에 대한 내용을 추가하시겠습니까? y/n ");
		char is = scan.next().charAt(0);
		while(is == 'y' || is == 'Y') {
			System.out.println(word + "의 다른 형태");
			part = scan.next();
			System.out.println("뜻 : ");
			mean = scan.next();
			list.add(part);
			list.add(mean);
			System.out.print(word + "에 대한 내용을 추가하시겠습니까? y/n ");
			is = scan.next().charAt(0);
			if(!(is == 'n' || is == 'N' || is == 'y' || is == 'Y')) {
				System.out.println("잘못된 입력입니다.");
			}
		}
		words.put(word, list);
		return words;
	}

	@Override
	public String toString() {
		return "Word " + part + ", mean=" + mean + ", parts=" + parts + ", words=" + words + "]";
	}
	
	
}
