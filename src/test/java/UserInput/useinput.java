package UserInput;

import java.util.Scanner;

public class useinput {

	public static void main(String[] args) {
		//Scanner for Predefined Class
		Scanner sc=new Scanner(System.in);
		System.out.println("What is your Name");
		 String name =sc.nextLine();
		 System.out.println("hii "+name+"How are you? ");
		  String status =sc.nextLine();
		  System.out.println("what is your age");
		  int age = sc.nextInt();
		  System.out.println("Thanks for the info");
		 
		
		
	}

}
