/*
    iRow: 4
    iCol: 4

        A B C D
        a b c d
        A B C D
        a b c d

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
            if((i % 2) == 0)
                {
                    ch = 'a';
                }
                else
                {
                    ch = 'A';
                }
                for(j = 1; j <= iCol; j++)
                {
                
                
                    System.out.printf("%c\t",ch);       // error
                    ch++;
                }
            System.out.println();
        }
    }
}

class program28_2
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
