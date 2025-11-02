/////////////////////////////////////////////////////////////////////
//
//  Function Name : printTable
//  Description :   It is used to print the table of number.
//  Input :         int
//  Output :        int
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          29/10/2025
//
/////////////////////////////////////////////////////////////////////


class Logic
{
    void printTable(int num)
    {
        int iCnt = 0;
        int table = 0;
        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            table = num * iCnt;
            System.out.println(table);
        }
    }
}
class Assignment17_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printTable(5);
    }
}