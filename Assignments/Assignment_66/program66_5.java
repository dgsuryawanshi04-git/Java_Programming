/////////////////////////////////////////////////////////////////////
//
//  Function Name : BitOff
//  Description :   Accept one number from the user toggle the contents of first and last nibble of the number, return modified number.
//  Input :         integer (number)
//  Output :        updated number
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          07/01/2026
//
/////////////////////////////////////////////////////////////////////

import java.util.*;

class bitManipulation
{
    public void ToggleBit(int iNo)
    {
        int iMask = 0x1;

        iMask = 0xf000000f;
                   
        iNo = iNo ^ iMask;

        System.out.println("Updated number : "+iNo);

    }
}

class program66_5
{
    public static void main(String args[])    
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iNumber = sobj.nextInt();

        // System.out.println("Enter position : ");
        // int iPosition = sobj.nextInt();

        bitManipulation bobj = new bitManipulation();
        bobj.ToggleBit(iNumber);

    }
}
