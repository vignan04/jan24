package Crt;

import java.util.Scanner;

public class AlpDigSplchar {
	
	public static void main(String[] args) {
		char ch;
		System.out.println("Enter any character");
		Scanner input=new Scanner(System.in);
		ch =input.next().charAt(0);
		if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')){
			System.out.println("Alphabet");
		}
		else if(ch>='0' && ch<='9') {
			System.out.println("digit");
		}
		else {
			System.out.println("spl character!!!!");
		}
		
		
		
	}

}
