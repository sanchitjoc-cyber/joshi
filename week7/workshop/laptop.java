package week7.workshop;


/**
 * Write a description of class laptop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class laptop
{
    String brand;
    int ram;
    int p;
   
    public laptop ( String brand, int ram,int p){
   
        this.brand=brand;
        this.ram=ram;
        this.p=p;
    }
   
    void displaydetails(){
         if(this.ram>8){
        System.out.println(this.brand);
        System.out.println(this.ram);
        System.out.println(this.p);
        }
    }
}
