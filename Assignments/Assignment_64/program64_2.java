/////////////////////////////////////////////////////////////////////
//
//  Function Name : BitOffOn
//  Description :   check the bit is on or off
//  Input :         integer (number)
//  Output :        on / off
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          06/01/2026
//
/////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class bitManipulation
{
    public void BitOffOn(int iNo)
    {
        int iResult1 = 0, iResult2 = 0;
        int iMask1 = 0, iMask2 = 0;

        iMask1 = 0x00000010;
        iMask2 = 0x00020000;

        iResult1 = iNo & iMask1;
        iResult2 = iNo & iMask2;

        if(iResult1 == iMask1)
        {
            System.out.println("5th Bit is ON");
        }
        else
        {
            System.out.println("5th Bit is OFF");
        }

        if(iResult2 == iMask2)
        {
            System.out.println("18th Bit is ON");
        }
        else
        {
            System.out.println("18th Bit is OFF");
        }
    }
}
class program64_2
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number :");
        int No = sobj.nextInt();

        bitManipulation bobj = new bitManipulation();
        bobj.BitOffOn(No);
    }
}