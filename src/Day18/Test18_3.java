package Day18;

import java.util.*;
import java.util.regex.Pattern;

public class Test18_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		EnglishDictionary edy = new EnglishDictionary();
		Word apple = new Word("Apple", "사과");
		Word apple2 = new Word("apple", "사과");
		Word banana = new Word("banana", "바나나");
		edy.printDictionary(edy.dictionary);
		apple.printWord(apple.word);
		banana.printWord(banana.word);
		apple.printWord(apple2.word);

	}

}
class Word{
	String word;
	List<String>wordClass = new ArrayList<String>();
	List<String>meaning = new ArrayList<String>();
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
}
class Dic extends Word{
	List<String> list = new ArrayList<String>();
	void addWord(String word, String mean) {
		list.add(word);
		meaning.add(mean);
		wordClass.add(word);
	}
	void printWord(String word) {
		
	}
}
/*class Word extends EnglishDictionary{
	ArrayList<String> word = new ArrayList<String>();
	public Word(String word,String meaning) {
		String word2 = word.toLowerCase();
		if(!dictionary.contains(word2)) {
			dictionary.add(word2);
			this.word.add(meaning);
		}else {
			System.out.println(word2 + "은(는) 있습니다.");
		}
	}
	public void printWord(ArrayList<String> list) {
		System.out.println(list);
		for(String tmp : list) {
			System.out.print(tmp + " ");
		}
		System.out.println();
	}
}
class EnglishDictionary{
//클래스 영어사전
	static ArrayList<String> dictionary = new ArrayList<String>();
	//문자열 배열 : //영어사전
	//문자열을 입력받으면 : //단어를 입력하면
		//문자열을 입력받았을 때 단어가 아니라면 실행하지 않는다 : //영어단어가 아닌 것을 입력 받았을 때 밑에 행동을 하지 않는다	
			//입력받을 때 대문자는 소문자로 바꿔서 문자열 배열에 넣는다 : //단어가 대문자로 쓰여있으면 소문자로 바꿔서 영어사전에 추가한다
	public void printDictionary(ArrayList<String> list) {
		int cont = 1;
		for(String tmp : list) {
			System.out.printf("%d.%s\n",cont,tmp);
			cont++;
		}
	}
		//문자열 배열순을 알파벳순으로 바꾼다 : //영어사전의 단어들을 a-z순으로 한다
	@Override
	public String toString() {
		return "EnglishDictionary";
	}
	
	
	//문자열 배열에 저장된 배열과 몇 개의 문자열이 있는지 모두 보여준다 : //영어사전에 저장된 단어들과 단어의 갯수들을 알려준다
	
	
	//문자열 배열에 원하는 단어를 말했을때 : //영어사전에 단어가 있는지 찾을 때
	//	있으면 그 단어를 출력하고 수정할 내용이 있는지 물어본다 : //있으면 단어를 볼 수 있고 수정할 수 있다
	//	없으면 없다고 알려주고 추가할지 물어본다 : //없으면 내용을 추가할 수 있다
		
	//문자열 배열에 원하는 뜻을 말해주면 : //영어사전에 의미를 찾으면
	//	그 뜻을 가진 단어들을 나타낸다 : //같은 의미를 가진 단어들을 볼 수 있다
	
}*/