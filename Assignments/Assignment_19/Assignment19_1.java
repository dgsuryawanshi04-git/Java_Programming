/////////////////////////////////////////////////////////////////////
//
//  Function Name : checkLeapYear
//  Description :   It is used to check the year is leap or not.
//  Input :         int
//  Output :        int
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          29/10/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    void checkLeapYear(int year)
    {
        if((year % 4) == 0)
        {
            System.out.println(year + " leap year");
        }
        else
        {
            System.out.println(year + " leap year");
        }
    }
}

class Assignment19_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkLeapYear(2024);
    }
}