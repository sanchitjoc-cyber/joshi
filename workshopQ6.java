import java.util.Scanner;

/**
 * Write a description of class workshopQ6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class workshopQ6
{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.println("Enter current water level");
       
        double w = input.nextDouble();
       
        System.out.println("current water level is" +w);
       
        String isvalid = ( w >= 1000)? "WARNING" : "SAFE";
        System.out.println(isvalid);
    }
}
