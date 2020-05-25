package Project;

import java.util.*;

public class EnglishDictionary {

	public static void main(String[] args) {
		

	}

}
class Dictionary{
	Map<String, ArrayList<String>> wordParts = new HashMap<String, ArrayList<String>>();
	ArrayList<String> wordList = new ArrayList<String>();
}
class Word extends Dictionary{
	String word;
	String part;
	String mean;
	ArrayList<String> parts = new ArrayList<String>();
	public ArrayList<String> makeWord(Scanner scan) {
		ArrayList<String> list = new ArrayList<String>();
		Dictionary d = new Dictionary();
		System.out.print("단어를 입력하세요. : ");
		this.word = scan.next();
		this.part = scan.next();
		this.mean = scan.next();
		list.add(part);
		list.add(mean);
		d.wordParts.put(word, list);
		return list;
	}
	public Map<String, ArrayList<String>> makeWordParts(Scanner scan) {
		
	}
	@Override
	public String toString() {
		return "part : " + part + ", mean : " + mean;
	}
	
}
