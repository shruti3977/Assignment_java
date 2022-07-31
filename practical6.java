//This Program is prepared by 21CE118 Shruti Sangani
//Part :: 1 practical 6
/*Aim :: Given an array of strings, return a new array without the strings that are equal to
the target string. One approach is to count the occurrences of the target string, make
a new array of the correct length, and then copy over the correct strings.
wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
 */
import java.util.Scanner;

public class practical6 {
    public static void main(String[] args)
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array :: ");
        n=sc.nextInt();
        String[] str=new String[n];
        System.out.println("Enter the element of Array :: ");
        for(i=0;i<n;i++)
        {
            str[i]=sc.next();//Enter element of array
        }
        System.out.println("Enter the character you wanted to delete :: ");
        String arr=sc.next();
        wordsWithout(str,arr);//for check removing word
        sc.close();
    }
    //for Print the array element after removing word
    static void wordsWithout(String a[], String b)
    {
        // logic for the removing the char.
        int count=0,i;
        for (i=0;i<a.length;i++)
        {
            if(a[i].equals(b))
            {
                count++;
            }
        }
        String[] d = new String[a.length - count];
        int x=0;
        for (i=0;i<a.length; i++)
        {
            if (!a[i].equals(b))
            {
                d[x]=a[i];
                x++;
            }
        }
        //Print the Array with removed character
        System.out.println("New Array with removed char :");
        for (i=0;i<x;i++)
        {
            System.out.print(d[i]+" ");
        }
    }
}
