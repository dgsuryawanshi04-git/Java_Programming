/////////////////////////////////////////////////////////////////////
//
//  Function Name : CountOne
//  Description :   Accept one number from user count 1 (ON) of that number.
//  Input :         integer (number)
//  Output :        count
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          07/01/2026
//
/////////////////////////////////////////////////////////////////////

import java.util.*;

class bitManipulation
{
    public void CountOne(int iNo)
    {
        
        int iCount = 0;

        while(iNo != 0)
        {
            iNo = iNo & (iNo - 1);
            iCount++;
        }

        System.out.println(iCount);
       
    }
}
class program67_1
{
    public static void main(String args[])
    {
        int No = 0;
        Scanner sobj = new Scanner( System.in);
        System.out.println("Enter number :");
        No = sobj.nextInt();

        bitManipulation bobj = new bitManipulation();
        bobj.CountOne(No);
    }
}