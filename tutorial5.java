import java.util.Scanner;

/**
 * Write a description of class tutorial5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tutorial5

{ public static void main (String[] args) {
    // sum of 10 natural numbers;
   
   
    Scanner input= new Scanner(System.in);
    System.out.println("Ask for n number: ");
     int sum= 0;
     for(int i=1; i<=10; i++)
     { sum= sum+i;
         System.out.println(sum);
    }
   
    System.out.println("Total sum:"+ sum);
   
   
}
}