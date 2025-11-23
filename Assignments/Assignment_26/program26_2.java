/*
Input: 5
Output: 5 # 4 # 3 # 2 # 1 #
        1 2 3 4 5 6 7 8 9 10

*/

import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        for(iCnt = iNo; iCnt >= 1; iCnt--)
        {
            System.out.print(iCnt+"\t");
            if(iCnt > 0)
            {
                System.out.print("#\t");
            }
            
        }
        System.out.println();
    }
}

class program26_2
{
    public static void main(String args[])
    {
        int iValue = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Frequency:");

        iValue = sc.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);

    }
}