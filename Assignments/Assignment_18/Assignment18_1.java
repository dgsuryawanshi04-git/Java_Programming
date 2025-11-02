/////////////////////////////////////////////////////////////////////
//
//  Function Name : checkPrime
//  Description :   It is used to check the number is prime or not.
//  Input :         int
//  Output :        int
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          29/10/2025
//
/////////////////////////////////////////////////////////////////////


class Logic
{
    void checkPrime(int num)
    {
        int iCnt = 0;
        int count = 0;

        for(iCnt = 2; iCnt < num; iCnt++)
        {
            if((num % iCnt) == 0)
            {
                count++;
                break;
            }
        }
        if(count == 0)
        {
            System.out.println(num +" is prime number");
        }
        else
        {
            System.out.println(num +" is not prime number");
        }
        
    }
}
class Assignment18_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPrime(11);
    }
}