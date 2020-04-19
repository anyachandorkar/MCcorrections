
/**
 * Write a description of class Unit6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit6
{
    public void main(String [] args){
       //for Q2 this code can be called to get the desirable output
       int[] arr = {0, 0, 0, 0};
       // or int[] arr = new int[4];
       arr = transform(arr);
       
       //for Q3 these code segments would compile without error
       checkString(new String[0]);
       String[] str = {"cat", "dog"};
       checkString(str);
    }
    
    //Q2
    public int[] transform(int[] a){
        a[0]++;
        a[2]++;
        return a;
    } 
    
    //Q3
    public int checkString(String[] arr)
    {
       int count = 0;
       for (int k = 0; k < arr.length; k++)
       {
           if (arr[k].length() >= 3)
           {
               count++;
            }
        }
        return count;
    }
    
    //Q4
    public void question4(){
        int[] arr = {10, 20, 30, 40, 50};
        for(int x = 1; x < arr.length - 1; x++)
        {
            arr[x + 1] = arr[x] + arr[x + 1];
        }
        //would out put the array {10,20,50,90,140}
    }
    
    //Q5
    public void question5(){
        int[] arr = {4, 3, 2, 1, 0};
        int total = 0;
        for (int k = 0; k <= total; k++)
        {
            if (arr[k] % 2 == 0)
            {
                total += arr[k];
            }
            else
            {
                total -= arr[k];
            }
        }
        System.out.print(total); //result would be 1
    }
    
    //Q12
    public void question12(int [] numArr){
       for (int k = 0; k < numArr.length / 2; k++)
       {
        int temp = numArr[k];
        numArr[k] = numArr[numArr.length - k - 1];
        numArr[numArr.length - k - 1] = temp;
        
       }
    } 
}