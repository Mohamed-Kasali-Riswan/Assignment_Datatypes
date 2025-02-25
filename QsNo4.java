package datatypes;

import java.util.Scanner;

public class QsNo4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		System.out.print("Enter the value of a: ");
		int a=sc.nextInt();
		System.out.print("Enter the value of b: ");
		int b=sc.nextInt();	
		System.out.println("Value of a and b before swapping is "+a+" , "+b);
		
		//Approach 1
			//a=a+b;
			//b=a-b; 
			//a=a-b; 
		
		//Approach 2
			a=a^b;
			b=a^b;
			a=a^b;
		
		System.out.println("Value of a and b before swapping is "+a+" , "+b);
	}
}
