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
        int iResult1 = 0, iResult2 = 0, iResult3 = 0, iResult4 = 0;
        int iMask1 = 0, iMask2 = 0,iMask3 = 0, iMask4 = 0;

        iMask1 = 0x00000040;
        iMask2 = 0x00004000;
        iMask3 = 0x00100000;
        iMask4 = 0x08000000;

        iResult1 = iNo & iMask1;
        iResult2 = iNo & iMask2;

        iResult3 = iNo & iMask3;
        iResult4 = iNo & iMask4;
        

        if(iResult1 == iMask1)
        {
            System.out.println("7th Bit is ON");
        }
        else
        {
            System.out.println("7th Bit is OFF");
        }

        if(iResult2 == iMask2)
        {
            System.out.println("15th Bit is ON");
        }
        else
        {
            System.out.println("15th Bit is OFF");
        }

         if(iResult3 == iMask3)
        {
            System.out.println("21th Bit is ON");
        }
        else
        {
            System.out.println("21th Bit is OFF");
        }

        if(iResult4 == iMask4)
        {
            System.out.println("28th Bit is ON");
        }
        else
        {
            System.out.println("28th Bit is OFF");
        }
    }
}
class program64_3
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