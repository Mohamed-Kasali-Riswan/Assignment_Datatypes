package datatypes;
import java.util.Scanner;

// Write a Java program that gets a number from the user and displays the name of the weekday. Use enum.

enum days{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

public class QsNo5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Corresponding day of Number (1 to 7) : ");
		int day=sc.nextInt();
		if(day<1 || day>7) System.out.println("OOPS! You have entered invalid number! ");
		else System.out.println("Day is "+days.values()[day-1]);
	}
}




     

