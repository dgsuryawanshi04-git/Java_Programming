/////////////////////////////////////////////////////////////////////
//
//  Function Name : toggleBit
//  Description :   Accept one number from user and toggle its first 4 bits of that number, Return the modified number.
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
        int iMask = 0;

        iMask = 0x0000000f;         

        iNo = iNo | iMask;

        System.out.println("Updated number : "+iNo);
       
    }
}
class program65_5
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