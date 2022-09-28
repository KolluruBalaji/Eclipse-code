package UserInput;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("what is the marks");
		int marks =sc.nextInt();
		if(marks<35) {
			System.out.println("you are failed ");	
		}
		else if(marks==35) {
			System.out.println("you are just pass");
		}
		
		else if(marks>35&&marks==70) {
			System.out.println("you gort the third class");
		}
		else if(marks>70&&marks==85) {
			System.out.println("you got the Second  Class");
		}
		else {
			System.out.println("you got the densition");
		}
		sc.close();

	}

}
