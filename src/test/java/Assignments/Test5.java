package Assignments;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the starting number");
		int startingnum=sc.nextInt();
		System.out.println("please enter the end number");
		int endingnumber=sc.nextInt();
		int num=startingnum;
		int sum=0;
		
		while(num<=endingnumber) {
			if(num%2==0)
				sum+=num;
				num++;
			
		}
		System.out.println("sum of even numbers is"+sum);
		sc.close();
	}

}
