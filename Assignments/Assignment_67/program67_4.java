/////////////////////////////////////////////////////////////////////
//
//  Function Name : CkBits
//  Description :   Accept one number and 2 positions from the user and check whether bit at 1st position or 2nd position is on or off.
//  Input :         integer (number)
//  Output :        on/ off
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          07/01/2026
//
/////////////////////////////////////////////////////////////////////

import java.util.*;

class bitManipulation
{
    public void ChkBits(int iNo, int iPos1, int iPos2)
    {
        int iMask1 = 0x1, iMask2 = 0x1, iMask = 0;

        iMask1 = iMask1 << (iPos1 - 1);
        iMask2 = iMask2 << (iPos2 - 1);

        iMask = iMask1 | iMask2;

        if((iNo & iMask) != 0)
        {
            System.out.println("Bit is ON");
        }
        else
        {
            System.out.println("Bit is OFF");
        }
    }

}
class program67_4
{
    public static void main(String args[])
    {
        int No1 = 0, pos1 = 0, pos2 = 0;
        Scanner sobj = new Scanner( System.in);

        System.out.println("Enter number :");
        No1 = sobj.nextInt();

        System.out.println("Enter 1st position :");
        pos1 = sobj.nextInt();

        System.out.println("Enter 2nd position :");
        pos2 = sobj.nextInt();

        

        bitManipulation bobj = new bitManipulation();
        bobj.ChkBits(No1, pos1, pos2);
    }
}
