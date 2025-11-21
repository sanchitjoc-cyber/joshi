
/**
 * Write a description of class samimbhaikoclass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class samimbhaikoclass
{
    int qty; // intance variable 
    static int rrt; // static variable 
    public static void main (String[] args) {
        int age=19; // local variable 
        System.out.println(age);
        System.out.println(samimbhaikoclass.rrt);
        // Implicit Typecasting
        
        double dtr= age;
        System.out.println(dtr);
        //Explicit Typecasting 
        double db= 10.09;
        int itr= (int)db;
        System.out.println(itr);
        
        // Exceptions in arthmetic 
        byte b1= 10;
        byte b2= 11;
        byte sum = (byte)(b1+b2);
        //short, char 
        // Mininmum, Maximum, size, bytes
        
        Sytem.out.println(Byte.MAX_VALUE); //maximum value
        Sytem.out.println(Byte.MIN_VALUE); //minimum value 
        Sytem.out.println(Byte.SIZE); //bits
        Sytem.out.println(Byte.BYTES); //bytes
        // Escape Sequence 
        System.out.println("Hello\nWorld");
        Sytem.out.println("She sid\" Hi\" ");
        //unicode Escape Sequence 
        System.out.println("\u2764
        
        
    }
    
}