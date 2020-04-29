package Day1;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int a = scan.nextInt();
    	int b = scan.nextInt();
    	int c = b+100-a;
    	System.out.println(c);
    	if(c > 0) {
    		System.out.println("Obesity");
    	}
   	}
}