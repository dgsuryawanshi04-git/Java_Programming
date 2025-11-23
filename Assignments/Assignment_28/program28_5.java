/*
iRow: 3
iCol: 4

1  2  3  4 
5  6  7  8
9  10 11 12

*/

import java.util.*;
class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0, k = 0;

        
        for(i = 1, k = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++, k++)
            {
                System.out.print(k+"\t");
            }
            System.out.println();
        }
    }
}

class program28_5
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