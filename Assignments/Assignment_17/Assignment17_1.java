/////////////////////////////////////////////////////////////////////
//
//  Function Name : SumOfDigits
//  Description :   It is used to display the sum of digits.
//  Input :         int
//  Output :        int
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          29/10/2025
//
/////////////////////////////////////////////////////////////////////


class Logic
{
    void SumOfDigits(int num)
    {
        int iDigit = 0;
        int sum = 0;
        while(num != 0)
        {
            iDigit = num % 10;
            num = num / 10;
            sum = sum + iDigit;
           
        }
        System.out.print("Sum of Digits:" + sum); 
    }
}

class Assignment17_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.SumOfDigits(1234);
    }
}