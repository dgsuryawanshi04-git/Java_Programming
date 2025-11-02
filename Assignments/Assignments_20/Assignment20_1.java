/////////////////////////////////////////////////////////////////////
//
//  Function Name : sumOfEvenNumbers
//  Description :   It is used to print the sum of even digits and odd digits.
//  Input :         int
//  Output :        int
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          31/10/2025
//
/////////////////////////////////////////////////////////////////////

class Logic 
{
    void sumOfEvenNumbers(int n)
    {
        int iCnt = 0;
        int sum = 0;

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                sum = sum + iCnt;
            }
        }
        System.out.println("Sum of even numbers: "+ sum);

    }
}
class Assignment20_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumOfEvenNumbers(10);
    }
}