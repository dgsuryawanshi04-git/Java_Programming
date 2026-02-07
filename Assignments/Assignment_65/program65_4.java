/////////////////////////////////////////////////////////////////////
//
//  Function Name : toggleBit
//  Description :   Accept one number from user and toggle 7th and 10th bit of that number, Return the modified number.
//  Input :         integer (number)
//  Output :        updated number
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          06/01/2026
//
/////////////////////////////////////////////////////////////////////

import java.util.*;

class bitManipulation
{
    public void ToggleBit(int iNo)
    {
        int iMask = 0 ,iMask1 = 0, iMask2 = 0;

        iMask1 = 0x00000040;         // pos : 7
        iMask2 = 0x00000200;        // pos : 10

        iMask = iMask1 | iMask2;

        iNo = iNo ^ iMask;

        System.out.println("Updated number : "+iNo);
       
    }
}
class program65_4
{
    public static void main(String args[])
    {
        int No = 0;
        Scanner sobj = new Scanner( System.in);
        System.out.println("Enter number :");
        No = sobj.nextInt();

        bitManipulation bobj = new bitManipulation();
        bobj.ToggleBit(No);
    }
}