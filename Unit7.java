
/**
 * Write a description of class Unit7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Unit7{
    public void main(String [] args){
        //Q2 an array list of integers can be initialized through these ways
        ArrayList<Integer> numbers = new ArrayList();
        //or
        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        
        //Q16
        int[] arr = {10, 8, 3, 4};
        insertionSort(arr);
        
        //Q18
        int[] arr1 = {30, 40, 10, 50, 20};
        selectionSort(arr);

    }
    
    //Q8
    public void question8(){
        ArrayList<String> words = new ArrayList<String>();
        words.add("mat");
        words.add("new");
        words.add("open");
        words.add("pet");
        int i = 0;
        while (i < words.size())
        {
            words.remove(i);
            i++;
        }
        System.out.println(words.toString()); 
        //would print [new, pet]
    }
    
    //Q9
    public void question9(){
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("A");
        arrList.add("B");
        arrList.add("C");
        arrList.add("D");
        for (int i = 0; i < arrList.size(); i++)
        {
            System.out.print(arrList.remove(i));
        }
        //would print AC
    }
    
    //Q10
    public static boolean isReversed(ArrayList<Integer> firstList,
    ArrayList<Integer> secondList)
    {
        for (int j = 0; j < firstList.size() / 2; j++)
        {
            if (firstList.get(j) != secondList.get(secondList.size() - 1 - j))
            {
                return false;
            }
        }
        return true;
    } //doesn't work with arraylists {1,3,5,7} and {5,5,3,1}
    
    //Q14
    public static int search(int[] arr, int target)
    {
        int result = -1;
        for (int j = 0; j < arr.length; j++)
        {
            if (arr[j] == target)
            {
                result = arr[j];  // Line 8
            }
        }
        return result; //would return -1 or target
    }
    
    //Q16
    public static void insertionSort(int[] elements)
    {
        for (int j = 1; j < elements.length; j++)
        {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
            {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;   // line 10 would execute 5 times with main call
            }
            elements[possibleIndex] = temp;
        }
    }
    
    //Q18
    public static void selectionSort(int[] elements)
    {
        for (int j = 0; j < elements.length - 1; j++)
        {
            int minIndex = j;
            for (int k = j + 1; k < elements.length; k++)
            {
                if (elements[k] < elements[minIndex])
                {
                    minIndex = k;
                }
            }
            if (j != minIndex)
            {
                int temp = elements[j];
                elements[j] = elements[minIndex];
                elements[minIndex] = temp;   // line 19 would execute 3 times with main call
            }
        }
    }
}
