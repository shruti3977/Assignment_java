//This Program is prepared by 21CE118 Shruti Sangani
//Part:: 1  Practical 2
/*Aim :: Given a string, return a string made of the first 2 chars (if present), however include
first char only if it is 'o' and include the second only if it is 'z', so "ozymandias"
yields "oz".
startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
*/
import java.util.Scanner;

public class practical2 {
    public static void main(String[] args) {
        System.out.println("Enter String :: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();//Enter the string
        System.out.println("return String is :: " );
        startOz(str);
    }
    static void startOz(String arr)
    {
        if(arr.charAt(0)== 'o' || arr.charAt(0)== 'O')
        {
            System.out.print("o");
        }
        if(arr.charAt(1)=='z' || arr.charAt(0)== 'Z')
        {
            System.out.print("z");
        }
    }
}