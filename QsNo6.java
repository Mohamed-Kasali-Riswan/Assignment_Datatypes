package datatypes;

import java.util.Scanner;

// Write a program that calculates the average weight of 10 people. 
// Use descriptive and meaningful variable names following Java naming conventions.
// Use proper datatypes for the variables.

public class QsNo6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []weight=new int[10];
		int total=0;
		double avg=0;
		for(int i=0;i<weight.length;i++) {
			System.out.println("Enter the weight of person "+(i+1)+": ");
			weight[i]=sc.nextInt();
			total+=weight[i];
		}
		avg=(double) total/weight.length;
		System.out.println("Average weight of 10 people is "+avg);
	}

}
