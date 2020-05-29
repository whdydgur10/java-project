package Project;

import java.util.*;

public class EnglishDictionary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Word w = new Word();
		Dictionary d = new Dictionary();
		System.out.println(w.makeWord(scan, d));
	}

}
class Dictionary{
	ArrayList<String> word = new ArrayList<String>();

}
class Word{
	ArrayList<String> parts = new ArrayList<String>();
	Map<String, ArrayList<String>> words = new HashMap<String, ArrayList<String>>();
	public Map<String, ArrayList<String>> makeWord(Scanner scan, Dictionary d){
		Map<String, ArrayList<String>> words = new HashMap<String, ArrayList<String>>();
		ArrayList<String> list = new ArrayList<String>();
		char is = 'y';
		while(is == 'y') {
			System.out.print("단어 : ");
			String word = scan.next();
			if(d.word.contains(word)) {
				System.out.println("이미 있는 단어입니다.");
				is = 'n';
			}else {
				d.word.add(word);
				System.out.print("뜻 : ");
				String mean = scan.next();
				list.add(mean);
				System.out.print(word + "에 대한 내용을 추가하시겠습니까? y/n ");
				is = scan.next().charAt(0);
				while(is == 'y' || is == 'Y') {
					System.out.print(word + "의 다른 형태 : ");
					String part = scan.next();
					System.out.print("뜻 : ");
					mean = scan.next();
					list.add(part);
					list.add(mean);
					System.out.print(word + "에 대한 내용을 추가하시겠습니까? y/n ");
					is = scan.next().charAt(0);
					if(!(is == 'n' || is == 'N' || is == 'y' || is == 'Y')) {
						System.out.println("잘못된 입력입니다.");
					}
				}
			}
			words.put(word, list);
		}
		for(String tmp : list) {
			System.out.print(tmp + " ");
		}
		return words;
	}

	@Override
	public String toString() {
		return "Word parts=" + parts + ", words=" + words ;
	}
	
	
}
