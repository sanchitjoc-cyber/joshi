package workshop9;


/**
 * Write a description of class savingsaccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SavingsAccount extends BankAccount
{
private int InterestRate;

public SavingsAccount(int accountNumber,String accountholderName,double balance,int InterestRate)
{
super(accountNumber,accountholderName,balance);
this.InterestRate=InterestRate;
}

double calculateInterest()
{
return(getBalance()*InterestRate/100);
}

}