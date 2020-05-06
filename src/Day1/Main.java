package Day1;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
		char lang = scan.next().charAt(0);
		switch(lang) {
		case 'A' :
			System.out.print("Excellent");
			break;
		case 'B' :
			System.out.print("Good");
			break;
		case 'C' :
			System.out.print("Usually");
			break;
		case 'D' :
			System.out.print("Effort");
			break;
		case 'F' :
			System.out.print("Failure");
			break;
		default :
			System.out.print("error");
		}
   	}
}