class Logic
{
    void calculateSum(int n)
    {
        int iCnt = 0, sum = 0;
        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            sum = sum + iCnt;
        }
        System.out.println(sum);
    }
}

class Assignment16_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.calculateSum(10);
    }
}