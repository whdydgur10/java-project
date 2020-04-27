package Day7;

import java.util.Scanner;

public class test7_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		baseball game = new baseball();
		game.number();
		while (game.gameOver == false) {
			for(int i = 0; i < game.playerNum.length; i++) {
				game.playerNum[i] = scan.nextInt();
			}
			game.numcompare();
		}
		System.out.println("게임 끝");
		
	}

}
class baseball {
	private int[] baseNum = new int[3];
	int[] playerNum = new int[3];
	private int strike = 0, ball = 0;
	boolean gameOver;
	public int[] getBaseNum() {
		return baseNum;
	}
	public void setBaseNum(int[] baseNum) {
		this.baseNum = baseNum;
	}
	public int[] getPlayerNum() {
		return playerNum;
	}
	public void setPlayerNum(int[] playerNum) {
		this.playerNum = playerNum;
	}
	public int getStrike() {
		return strike;
	}
	public void setStrike(int strike) {
		this.strike = strike;
	}
	public int getBall() {
		return ball;
	}
	public void setBall(int ball) {
		this.ball = ball;
	}
	public void number() {
		for (int i = 0; i < baseNum.length; i++) {
			int random = (int)(Math.random()*9)+1;
			baseNum[i] = random;
			for(int j = 0; j < i; j++) {
				if(baseNum[i] == baseNum[j]) {
					i--;
					
				}
			}
		}
	}public void showNumber() {
		for(int i = 0; i < baseNum.length; i++) {
			System.out.print(baseNum[i]+ " ");
		}
	}
	public void numcompare() {
		for(int i = 0; i < baseNum.length; i++) {
			if(baseNum[i] == playerNum[i]) {
				strike++;
			}
			for(int j = 0; j < baseNum.length; j++) {
				if (baseNum[i] != playerNum[i] && baseNum[i] == playerNum[j]) {
					ball++;
				}
			}
		}
		System.out.printf("%dS, %dB\n",strike,ball);
		if(strike == 3) {
			gameOver = true;
		}
		strike = 0;
		ball = 0;
	}
}