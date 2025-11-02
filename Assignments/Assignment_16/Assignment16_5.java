/////////////////////////////////////////////////////////////////////
//
//  Function Name : CountDigits
//  Description :   It is used to count the digits.
//  Input :         int
//  Output :        int
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          29/10/2025
//
/////////////////////////////////////////////////////////////////////


class Logic
{
    void CountDigits(int num)
    {
        int iCount = 0;
        while(num != 0)
        {
            num = num / 10;
            iCount++;

        }
        System.out.print(iCount); 
    }
}

class Assignment16_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CountDigits(7865);
    }
}