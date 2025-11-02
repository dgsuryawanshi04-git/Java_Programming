/////////////////////////////////////////////////////////////////////
//
//  Function Name : calculatePower
//  Description :   It is used to calculate the power of number.
//  Input :         int
//  Output :        int
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          29/10/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    void calculatePower(int base, int exp)
    {
        int iCnt = 0;
        int power = 1;

        for(iCnt = 1; iCnt <= exp; iCnt++)
        {
            power = power * base;
        }
        System.out.println(power);     
    }
}

class Assignment19_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.calculatePower(2, 5);
    }
}