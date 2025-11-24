/*
iRow: 6
iCol: 6

* * * * * *
*       * *
*     *   *
*   *     *
* *       *
* * * * * *

*/

import java.util.*;
class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(j == (iCol - i + 1) || i == 1 || i == iRow || j == 1 || j == iCol)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}

class program32_3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter number of rows:");
        iValue1 = sc.nextInt();

        System.out.println("Enter number of cols:");
        iValue2 = sc.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);

    }
}