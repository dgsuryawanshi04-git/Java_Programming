/////////////////////////////////////////////////////////////////////
//
//  Function Name : AddColumn()
//  Description :   Accept matrix from user and display Addition of each column.
//  Input :         2D matrix
//  Output :        Addition of each column
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

    public void AddColumn(int Arr[][], int iRow, int iCol)
    {
        int i = 0, j = 0;
        int iSum = 0;

        for(i = 0; i < iCol; i++)
        {
            iSum = 0;
            for(j = 0; j < iRow; j++)
            {
                iSum = iSum + Arr[j][i];
            }
            System.out.print(iSum+" ");
        }
    }
}

class program72_4
{
    public static void main(String args[])
    {
        int Arr[][];
        int A = 4, B = 4;

        Arr = new int[A][B];
        
        Matrix mobj = new Matrix();
        mobj.Accept(Arr, A, B);
        mobj.Display(Arr, A, B);
        mobj.AddColumn(Arr, A, B);
    }
}