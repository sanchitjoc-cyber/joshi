import java.util.Scanner;

/**
 * Write a description of class workshop4Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class workshop4Q1
{
    public static void main (String[] args)
    {
        Scanner input= new Scanner (System.in);
         System.out.println("Enter your grade:");
         int grade= input.nextInt();
         String isvalid=(grade>= 40) ? "PASS" : "FAIL";
         System.out.println(isvalid);
         
        
    }
}