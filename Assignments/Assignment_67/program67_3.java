/////////////////////////////////////////////////////////////////////
//
//  Function Name : CkBits
//  Description :   Accept one number from the user and check whether 9th or 12th bit is on or off.
//  Input :         integer (number)
//  Output :        on/ off
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          07/01/2026
//
/////////////////////////////////////////////////////////////////////

import java.util.*;

class bitManipulation
{
    public void ChkBits(int iNo)
    {
        int iMask1 = 0x1, iMask2 = 0x1, iMask = 0;
        int iPos1 = 9, iPos2 = 12;
        int iResult = 0;

        iMask1 = iMask1 << (iPos1 - 1);
        iMask2 = iMask2 << (iPos2 - 1);

        iMask = iMask1 | iMask2;

        iResult = iNo & iMask;

        if(iResult != 0)
        {
            System.out.println("Bits are ON");            
        }
        else
        {
            System.out.println("Bits are OFF");
        }
    }
}
class program67_3
{
    public static void main(String args[])
    {
        int No1 = 0;
        Scanner sobj = new Scanner( System.in);
        System.out.println("Enter number :");
        No1 = sobj.nextInt();

        

        bitManipulation bobj = new bitManipulation();
        bobj.ChkBits(No1);
    }
}