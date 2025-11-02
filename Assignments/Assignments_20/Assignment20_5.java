/////////////////////////////////////////////////////////////////////
//
//  Function Name : findSmallestDigit
//  Description :   It is used to find the smallest digit.
//  Input :         int
//  Output :        int
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          31/10/2025
//
/////////////////////////////////////////////////////////////////////


class Logic
{
    void findSmallestDigit(int num)
    {
        int iDigit = 0;
        int smallest = 0;

        while(num != 0)
        {
            iDigit = num % 10;
           
            if(iDigit < smallest)
            {
                smallest = iDigit;
                num = num / 10; 
            }
        }
        System.out.println("Largest digit is: " +smallest);
    }
}

class Assignment20_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(83429);
    }
}