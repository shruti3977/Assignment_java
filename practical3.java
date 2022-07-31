//This Program is prepared by 21CE118 Shruti Sangani
//Part :: 1 practical 3
/*Aim :: Given two non-negative int values, return true if they have the same last digit, such
as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 %
10 is 7.
lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
 */
import java.util.Scanner;

public class practical3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First number :: ");
        int n1=sc.nextInt();//Enter the first number
        System.out.println("Enter the Second number :: ");
        int n2=sc.nextInt();//Enter second number
        boolean n=lastDigit(n1,n2);//for check last digit are equal or not
        System.out.println("Answer is :: "+n);
    }
    //for check last digit of both the number are equal or not
     static boolean lastDigit(int n1, int n2)
     {
         int n=n1%10;//for find the last digit of first number
         int m=n2%10;//for find the last digit of second number
         if(n==m)//if last digit of both number is same then return true otherwise false
         {
             return true;
         }
         else
         {
             return false;
         }
     }
}
