package Day16;

import java.util.*;

public class Test16_2 {

	public static void main(String[] args) {
		HashSet<Integer> num = new HashSet<Integer>();
		ArrayList<Integer> num2 = new ArrayList<Integer>();
		int max =10, min = 1, cnt = 6;
		int num3[] = new int[cnt];
		makeSet(num, cnt, max, min);
		makeList(num2, cnt, max, min);
		makeArr(num3, max, min);
		printSet(num);
		printList(num2);
		printArr(num3);
		

	}
	static int random(int max, int min) {
		if(max < min) {
			int tmp = max;
			max = min;
			min = tmp;
		}
		return new Random().nextInt(max - min + 1) +min;
	}
	static void makeSet(HashSet<Integer> arr, int cnt, int max, int min) {
		while(arr.size() < cnt) {
			arr.add(random(max, min));
		}
	}
	static void makeList(ArrayList<Integer> arr, int cnt, int max, int min) {
		while(arr.size() < cnt) {
			int num = random(max, min);
			if(!arr.contains(num)) {
				arr.add(num);
			}
		}
	}
	static void makeArr(int[] arr, int max, int min) {
		for(int i = 0; i < arr.length; i++) {
			int num = random(max, min);
			for(int j = 0; j < i + 1; j++) {
				if(arr[j] != num) {
					arr[i] = num;
					break;
				}
			}
			if(arr[i] == 1) {
				i--;
			}
		}
	}
	static void printSet(HashSet<Integer> arr) {
		System.out.println("HashSet");
		for(Integer tmp : arr) {
			System.out.print(tmp + " ");
		}
		System.out.println();
	}
	static void printList(ArrayList<Integer> arr) {
		System.out.println("ArrayList");
		for(Integer tmp : arr) {
			System.out.print(tmp + " ");
		}
		System.out.println();
	}
	static void printArr(int[] arr) {
		System.out.println("Array");
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
	}
}
