/////////////////////////////////////////////////////////////////////
//
//  Function Name : printEvenNumbers
//  Description :   It is used to print the even numbers.
//  Input :         int
//  Output :        int
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          29/10/2025
//
/////////////////////////////////////////////////////////////////////


class Logic
{
    void printEvenNumbers(int num)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= num; iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                System.out.println(iCnt);
            }
            
        }
        
    }
}
class Assignment18_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printEvenNumbers(20);
    }
}