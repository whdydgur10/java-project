package Day54;

import java.util.ArrayList;

public class test54_3 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int min = 1;
		int max = 10;
		System.out.println(setList(list,min,max));
		
	}
	public static ArrayList<Integer> setList(ArrayList<Integer> list, int min, int max) {
		for(;min <= max; min++) {
			list.add(min);
		}
		return list;
	}
}
