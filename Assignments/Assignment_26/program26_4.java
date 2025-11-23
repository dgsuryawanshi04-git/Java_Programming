/*

Input: 4
output: # 1 * # 2 * # 3 * # 4 * 
*/


import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print("# "+ iCnt +" * ");   
        }
        System.out.println();
    }
}

class program26_4
{
    public static void main(String args[])
    {
        int iValue = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Frequency:");

        iValue = sc.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);

    }
}
