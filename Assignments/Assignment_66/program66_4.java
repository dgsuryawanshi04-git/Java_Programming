/////////////////////////////////////////////////////////////////////
//
//  Function Name : ToggleBit
//  Description :   Accept one number and position from the user and Toggle that bit, return modified number.
//  Input :         integer (number)
//  Output :        updated number
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          07/01/2026
//
/////////////////////////////////////////////////////////////////////

import java.util.*;

class bitManipulation
{
    public void ToggleBit(int iNo, int iPos)
    {
        int iMask = 0x1;

        iMask = iMask << (iPos - 1);
                   
        iNo = iNo ^ iMask;

        System.out.println("Updated number : "+iNo);

    }
}

class program66_4
{
    public static void main(String args[])    
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iNumber = sobj.nextInt();

        System.out.println("Enter position : ");
        int iPosition = sobj.nextInt();

        bitManipulation bobj = new bitManipulation();
        bobj.ToggleBit(iNumber,iPosition);

    }
}
