package Assignments;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the starting number");
		int startingnum=sc.nextInt();
		System.out.println("please enter the end number");
		int endingnum=sc.nextInt();
		sc.close();
		int num=startingnum;
		while(num<=endingnum) {
			if(num%7==0)
			System.out.println(num);
			num++;
		}

}
}
