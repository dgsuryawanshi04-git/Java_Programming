/////////////////////////////////////////////////////////////////////
//
//  Function Name : checkPerfect
//  Description :   It is used to check the number is perfect or not.
//  Input :         int
//  Output :        int, yes / no
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          31/10/2025
//
/////////////////////////////////////////////////////////////////////

class Logic 
{
    void checkPerfect(int num)
    {
        int iCnt = 0;
        int sum = 0;

        for(iCnt = 1; iCnt <= (num/2); iCnt++)
        {
            if((num % iCnt) == 0)
            {
                sum = sum + iCnt;
            }
        }
        if(sum == num)
        {
            System.out.println(num +" is perfect number");
        }      
        else
        {
            System.out.println(num +" is not a perfect number");
        }
        
    }
}
class Assignment20_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPerfect(6);
    }
}