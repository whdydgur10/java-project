package Day20;

import java.util.*;

public class Test20_1 {
//객체이름이 고유번호인 바코드 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		EnglishDitionary eng = new EnglishDitionary();
		Word word;
		boolean conti = true;
		while(conti) {
			showManu();
			int manu = scan.nextInt();
			switch(manu) {
			case 1:
				addWord(eng.englishdictionary, makeWord(scan));
				break;
			case 2:
				adjWord(eng.englishdictionary, makeWord(scan), scan);
				break;
			case 3:
				delWord(eng.englishdictionary, makeWord(scan));
				break;
			case 4:
				showWord(EnglishDitionary.englishdictionary);
				break;
			case 5:
				conti = false;
				break;
				default :
					System.out.println("잘못된 입력입니다.");
			}
		}
	}
	public static void showManu() {
		System.out.println("메뉴를 선택해주세요.");
		System.out.println("1.영어 단어 등록");
		System.out.println("2.영어 단어 수정");
		System.out.println("3.영어 단어 삭제");
		System.out.println("4.영어 단어 검색");
		System.out.println("5.종료");
	}
	public static Word makeWord(Scanner scan) {
		Word w = new Word();
		System.out.print("단어 : ");
		String word = scan.next();
		w.word = word;
		while(true) {
			System.out.println("추가할 내용을 선택해주세요.");
			System.out.println("1.품사");
			System.out.println("2.뜻");
			System.out.println("3.종료");
			int manu = scan.nextInt(); 
			if(manu == 1) {
				System.out.print("품사 : ");
				String part = scan.next();
				w.parts.add(part);
			}else if(manu == 2) {
				System.out.println("뜻 : ");
				String mean = scan.next();
				w.means.add(mean);
			}else if(manu == 3) {
				break;
			}else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		return w;
	}
	public static boolean addWord(ArrayList<Word> dictionary, Word w) {
		System.out.println("영어 단어 등록입니다.");
		if(dictionary == null) {
			System.out.println("단어장이 없습니다.");
			return false;
		}else if(dictionary.contains(w)) {
			System.out.println("이미 있는 단어입니다.");
			return false;
		}else {
			dictionary.add(w);
			System.out.println("단어가 생성되었습니다.");
			return true;
		}
	}
	public static boolean adjWord(ArrayList<Word> dictionary, Word w, Scanner scan) {
		System.out.println("영어 단어 수정입니다.");
		if(dictionary == null) {
			System.out.println("단어장이 없습니다.");
			return false;
		}else if(!dictionary.contains(w)) {
			System.out.println("해당 단어가 없습니다.");
			return false;
		}else {
			dictionary.remove(w);
			System.out.print("뜻을 추가해주세요. : ");
			String mean = scan.next();
			w.means.add(mean);
			dictionary.add(w);
			return true;
		}
	}
	public static boolean delWord(ArrayList<Word> dictionary, Word w) {
		System.out.println("엉어 단어 삭제입니다.");
		if(dictionary == null) {
			System.out.println("단어장이 없습니다.");
			return false;
		}else if(!dictionary.contains(w)) {
			System.out.println("해당 단어는 이미 삭제되었거나 없습니다.");
			return false;
		}else {
			dictionary.remove(w);
			return true;
		}
	}
	public static void showWord(ArrayList<Word> dictionary) {
		for(Word tmp : dictionary) {
			System.out.println(tmp);
		}
	}
}
class Word{
	String word;
	ArrayList<String> means = new ArrayList<String>();
	ArrayList<String> parts = new ArrayList<String>();
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}
	@Override
	public String toString() {
		System.out.println("단어 : " + word);
		System.out.print("품사 : ");
		for(String tmp : parts) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		System.out.print(" 뜻 : ");
		for(String tmp : means) {
			System.out.print(tmp + " ");
		}
		return "";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}
}
class EnglishDitionary{
	static ArrayList<Word> englishdictionary = new ArrayList<Word>();
}