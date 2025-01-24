package Crt;

public class PrimeNo5 {

	public static void main(String[] args) {
		for(int i=100,j=0;i>=1;i--) {
			int num=i;
			int counter=0;
			for(int p=1;p<=num;p++) {
				if(num%p==0)counter++;
			
			}
			if(counter==2) {
				j++;
				if(j==1)
				System.out.print("The last prime num is: " +i);
				
			}
		}

	}

}
