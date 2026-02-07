/////////////////////////////////////////////////////////////////////
//
//  Function Name : BitOff
//  Description :   Accept one number from user and off the 7th bit of that number if it is on. Return the modified number.
//  Input :         integer (number)
//  Output :        updated number
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          06/01/2026
//
/////////////////////////////////////////////////////////////////////

import java.util.*;

class bitManipulation
{
    public void BitOff(int iNo)
    {
        int iMask = 0;

        iMask = 0xffffffbf;

        iNo = iNo & iMask;

        System.out.println("Updated number : "+iNo);
       
    }
}
class program65_1
{
    public static void main(String args[])
    {
        int No = 0;
        Scanner sobj = new Scanner( System.in);
        System.out.println("Enter number :");
        No = sobj.nextInt();

        bitManipulation bobj = new bitManipulation();
        bobj.BitOff(No);
    }
}