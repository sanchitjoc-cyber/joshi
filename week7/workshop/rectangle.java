package week7.workshop;


/**
 * Write a description of class rectancle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class rectangle
{//attributes or properties
    int length;
    int breadth;
    
    void display()
    {
       System.out.println("length of this rectangle " + length);
       System.out.println("breadth of this rectangle" + breadth);
       System.out.println("area of this rectangle" + length*breadth);
    }
}