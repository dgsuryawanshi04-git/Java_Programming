/////////////////////////////////////////////////////////////////////
//
//  Function Name : CheckEvenOdd
//  Description :   It is used to check the number is even or odd.
//  Input :         int
//  Output :        even / odd
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          29/10/2025
//
/////////////////////////////////////////////////////////////////////


class Logic
{
    void CheckEvenOdd(int n)
    {
        if(n % 2 == 0)
        {
            System.out.println( "Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
        
    }
}

class Assignment16_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CheckEvenOdd(7);
    }
}