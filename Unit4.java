
/**
 * Write a description of class Unit4A here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit4
{
   //Q2
   public void sumDigits(){
       //print the sum of the digits in num
       int num = 12345;
       int sum = 0;
       while(num>0)
       {
           sum += num % 10;
           num /= 10;
    }
    System.out.println(sum);
    }
    
   //Q3
   public void addFive(){
       int a = 1;
       String result = "";
       while (a < 20)
       {
           result += a;
           a += 5;
        }
        System.out.println(result);
        //result would be 161116
    }
    
   //Q5 
   public void addEvens(){
       //calculates and stores in total the sum of all even integers between 0 and 100 inclusive, which is 2550
   
       //method1
       int total = 0;
       for (int k = 0; k <= 100; k += 2)
       {
           total += k;
        }
    
        //method 2
        for (int k = 1; k <= 101; k += 2)
        {    
            total += k - 1;
        }   
   }
   
   //Q6
   public int digitSum(int num)
   {
       int total = 0;
       
       //method1
       while (num > 0)
       {
           total += num % 10;
           num /= 10;
        }
       //method2
       for (int k = num; k > 0; k /= 10)
       {
           total += k % 10;
        }
        return total;
    }
   
   //Q9
   public static int mystery(String string1, String string2)
   {
       String temp = string1;
       int position = 0;
       int result = 0;
       while(temp.indexOf(string2) >= 0)
       {
           position = temp.indexOf(string2);
           result++;
           temp = temp.substring(position + 1);
        }
        return result;
       //if string1 was "Mississippi" and string2 was "si" result would = 2
    }

   //Q12
   public static void numPyramid(){
       for (int k = 0; k < 4; k++)
       {
           
           for (int h = k; h >= 0; h--)
           {
               System.out.print(k);
            }
            System.out.println();
        }
    }
   
   public static void dollarSign(){
       int a = 100;
       while (a > 1)
       {
           System.out.println("$");
           a /= 2;
        }
        //this would print 6 dollar signs 
    }
}
