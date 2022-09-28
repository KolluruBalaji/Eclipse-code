package Switch;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the first  number");
		int num=sc.nextInt();
		System.out.println("please enter second number ");
		int num2=sc.nextInt();
		System.out.println("the final target is ");
		String operation=sc.next();
		int result=0;
		switch (operation) {
		case "+":
			result=num+num2;
			
			 break;
		case "-":
			result=num-num2;
			
			 break;
		case "*":
			result=num*num2;
			
			 break;
		case "/":
			result=num/num2;
			
			 break;
		case "%":
			result=num%num2;
			
			 break;
			 default:
				 System.err.println("the invalid arthametic operator");
				 break;
		}
		System.out.println(result);
		sc.close();

	}

}
