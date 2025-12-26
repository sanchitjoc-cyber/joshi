package week7.workshop;


/**
 * Write a description of class mobile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mobile
{
    String brand;
    int price;
   
    public mobile( String brand, int price){
   
        this.brand=brand;
        this.price=price;
    }
        void isAffordable(){
         if(this.price < 20000){
        System.out.println(this.brand);
        System.out.println(this.price);
        }
        else{
        System.out.println(brand+"It is not affordable");
        System.out.println();
        }
    }
}
