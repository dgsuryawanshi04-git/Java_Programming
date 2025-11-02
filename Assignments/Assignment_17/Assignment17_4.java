/////////////////////////////////////////////////////////////////////
//
//  Function Name : findMin
//  Description :   It is used to find the minimum between three numbers.
//  Input :         int, int, int
//  Output :        int
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          29/10/2025
//
/////////////////////////////////////////////////////////////////////


class Logic
{
    void findMin(int a, int b, int c)
    {
        if(a < b && a < c )
        {
            System.out.println(a +" is minimum");
        }
        else if(b < a && b < c)
        {
            System.out.println(b +" is minimum");
        }
        else
        {
            System.out.println(c + " is minimum");
        }
    }
}

class Assignment17_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findMin(3, 7, 2);
    }
}