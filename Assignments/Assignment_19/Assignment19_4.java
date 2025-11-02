/////////////////////////////////////////////////////////////////////
//
//  Function Name : printDigits
//  Description :   It is used to print the digits.
//  Input :         int
//  Output :        int
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          29/10/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    void printDigits(int num)
    {
        int iDigit = 0;
        while(num != 0)
        {
            iDigit = num % 10;  
            num = num / 10;
            System.out.println(iDigit);
           
        }   
        
    }
}

class Assignment19_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printDigits(9876);
    }
}