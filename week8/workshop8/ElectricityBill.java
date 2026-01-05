package week8.workshop8;



public class ElectricityBill
{
public static void main(String[] args)
{
ElectricityBill e1=new Electricity("Sambriddhi",420);
double bill=e1.calculateBill();
System.out.println("Your bill is "+bill);
}
}
