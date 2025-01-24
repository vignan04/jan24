package Crt;

public class Pattern1 {

	public static void main(String[] args) {
		/*
		 * 5
		 * 5 4
		 * 5 4 3
		 * 5 4 3 2
		 * 5 4 3 2 1
		 */
		for(int r=1;r<=5;r++) {
			for(int c=5,p=1;p<=r;c--,p++) {
				System.out.print(c+" ");
			}
			System.out.println();
		}

	}

}
