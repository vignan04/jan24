package Crt;

public class Pattern5V2 {

	public static void main(String[] args) {
		int v=0;
		for(int r=1;r<=4;r++) {
			for(int c=1;c<=r;c++) {
				System.out.print(((r+c)-1)%2+" ");
			}
			System.out.println();
	}

  }
}
