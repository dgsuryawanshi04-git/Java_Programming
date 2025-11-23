/*
Input: 8
Output: 2 4 6 8 10 12 14 16

*/

import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print((iCnt*2)+"\t");   
        }
        System.out.println();
    }
}

class program26_5
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