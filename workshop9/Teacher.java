package workshop9;


/**
 * Write a description of class Teacher extends Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Teacher extends Person
{
private String subject;
private int bonus;

public Teacher(int id,int basicSalary,String collegeName,String subject,int bonus)
{
super(id,basicSalary,collegeName);
this.id=id;
this.basicSalary=basicSalary;
this.collegeName=collegeName;
this.subject=subject;
this.bonus=bonus;
}
@Override
public double calculateAnnualSalary()
{
return(calculateAnnualSalary()+bonus);
}
}