package workshop9;


/**
 * Write a description of class vehicleApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class vehicleApp
{
    public static void main(String[] args)
    {
        car f1 = new car(1, "Porche", 50000000, 2 ,"Hybrid");
        f1.displayvehicleInfo();
        double tax = f1.calculateTax();
        double FinalPrice = f1.calculateFinalPrice();
        System.out.println("Tax" + tax);
        System.out.println("Final Price" + FinalPrice);
        
        
        
        bike b1 = new bike(1, "Ducati", 5200000,898);
        b1.displayvehicleInfo();
        double Tax = b1.calculateTax();
        double finalPrice = b1.calculatefinalPrice();
        System.out.println("Final Price" + finalPrice);
        
        
        
        
        
    }
}