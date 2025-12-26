package week7;


/**
 * Write a description of class carmain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class carmain
{
    public static void main(String[] args)
    {
    car c1 = new car();
    c1.brand="ferrari";
    c1.name="dominantSF25";
    c1.color="blue";
    c1.price=174442374;
    c1.blue();
    System.out.println(c1.brand);
    System.out.println(c1.name);
    System.out.println(c1.color);
    System.out.println(c1.price);
    
    
    car c2 = new car();
    c2.brand="lamborgini";
    c2.name="urus";
    c2.color="red";
    c2.price=174442374;
    c2.red();
    System.out.println(c2.brand);
    System.out.println(c2.name);
    System.out.println(c2.color);
    System.out.println(c2.price);
    
    
    
}
}
