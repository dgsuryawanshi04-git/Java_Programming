/////////////////////////////////////////////////////////////////////
//
//  Method Name :   printReverse
//  Description :   It is used to print the number in reverse order.
//  Input :         int
//  Output :        int
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          31/10/2025
//
/////////////////////////////////////////////////////////////////////

class Logic 
{
    void printReverse(int n)
    {
        int iCnt = 0;

        for(iCnt = n; iCnt >= 1; iCnt--)
        {
            System.out.println(iCnt);
        }       
    }
}
class Assignment20_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printReverse(10);
    }
}