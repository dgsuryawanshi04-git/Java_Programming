/////////////////////////////////////////////////////////////////////
//
//  Function Name : checkPalindrome
//  Description :   It is used to check the number is palindrome or not
//  Input :         int
//  Output :        yes / no
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          29/10/2025
//
/////////////////////////////////////////////////////////////////////


class Logic
{
    void checkPalindrome(int num)
    {
        int temp = 0;
        int rev = 0;
        int original = num;
        while(num != 0)
        {
            temp = num % 10;
            rev = rev * 10 + temp;
            num = num / 10;
        }
        if(rev == original)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");
        }
    }  
}
class Assignment17_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPalindrome(121);
    }
}