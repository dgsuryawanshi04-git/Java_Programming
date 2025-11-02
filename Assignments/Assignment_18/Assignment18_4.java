/////////////////////////////////////////////////////////////////////
//
//  Function Name : sumOfEvenOddDigits
//  Description :   It is used to print the sum of even digits and odd digits.
//  Input :         int
//  Output :        int, int
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          29/10/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    void sumOfEvenOddDigits(int num)
    {
        int iDigit = 0;
        int sum1 = 0, sum2 = 0;

        while(num != 0)
        {
            iDigit = num % 10;
            num = num / 10;
            if((iDigit % 2) == 0)
            {
                sum1 = sum1 + iDigit;
            }
            if((iDigit % 2) != 0)
            {
                sum2 = sum2 + iDigit;
            }

        }
        System.out.print("sum of even:"+ sum1 + "\nsum of odd:"+ sum2 );
    }
}

class Assignment18_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumOfEvenOddDigits(123456);
    }
}