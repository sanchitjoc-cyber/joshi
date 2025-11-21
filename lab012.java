import java.util.Scanner;

/**
 * Write a description of class lab012 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class lab012
{
    public static void main (String[] args)
    {
    //int age;// declearing the variable
    //age = 19; // assigning the variable 
    
    int age =19; // declearing and assigning
    
    // Scanner class
    Scanner input = new Scanner (System.in);
    System.out.println("Enter first Number: ");
    
    int firstNum= input.nextInt();
    
    System.out.println("Enter second Number");
    
    double secondNum= input.nextDouble();

    
    System.out.println("My first number is:"+ firstNum);
    System.out.println("My second number is:"+ secondNum);
    
    //ternery operator 
    
    
    String isvalid=(age>=18) ? "Driving is allowed" : "Driving is not allowed";
    System.out.println(isvalid);
}
    
}