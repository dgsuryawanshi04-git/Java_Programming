/////////////////////////////////////////////////////////////////////
//
//  Function Name : reverseNumber
//  Description :   It is used to print the digits in reverse order.
//  Input :         int
//  Output :        int
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          29/10/2025
//
/////////////////////////////////////////////////////////////////////


class Logic
{
    void reverseNumber(int num)
    {
        int iDigit = 0;
        while(num != 0)
        {
            iDigit = num % 10;
            System.out.print(iDigit); 
            num = num / 10;
        }
    }
}

class Assignment16_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.reverseNumber(1234);
    }
}