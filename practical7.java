//This Program is prepared by 21CE118 Shruti Sangani
//Part :: 1 practical 7
/*Aim :: Display numbers in a pyramid pattern.
                 1
               1 2 1
             1 2 4 2 1
           1 2 4 8 4 2 1
         1 2 4 8 16 8 4 2 1
      1 2 4 8 16 32 16 8 4 2 1
   1 2 4 8 16 32 64 32 16 8 4 2 1
1 2 4 8 16 32 64 128 64 32 16 8 4 2 1
 */
public class practical7 {
    public static String str="";
    //print the pyramid
    public static void main(String[] args)
    {
        int n;
        int r;//for number of rows
        int c;//number of columns
        for(r=0;r<=7;r++)
        {
            for (c=1;c<=7-r;c++)
            {
                System.out.printf("%4s",str);
            }
            for (c=0;c<=r;c++)
            {
                n= (int) Math.pow(2,c);
                System.out.printf("%4d",n);
            }
            for (c=r-1;c>=0;c--)
            {
                n= (int) Math.pow(2,c);
                System.out.printf("%4d",n);
            }
            System.out.println(" ");
        }
    }
}