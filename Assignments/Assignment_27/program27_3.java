/*
iRow: 3
iCOl: 5
 
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1


*/

import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = iCol; j >= 1; j--)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}

class program27_3
{
    public static void main(String args[])
    {
        int iValue1 = 0, iValue2 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        iValue1 = sc.nextInt();

        System.out.println("Enter number of cols:");
        iValue2 = sc.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);
        
    }
}