package datatypes;

import java.util.Scanner;

// Write a program to demonstrate compatible type conversions. For eg., float to int, double to float, int to short

public class QsNo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the float value:");
		float a=sc.nextFloat();
		int a1=(int) a;
		System.out.println("Converted float to int value is "+a1);
		
		System.out.println("Enter the double value:");
		double b=sc.nextDouble();
		float b1=(float) b;
		System.out.println("Converted double to float value is "+b1);
		
		System.out.println("Enter the int value:");
		int c=sc.nextInt();
		short c1=(short) c;
		System.out.println("Converted int to short value is "+c1);
				
	}

}
