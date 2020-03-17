
/**
 * Write a description of class Unit3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Unit3
{
    //Q3
    public static String IfElseStatements()
    {
      //3.3: if-else Statements
      //The following code does not work as intended
      //one can prove this by using temp = 30
      int temp = 0;
      Scanner scan = new Scanner(System.in);
      System.out.println("What is the temperature in degrees Fahrenheit?");
      temp = scan.nextInt();
      //System.out.println(temp); 
      String weather;
        if (temp <= 31)
        {
            weather = "cold";
        }
        else
        {
            weather = "cool";
        }
        if (temp >= 51)
        {
            weather = "cool";
        }
        else
        {
            weather = "warm";
        }
        System.out.println(weather);
        return weather;
    }
    
    //Q4
    public static void Compare()
    {
      //3.4: else if Statements
      //Both the following code segments produce the same values for x and y
      //Segemnt 1
      int x = 0;
      int y = 0;
      int result = 0;
        if (x>y)
        {
            result = x - y;
            System.out.print(result);
        }
        else if (x<y)
        {
            result = y - x;
            System.out.print(result);
        }
        else
        {
            System.out.print(result);
        }
      //Segment 2
        if (x<y)
        {
            System.out.print(y-x);
        }
        else
        {
            System.out.print(x-y);
        }
    }
    
    //Q6
    public static boolean DeMorgansLaw ()
    {
      //3.6 Equivalent Boolean Expressions
      //Both of the following code segments will produce the same results 
        int j = 0;
        int k = 1;
        int m = 2;
        if (!((j == k) && (k > m)))
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
        if ((j != k) || (k <= m))
        {
           System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
      return true;
    }
    
    //Q7
    public static void animals()
    {
      //3.7 comparing objects 
      //After executing this code, C is printed 
        String first = new String("duck");
        String second = new String("duck");
        String third = new String("goose");
        if (first == second)
        {
            System.out.print("A");
        }
        else if (second == third)
        {
            System.out.print("B");
        }
        else if (first.equals(second))
        {
            System.out.print("C");
        }
        else if (second.equals(third))
        {
            System.out.print("D");
        }
        else
        {
            System.out.print("E");
        }
    }
}
