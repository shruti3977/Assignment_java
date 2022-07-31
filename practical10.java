//This Program is prepared by 21CE118 Shruti Sangani
//Part :: 1 practical 10
/*Aim :: Implement Caesar Cipher.
 */
import java.util.Scanner;
 public class practical10
 {
     // Encrypts text using a shift
     public static StringBuffer encrypt(String text, int s)
     {
         StringBuffer result= new StringBuffer();
         for (int i=0; i<text.length(); i++)
         {
             if (Character.isUpperCase(text.charAt(i)))
             {
                 char ch = (char)(((int)text.charAt(i)+s - 65) % 26 + 65);
                 result.append(ch);
             }
             else
             {
                 char ch = (char)(((int)text.charAt(i)+s - 97) % 26 + 97);
                 result.append(ch);
             }
         }
         return result;
     }
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the String :: ");
         String text=sc.next();//Enter the String for encrypted
         System.out.println("Enter the shift number :: ");
         int s=sc.nextInt();//Enter the number for shift the word
         System.out.println("String  :: " + text);
         System.out.println("Shift :: " + s);
         //Print the Encrypted String
         System.out.println("Encrypted Message :: " + encrypt(text, s));
     }
 }
