/////////////////////////////////////////////////////////////////////
//
//  Function Name : CommonBits
//  Description :   Accept two number from the user and display the positions of common ON bits from two numbers.
//  Input :         integer (number)
//  Output :        common count 
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          07/01/2026
//
/////////////////////////////////////////////////////////////////////

import java.util.*;

class bitManipulation
{
    public void CommonBits(int iNo1, int iNo2)
    {
        int iCount1 = 0, iCount2 =0;

        while(iNo1 != 0)
        {
            iNo1 = iNo1 & (iNo1 - 1);
            iCount1++;
        }
        while(iNo2 != 0)
        {
            iNo2 = iNo2 & (iNo2 - 1);
            iCount2++;
        }

        System.out.println(iCount1+ " "+ iCount2);
       
    }
}
class program67_2
{
    public static void main(String args[])
    {
        int No1 = 0, No2 = 0;
        Scanner sobj = new Scanner( System.in);
        System.out.println("Enter number :");
        No1 = sobj.nextInt();

        System.out.println("Enter number :");
        No2 = sobj.nextInt();

        bitManipulation bobj = new bitManipulation();
        bobj.CommonBits(No1, No2);
    }
}