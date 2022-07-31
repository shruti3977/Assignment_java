//This Program is prepared by 21CE118 Shruti Sangani
//Part :: 1 practical 9
/*Aim :: The problem is to check whether a given Sudoku solution is correct.
 */
import java.util.Scanner;
class practical9
{
    private int[][] sudoku;
    public practical9()
    {
        sudoku = new int[9][9];
    }
    public practical9(int sudoku[][])
    {
        this.sudoku = sudoku;
    }
    // Check Elements in Row
    private boolean containsInRow(int row, int number)
    {
        for (int i = 0; i < 9; i++)
        {
            if (sudoku[row][i] == number)
            {
                return false;
            }
        }
        return true;
    }
    // Check elements in Collumn
    private boolean containsInCol(int col, int number)
    {
        for (int i = 0; i < 9; i++)
        {
            if (sudoku[i][col] == number)
            {
                return false;
            }
        }
        return true;
    }
    // Check Elements in 3x3 box
    private boolean containsInBox(int row, int col, int number)
    {
        int r = row - row % 3;
        int c = col - col % 3;
        for (int i = r; i < r + 3; i++)
        {
            for (int j = c; j < c + 3; j++)
            {
                if (sudoku[i][j] == number)
                {
                    return false;
                }
            }
        }
        return true;
    }
    private boolean isAllowed(int row, int col, int number)
    {
        boolean checkforCol = containsInCol(col, number);
        boolean checkforBox = containsInBox(row, col, number);
        boolean checkforRow = containsInRow(row, number);
        return !(checkforBox || checkforCol ||checkforRow);
    }
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int[][] board = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 },
                { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
                { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
                { 8, 5, 9, 7, 6, 1, 4, 2, 3 },
                { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
                { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
                { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
                { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
                { 3, 4, 5, 2, 8, 6, 1, 7, 9 }};
        practical9 a = new practical9(board);
        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                boolean c = a.isAllowed(i, j, board[i][j]);
                if (c == true)
                {
                    count++;
                }
            }
        }
        if (count == 81)//Sudoku is correct or not
        {
            System.out.print("Correct");
        } else {
            System.out.print("Incorrect");
        }
    }
}
