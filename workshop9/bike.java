package workshop9;


/**
 * Write a description of class bike here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bike extends vehicle
{
    double engineCapacity;
    
    
    public bike(int vehicleId,String brand,double basePrice,double engineCapacity)
    {
        super(vehicleId,brand,basePrice);
        this.engineCapacity = engineCapacity;
        
    }
    double afterTax = basePrice + calculateTax();
    
    double calculatefinalPrice()
    {
        double finalPrice = basePrice + (0.1 * basePrice);
        return finalPrice;
        
    }
}