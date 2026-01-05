package week8.workshop8;



public class BankMain
{
public static void main(String[] args){
BankAccount b1 = new BankAccount(101, 30000, "Sasson");
b1.deposit(3000);
boolean success = b1.withdraw(2000);
if(success){
System.out.println("Withdrawl successful");
}
else{
System.out.println("withdrawl failed");
}
b1.display();
}
}