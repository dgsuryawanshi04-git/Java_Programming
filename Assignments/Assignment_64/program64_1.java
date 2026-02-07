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
        int iResult = 0;
        int iMask = 0;

        iMask = 0x00004000;

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("15th Bit is ON");
        }
        else
        {
            System.out.println("15th Bit is OFF");
        }
    }
}
class program64_1
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