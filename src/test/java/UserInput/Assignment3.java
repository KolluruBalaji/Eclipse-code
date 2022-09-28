package UserInput;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("palease enter the day name");
		String dayName=sc.next();
		if (dayName.equals("Monday")||
				dayName.equals("Tuesday")||
						dayName.equals("Wednesday")||
								dayName.equals("Thursday")||
										dayName.equals("Friday"))
										System.out.println("uff its a week Day");
		else if (dayName.equals("Sunday")||
				dayName.equals("Saturday"))
			System.out.println("yayy its weekend");
			
		}
	}


