package Crt;

public class secfuntype {
	static void pattern(char ch1,int num1,char ch2,int num2) {
		for(int i=1;i<=num1;i++) {
			System.out.print(ch1);
		}
		System.out.println("\n");
		for(int i=1;i<=num2;i++) {
			System.out.print(ch2);
	}
		System.out.println("\n");
		}

	public static void main(String[] args) {
	    pattern('@',20,'#',25);
		System.out.println("Hi");
		pattern('*',25,'!',20);
		System.out.println("Class");

	}

}
