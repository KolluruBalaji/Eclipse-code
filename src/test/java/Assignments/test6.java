package Assignments;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the starting number");
		int startingnum=sc.nextInt();
		System.out.println("please enter the end number");
		int endingnum=sc.nextInt();
		int num=startingnum;
		while(num>=endingnum) {
			if(num%2==1)
			System.out.println(num);
			num--;
		}
		sc.close();
	}

}
