import java.util.Scanner;

/**
 * Write a description of class workshopQ5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class workshopQ5
 {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

// Taking two numbers as input
System.out.print("Enter first number: ");
int num1 = input.nextInt();

System.out.print("Enter second number: ");
int num2 = input.nextInt();

int sum=num1+num2;
System.out.println("The sum is:"+ sum);
}
}