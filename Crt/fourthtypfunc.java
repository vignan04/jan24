package Crt;

import java.util.Scanner;

public class fourthtypfunc {
	static float anycountryToIndianRupees(String country,int amt) {
		float res=0.0f;
		if(country.equalsIgnoreCase("USA")) {
			res=amt*78.67f;
		}
		else if(country.equalsIgnoreCase("UK")) {
			res=amt*120.56f;
		}
		else if(country.equalsIgnoreCase("UAE")) {
			res=amt*20.56f;
		}
		return res;
	}
	static int getAmt() {
		return 100;
	}

	public static void main(String[] args) {
		/*int usDollars=100,ukPounds=200,uaeDirams=50;
		float rupees=anycountryToIndianRupees("USA",getAmt());
		System.out.println("indian rupees---.USA   "+rupees);
		rupees=anycountryToIndianRupees("UK",ukPounds);
		System.out.println("indian rupees---.Uk   "+rupees);
		rupees=anycountryToIndianRupees("UAE",uaeDirams);
		System.out.println("indian rupees---.UAE   "+rupees);*/
		Scanner sc=new Scanner(System.in);
		System.out.println("enter country...");
		String country=sc.next();
		String cC=getAmtDetails(country);
		System.out.println("please enter  "+cC);
		if(cC.equalsIgnoreCase("Country not Found")) {
			System.out.println("not able to process");
			
		}
		else {
			int amt=sc.nextInt();
			System.out.println("for this "+country+ "for this amt="+amt+" indian amt="+m1(country,amt));
		}
	}
	public static String m1(String country, int amt) {
		
		return "+res";
	}
	static String getAmtDetails(String country) {
		String res="";
		if(country.equalsIgnoreCase("USA")) {
			res="Dollar";
		}
		else if(country.equalsIgnoreCase("UK")) {
			res="pound";
		}
		else if(country.equalsIgnoreCase("UAE")) {
			res="Diram";
	}
		else {
			res="Coutry not Found";
		}
		return res;

}
}