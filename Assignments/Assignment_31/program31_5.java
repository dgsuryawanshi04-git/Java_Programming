
/*
           
iRow: 4
iCol: 4

1 2 3 4
  2 3 4
    3 4
      4

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
                if(i > j)
                {
                    System.out.print("\t");     
                }
                else
                {
                    System.out.print(j+"\t");
                }    
            }    
            System.out.println();    
        }
                 
    }
}

class program31_5
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
