/*
    iRow: 4
    iCol: 3

        A A A A
        B B B B 
        C C C C

*/

 
import java.util.*;
class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j= 0;
        char ch = 'A';

        for(i = 1; i <= iRow; i++, ch++)
        {
            for(j = 1; j <= iCol; j++)
            {                
                System.out.printf("%c\t",ch);
                    
            }
            System.out.println();  
        }
    }
}

class program28_3
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
