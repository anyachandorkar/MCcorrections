
/**
 * Write a description of class Unit1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit1
{
    public static void PrimitiveTypes ()
    {
     //1.3 Expressions and Assignment Statements
     //Both of these should print 1
     System.out.println("Section 1.3:");
     System.out.println("Both 2/(5%3) and 2/5+1 evaluate to 1");
       int ans = 2/(5%3);
       System.out.println("2/(5%3) = "+ans);
     
       int ans2 = 2/5+1;
       System.out.println("2/5+1 = "+ans2);
   
     //1.5 Casting and Ranges of Variables
     //The following code evaluates to -2.5
     System.out.println("\nSection 1.5:");
       double d = 0.25;
       int i = 3;
       double diff = d - i;
       System.out.print((int)diff - 0.5);
       
     //1.5 Casting and Ranges of Variables
     //The following code contains an error because either the numerator or 
     //denominator of the fraction 1/2 should be cast as double
        double fact1 = 1/2;
        double fact2 = 3*4;
        double product = fact1*fact2;
        System.out.println("\n"+product);
    }
}
