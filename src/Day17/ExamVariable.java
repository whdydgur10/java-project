package Day17;

import java.util.*;

public class ExamVariable {

	public static void main(String[] args) {
		Corona c1 = new Corona();
		List<Corona> list = new ArrayList<Corona>();
		list.add(c1);
		Corona c2 = new Corona();
		list.add(c2);
		System.out.println(Corona.cnt);
		System.out.println(list.size());
	}

}
class Corona {
	String name;
	String adrres;
	static int cnt;
	int age;
	Corona() {
		cnt++;
	}
}