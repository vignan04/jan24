package Crt;

public class SubString {

	public static void main(String[] args) {
		String name1="Rohan";
		String name2="Rahul";
		System.out.println("Before Swwapping....");
		System.out.println("name1...."+name1);
		System.out.println("name2...."+name2);
		name1=name1+name2;
		name2=name1.substring(0,name1.length()-name2.length());
		name1=name1.substring(name2.length());
		System.out.println("After Swwapping....");
		System.out.println("name1...."+name1);
		System.out.println("name2...."+name2);
	}

}
