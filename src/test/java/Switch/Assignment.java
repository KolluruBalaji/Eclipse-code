package Switch;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the number");
		int num=sc.nextInt();
		int rem=num%2;
		switch (rem) {
		
		case 0:
			System.out.println("it is an even number ");

		case 1:
			System.out.println("it is an odd number");
			break;
		}
		sc.close();
	}

}
