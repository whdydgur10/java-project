package Day6;

import java.util.Scanner;

public class test6_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Lotto lotto = new Lotto();
		int cont = 8;
		Lotto[] lonum = new Lotto[8];
		System.out.print("로또 번호 입력 : ");
		for(int i = 0; i < cont; i++) {
			lonum[i] = scan.nextInt();
			lotto.setPlayer[i] = (lonum[i]);
		}
		for(int i = 0; i < cont; i++) {
			System.out.print(lotto.playn + " ");
		}
		scan.close();
		//lotto.make_num();
		lotto.show_num();

	}

}
class Lotto {
	int num = 45, cont = 8, playn;
	private int[] lo_num = new int[num];
	int[] player = new int[7];
	public int[] getPlayer() {
		return player;
	}
	public void setPlayer(int[] player) {
		this.player = player;
	}
	public void make_num() {
		for(int i = 0; i < lo_num.length; i++) {
			int mix = (int)(Math.random()*num) + 1;
			lo_num[i] = mix;
			for(int j = 0; j < i; j++) {
				if(lo_num[i] == lo_num[j]) {
					i--;
				}
			}
		}
	}
	public void show_num() {
		System.out.print("입력한 로또 번호 : ");
		for(int i = 0; i < cont; i++) {
			System.out.print(playn + " ");
		}
		System.out.println();
		System.out.print("추첨한 로또 번호 : ");
		for(int i = 0; i < cont; i++) {
			System.out.print(lo_num + " ");
		}
		System.out.println();
	}
	
	
	
}