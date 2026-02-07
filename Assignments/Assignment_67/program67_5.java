/////////////////////////////////////////////////////////////////////
//
//  Function Name : ToggleBitRange
//  Description :  Accept one number and from user and range of positions from user toggle all bits from that range.
//  Input :         integer (number)
//  Output :        on/ off
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          07/01/2026
//
/////////////////////////////////////////////////////////////////////

import java.util.*;

class bitManipulation
{
    public void ToggelBitRange(int iNo, int start, int end)
    {
        int iMask = 0;
        int iResult = 0;
        int i = 0;
        int no = iNo;

       for(i = start; i <= end; i++)
       {
            iMask = iMask | (1 << (i - 1));
       }
       
       iNo = iNo ^ iMask;

       System.out.println("Toggle all bits from the position "+start+" to "+end+" of the number i.e : "+no);

    }

}
class program67_5
{
    public static void main(String args[])
    {
        int No1 = 0, pos1 = 0, pos2 = 0;
        Scanner sobj = new Scanner( System.in);

        System.out.println("Enter number :");
        No1 = sobj.nextInt();

        System.out.println("Enter start position :");
        pos1 = sobj.nextInt();

        System.out.println("Enter end position :");
        pos2 = sobj.nextInt();

        bitManipulation bobj = new bitManipulation();
        bobj.ToggelBitRange(No1, pos1, pos2);
    }
}
