package week7;


/**
 * Write a description of class student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{public static void main(String[] args)
    {
    student s1 = new student();
    s1.collegeID="np01cp4a250111";
    s1.name="sanchit";
    s1.age=19;
    s1.study();
    System.out.println(s1.collegeID);
    System.out.println(s1.name);
    System.out.println(s1.age);
    
    
    student s2= new student();
    s2.collegeID="np018899";
    s2.name="sambriddhi";
    s2.age=19;
    s2.laugh();
    System.out.println(s2.collegeID);
    System.out.println(s2.name);
    System.out.println(s2.age);
    
    
    
}
}