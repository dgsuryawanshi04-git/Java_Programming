/////////////////////////////////////////////////////////////////////
//
//  Function Name : checkDivisible
//  Description :   It is used to check the number is divisible by 5 or not.
//  Input :         int
//  Output :        int
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          29/10/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    void checkDivisible(int num)
    {
        if((num % 5) == 0 && (num % 11) == 0)
        {
            System.out.println(num + " is divisible by 5 and 11");
        }
        else
        {
            System.out.println(num + " is not divisble by 5 and 11");
        }
    }
}

class Assignment19_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkDivisible(55);
    }
}