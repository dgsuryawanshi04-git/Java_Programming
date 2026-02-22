/////////////////////////////////////////////////////////////////////
//
//  Function Name : ChkFrequency()
//  Description :   Accept matrix and one number from user and return the frequency of that number.
//  Input :         2D matrix
//  Output :        frequency of the number
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          21/02/2026
//
/////////////////////////////////////////////////////////////////////

import java.util.*;

class Matrix 
{
    public void Accept(int Arr[][], int iRow, int iCol)
    {
        int i = 0, j = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements of matrix: ");

        for(i = 0; i < iRow; i++)
        {
            System.out.println("Enter the elements of row: "+(i+1));
            for(j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    public void Display(int Arr[][], int iRow, int iCol)
    {
        int i = 0, j = 0;

        System.out.println("Elements of the matrix: ");

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public int ChkFrequency(int Arr[][], int iRow, int iCol, int iNo)
    {
        int i = 0, j = 0;
        int iCount = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == iNo)
                {
                    iCount++;
                }
            }
        }
        return iCount;
    }
}

class program72_2
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[][];
        int iNo = 0;
        int A = 4, B = 4;

        Arr = new int[A][B];
        
        Matrix mobj = new Matrix();

        mobj.Accept(Arr, A, B);

        System.out.println("Enter number to search: ");
        iNo = sobj.nextInt();
        
        mobj.Display(Arr, A, B);

        sobj.close();

        System.out.println("Frequency of the number: "+mobj.ChkFrequency(Arr, A, B, iNo));

    }
}