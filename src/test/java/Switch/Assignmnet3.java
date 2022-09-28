package Switch;

import java.util.Scanner;

public class Assignmnet3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter day name:");
		String dayName=sc.nextLine();
		switch (dayName) {
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
		case "Friday":
			
			System.out.println("its  a week day");
			break;
		case "Saturday":
		case "Sunday":
			System.out.println("yayy its fun day ");

		default:
			System.err.println("you have entered the wrong  operation!!");
			break;
		}
	}

}
