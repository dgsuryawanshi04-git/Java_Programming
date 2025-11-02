/////////////////////////////////////////////////////////////////////
//
//  Function Name : findLargestDigit
//  Description :   It is used to find the largest digits.
//  Input :         int
//  Output :        int
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          31/10/2025
//
/////////////////////////////////////////////////////////////////////


class Logic
{
    void findLargestDigit(int num)
    {
        int iDigit = 0;
        int largest = 0;

        while(num != 0)
        {
            iDigit = num % 10;
           
            if(iDigit > largest)
            {
                largest = iDigit;
                num = num / 10; 
            }
        }
        System.out.println("Largest digit is: " +largest);
    }
}

class Assignment20_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);
    }
}