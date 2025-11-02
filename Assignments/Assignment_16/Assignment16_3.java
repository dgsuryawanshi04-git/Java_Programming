/////////////////////////////////////////////////////////////////////
//
//  Function Name : findFactorial
//  Description :   It is used to find factorial of the number.
//  Input :         int
//  Output :        int
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          29/10/2025
//
/////////////////////////////////////////////////////////////////////


class Logic
{
    void findFactorial(int num)
    {
        int iCnt = 0;
        int fact = 1;
        for(iCnt = num; iCnt >= 1; iCnt--)
        {
            fact = fact * iCnt;
        }

        System.out.println(fact);
        
    }
}

class Assignment16_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findFactorial(5);
    }
}