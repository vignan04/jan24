package Crt;

public class PrimeNo4 {

	public static void main(String[] args) {
		for(int i=1,j=0;i<100;i++) {
			int num=i;
			int counter=0;
			for(int p=1;p<=num;p++) {
				if(num%p==0)counter++;
			
			}
			if(counter==2) {
				j++;
				if(j==12)
				System.out.print("The 12 prime num is: " +i);
				/*k++;
				if(k==6) {
					System.out.println();
					k=0;
				}*/
			}
		}

	}

}
