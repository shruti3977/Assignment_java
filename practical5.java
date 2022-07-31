//This Program is prepared by 21CE118 Shruti Sangani
//Part :: 1 practical 5
/*Aim :: Given 2 strings, a and b, return the number of the positions where they contain the
same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa",
and "az" substrings appear in the same place in both strings.
stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0
 */
import java.util.Scanner;

import static java.lang.Math.min;

public class practical5 {
    public static void main(String[] args)
    {
        String a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First String :: ");
        a=sc.next();//Enter First String
        System.out.println("Enter Second String :: ");
        b=sc.next();//Enter Second String
        int n;
        n=stringMatch(a,b);//For Check how many substrings have
        System.out.println(n);
    }
    //For Check how many substrings have
    static int stringMatch(String a, String b)
    {
        int count=0,i;
        int minimum = min(a.length(),b.length());
        for (i = 0; i < (minimum - 1); i++)
        {
            String p = a.substring(i, i + 2);
            String q = b.substring(i, i + 2);

            if (p.equals(q))
            {
                count++;
            }
        }
        return count;
    }
}
