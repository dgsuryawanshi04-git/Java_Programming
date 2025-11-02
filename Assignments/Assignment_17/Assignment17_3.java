/////////////////////////////////////////////////////////////////////
//
//  Function Name : findMax
//  Description :   It is used to find the maximum of two numbers.
//  Input :         int, int
//  Output :        max / min
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          29/10/2025
//
/////////////////////////////////////////////////////////////////////


class Logic
{
    void findMax(int a, int b)
    {
        if(a > b)
        {
            System.out.println("Number is maximum");
        }
        else
        {
            System.out.println("Number is minimum");
        }
    }
}

class Assignment17_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findMax(20 , 15);
    }
}