//This Program is prepared by 21CE118 Shruti Sangani
//Part :: 1 practical 4
/*Aim :: Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the
array somewhere.
array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
 */
import java.util.Scanner;

public class practical4 {
    public static void main(String[] args)
    {
        int n;
        int i;
        boolean a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length of the Array :: ");
        n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of Array :: ");
        for (i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        a=array123(arr);
        System.out.println(a);
    }
    static boolean array123(int arr[])
    {
        int i,b=0;
        for(i=0;i<arr.length;i++)
        {
            if((arr[i]==1) && (arr[i+1]==2) && (arr[i+2]==3))
            {
                b++;
            }
            else
            {
                break;
            }
        }
        if(b>=1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
