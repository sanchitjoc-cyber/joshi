package week7.workshop;
import javax.swing.Box;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mainclass
{public static void main (String[] args)
    { Book b1 = new Book();
        b1.title="Harry Porter";
        b1.author="JK Rowling";
        b1.price= 2500;
        System.out.println(b1.title);
        System.out.println(b1.author);
        System.out.println(b1.price);
        
        
        
      Book b2 = new Book();
      b2.title="rich dad poor dad";
      b2.author="Robert T kiyosaki";
      b2.price=1500;
      System.out.println(b2.title);
      System.out.println(b2.author);
      System.out.println(b2.price);
      
      
      
      
       rectangle r1= new rectangle();
       r1.length= 20;
       r1.breadth= 15;
       r1.display();
       
       
       rectangle r2= new rectangle();
       r2.length= 50;
       r2.breadth= 22;
       r2.display();
       
       
       
       
       
       employee e1= new employee();
       e1.ID= "123";
       e1.name= "sambriddhi khadka";
       e1.salary = 2000;
       
       
       
       employee e2= new employee();
       e2.ID= "133";
       e2.name= "aavash basnet";
       e2.salary = 3000;
       
       
       employee e3= new employee();
       e3.ID= "143";
       e3.name= "vardan sapkota";
       e3.salary = 5000;

       
       
       
       
       
       
       
       
       laptop l1 = new laptop("ASUS", 4, 65000);
       laptop l2 = new laptop("Acer", 8, 85000);
       laptop l3 = new laptop("Dell", 16, 120000);
       
        l1.displaydetails();
        l2.displaydetails();
        l3.displaydetails();
       
       
        
        
        
         mobile m1 = new mobile("Apple", 100000);
        mobile m2 = new mobile("Samgsung", 85000);
        mobile m3 = new mobile("Huwai", 120000);
       
        m1.isAffordable();
        m2.isAffordable();
        m3.isAffordable();
       
        
        
        
        
        
        
        result o1 = new result(35,80,68);
        result o2 = new result(80,75,57);
       
        o1.total();
        o2.total();
       
       
       
       


       
       
       
       
       
       
       
       
      
    
        
        
}
}