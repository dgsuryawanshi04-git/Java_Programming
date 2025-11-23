/*
    iRow: 4
    iCol: 4

        A B C D
        A B C D
        A B C D
        A B C D

*/

 
import java.util.*;
class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j= 0;
        char ch = 'A';

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1, ch = 'A'; j <= iCol; j++, ch++)
            {
                System.out.printf("%c\t",ch);
            }
            System.out.println();
        }
    }
}

class program28_1
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
