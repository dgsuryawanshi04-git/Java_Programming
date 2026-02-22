/////////////////////////////////////////////////////////////////////
//
//  Function Name : ReverseRow()
//  Description :   Accept matrix from user and reverse the contents of each row.
//  Input :         2D matrix
//  Output :        reverse each row
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          22/02/2026
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
        sobj.close();
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

    public void ReverseRow(int Arr[][], int iRow, int iCol)
    {
        int i = 0, j = 0;
        int temp = 0;
        int iStart = 0, iEnd = 0;

        for(i = 0; i < iRow; i++)
        {
            iStart = 0;
            iEnd = iCol-1;

            while(iStart < iEnd)
            {
                temp = Arr[i][iStart];
                Arr[i][iStart] = Arr[i][iEnd];
                Arr[i][iEnd] = temp;

                iStart++;
                iEnd--;
            }
        }
    }
}

class program73_2
{
    public static void main(String args[])
    {
        int Arr[][];
        int A = 4, B = 4;

        Arr = new int[A][B];
        
        Matrix mobj = new Matrix();
        mobj.Accept(Arr, A, B);
        mobj.Display(Arr, A, B);

        mobj.ReverseRow(Arr, A, B);

        System.out.println("Matrix after reverse row: ");
        mobj.Display(Arr, A, B);
    }
}