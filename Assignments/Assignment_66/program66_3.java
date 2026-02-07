/////////////////////////////////////////////////////////////////////
//
//  Function Name : BitOn
//  Description :   Accept one number and position from the user and on that bit, return modified number.
//  Input :         integer (number)
//  Output :        updated number
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          07/01/2026
//
/////////////////////////////////////////////////////////////////////


import java.util.*;

class bitManipulation
{
    public void BitOn(int iNo, int iPos)
    {
        int iMask = 0x1;

        iMask = iMask << (iPos - 1);
                   
        iNo = iNo ^ iMask;

        System.out.println("Updated number : "+iNo);

    }
}

class program66_3
{
    public static void main(String args[])    
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iNumber = sobj.nextInt();

        System.out.println("Enter position : ");
        int iPosition = sobj.nextInt();

        bitManipulation bobj = new bitManipulation();
        bobj.BitOn(iNumber,iPosition);

    }
}
