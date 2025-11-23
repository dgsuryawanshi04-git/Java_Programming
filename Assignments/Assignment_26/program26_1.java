/*
    input: 5
    output: A B C D E


*/


import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        char ch = 'A';

        for(iCnt = 1; iCnt <= iNo; iCnt++, ch++)
        {
            System.out.printf("%c\t",ch);
        }
        System.out.println();
    }
}

class program26_1
{
    public static void main(String args[])
    {
        int iValue = 0;
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter Frequency:");
        iValue = sc.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);

    }
}