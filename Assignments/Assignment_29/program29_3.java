/*
           
iRow: 5
iCol: 5

a  b  c  d  e
1  2  3  4  5
a  b  c  d  e 
1  2  3  4  5
a  b  c  d  e

*/

import java.util.*;
class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char ch = 'a';

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1, ch = 'a'; j <= iCol; j++)
            {    
                if((i % 2) != 0)
                {
                    System.out.printf("%c\t",ch);
                    ch++;     
                }
                else
                {
                    System.out.printf("%d\t",j);
                }      
            }

            System.out.println();
        }
    }
}

class program29_3
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