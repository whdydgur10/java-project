package Day21;

import java.util.*;

public class Test21_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Word> list = new ArrayList<Word>();
		Word w = null;
		char menu = '1';
		do {
			printMenu();
			menu = scan.next().charAt(0);
			switch(menu) {
			case '1' :
				System.out.println("단어 등록하기");
				w = inputAllWord(scan);
				if(insertWord(w, list)) {
					System.out.println("단어 : " + w.word);
					System.out.println("등록 완료");
				}else {
					System.out.println("단어 : " + w.word);
					System.out.println("등록 실패");
				}
				break;
			case '2' :
				w = inputAllWord(scan);
				if(modifyWord(w, list)) {
					System.out.println("단어 : " + w.word);
					System.out.println("수정 완료");
				}else {
					System.out.println("단어 : " + w.word);
					System.out.println("수정 실패");
				}
				break;
			case '3' :
				w = inputSearchWord(scan);
				if(deleteWord(w, list)) {
					System.out.println("단어 : " + w.word);
					System.out.println("삭제 완료");
				}else {
					System.out.println("단어 : " + w.word);
					System.out.println("삭제 실패");
				}
				break;
			case '4' :
				w = inputSearchWord(scan);
				Word tmp = searchWord(w, list);
				if(tmp != null) {
					System.out.print(tmp);
					System.out.println("검색 완료");
				}else {
					System.out.println("단어 : " + w.word);
					System.out.println("검색 실패");
				}
				break;
			case '5' :
				System.out.println("프로그램 종료");
				break;	
			default:
				System.out.println("잘못된 입력");
			}
		}while(menu != '5'); 
		scan.close();	
	}
	public static void printMenu() {
		System.out.println("메뉴");
		System.out.println("1.단어 등록");
		System.out.println("2.단어 수정");
		System.out.println("3.단어 삭제");
		System.out.println("4.단어 검색");
		System.out.println("5.종료");
		System.out.print("메뉴 선택 : ");
	}
	public static boolean insertWord(Word w, ArrayList<Word> list) {
		if(list == null || w == null || list.contains(w)) {
			return false;
		}
		list.add(w);
		return true;
	}
	/*public static Word intputAllWord(Scanner scan) {
		Word w = new Word();
		char menu = 'y';
		String tmp = "";
		System.out.print("단어 : ");
		w.word = scan.next();
		while(true) {
			System.out.println("품사 뜻 추가 (y/n)");
			menu = scan.next().charAt(0);
			if(menu == 'y') {
				System.out.print("품사 : ");
				w.wordClass.add(scan.next());
				System.out.println("뜻 : ");
				w.meaning.add(scan.next());
			}else {
				break;
			}
		}
		return w;
	}*/
	public static Word inputAllWord(Scanner scan) {
		Word w = new Word();
		char menu = 'y';
		String tmp = "";
		System.out.print("단어 : ");
		w.word = scan.next();
		do {
			System.out.print("품사 : ");
		/*while(true) {
			tmp = scan.nextLine();
			if(tmp.trim().length() != 0) {
				//trim은 첫 시작글자 왼쪽, 맨 끝글자 오른쪽에 공백이 있으면 그걸 지운다. 그 공백이 없을경우 입력 끝
				//여러개릃 적을땐 스페이스로 띄우기
				break;
			}
		}*/
			while((tmp = scan.nextLine()).trim().length() == 0);
			w.wordClass.add(tmp);
			System.out.print("뜻 : ");
			while((tmp = scan.nextLine()).trim().length() == 0);
			w.meaning.add(tmp);
			System.out.println("품사와 뜻을 추가하시겠습니까(y/n)");
			menu = scan.next().charAt(0);
		}while(menu == 'y' || menu == 'Y');
		return w;
	}
	public static Word searchWord(Word w, ArrayList<Word> list) {
		System.out.println("단어 검색하기");
		if(list == null || w == null) {
			return null;
		}
		for(Word tmp : list) {
			if(tmp.equals(w)) {
				return tmp;
			}
		}
		return null;
	}
	public static Word inputSearchWord(Scanner scan) {
		System.out.print("단어 : ");
		/*Word w = new Word();
		String word = scan.next();
		w.word = word;
		return w;*/
		return new Word(scan.next(),null,null);
	}
	public static boolean deleteWord(Word w, ArrayList<Word> list) {
		System.out.println("단어 삭제하기");
		if(list == null || w == null) {
			return false;
		}/*else if(list.contains(w)) {
			list.remove(w);
			return true;
		}else {
			return false;
		}*/
		return list.remove(w);
	}
	public static boolean modifyWord(Word w, ArrayList<Word> list) {
		System.out.println("단어 수정하기");
		if(list == null || w == null || !list.contains(w) ) {
			return false;
		}
		list.remove(w);
		list.add(w);
		return true;
	}

}
class Word{
	String word;
	List<String> meaning = new ArrayList<String>();
	List<String> wordClass = new ArrayList<String>();
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
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
	@Override
	public String toString() {
		String str = "단어 : " + word + "\n";
		for(int i = 0; i < meaning.size(); i++) {
			str += (i+1) + "." + wordClass.get(i) + " " + meaning.get(i) + "\n";
		}
		/*System.out.print("뜻 : ");
		for(String tmp : meaning) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		System.out.print("품사 : ");
		for(String tmp : wordClass) {
			System.out.print(tmp + " ");
		}*/
		return str;
	}
	public Word() {
		
	}
	public Word(String word, List<String> meaning, List<String> wordClass) {
		super();
		this.word = word;
		this.meaning = meaning;
		this.wordClass = wordClass;
	}
	
}