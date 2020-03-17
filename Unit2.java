
/**
 * Write a description of class Unit2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit2
{
    //Q9
    public static void UsingTheMathClass()
    {
      //2.9: Using the Math Class
      //By implementing (int) (Math.random()*4+1), the following code works as intended
      
      int val = (int) (Math.random()*4+1);
      val *= 2;
      System.out.println(val);
    }
}
