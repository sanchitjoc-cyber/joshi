package week8.workshop8;



public class Student
{
    //attributes 
    private String name;
    private int Id;
    private String add;
    private long phno;
    private String collegename;
    //constructors 
    public Student(String name, int Id,String add,long phno,String collegename)
    {
        this.name= name;
        this.Id=Id;
        this.add=add;
        this.phno=phno;
        this.collegename=collegename;
    }
    //setters and getters method 
    public void setName(String name)
    {
        this.name= name;
        
    }
    public String getName()
    {
        return this.name;
        
    }
    //getters and setters for id as well
    public void setId(int Id)
    {
        this.Id=Id;
        
    }
    public int getId()
    {
        return this.Id;
            
    }
    public void setadd(String add)
{
this.add = add;
}

public String getadd(){
return this.add;
}
public void setphno(long phno){

this.phno = phno;
}

public long getphno()
{

return this.phno;
}
public void setcollegename(String collegename){

this.collegename = collegename;
}

public String getcollegename()
{

return this.collegename;
}

    public void displayInfo()
    {
        System.out.println("Name of Student is:" + this.name);
        System.out.println("Id of Student is:" + this.Id);
        System.out.println("Address:" + this.add);
        System.out.println("Phone no.:" + this.phno);

    }
    
    
}