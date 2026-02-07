/////////////////////////////////////////////////////////////////////
//
//  Function Name : ChkBitOnOff
//  Description :   Accept one number and position from the user check bit of that position is on or off.
//  Input :         integer (number)
//  Output :        updated number
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          06/01/2026
//
/////////////////////////////////////////////////////////////////////

import java.util.*;

class bitManipulation
{
    public void ChkBitOnOff(int iNo, int iPos)
    {
        int iMask = 0x1, iResult = 0;

        iMask = iMask << (iPos - 1);
                   
        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println(iPos+"th Bit is ON");
        }
        else
        {
            System.out.println(iPos+"th Bit is OFF");
        }  
    }
}

class program66_1
{
    public static void main(String args[])    
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iNumber = sobj.nextInt();

        System.out.println("Enter position : ");
        int iPosition = sobj.nextInt();

        bitManipulation bobj = new bitManipulation();
        bobj.ChkBitOnOff(iNumber,iPosition);

    }
}
