/*
        
iRow: 4
iCol: 5

2  4  6   8  10
1  3  5   7  9
2  4  6   8  10
1  3  5   7  9

*/

import java.util.*;
class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0, k = 0;

        
        for(i = 1, k = 1; i <= iRow; i++)
        {
            if((i % 2) != 0)
            {
                k = 2;
            }
            else
            {
                k = 1;
            }

            for(j = 1; j <= iCol; j++)
            {    
                
                    System.out.print(k+"\t");
                    k = k + 2;
            }                
            System.out.println();
        }
    }
}

class program29_2
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