/////////////////////////////////////////////////////////////////////
//
//  Function Name : MaxDiagonal()
//  Description :   Accept matrix from user and return largest element from both the diagonals.
//  Input :         2D matrix
//  Output :        largest element from both the diagonal
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

    public int MaxDiagonal(int Arr[][], int iRow, int iCol)
    {
        int i = 0, j = 0;
        int iMax = 0;

        iMax = Arr[i][j];
        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if((i == j) || (i + j) == 5)
                {
                    if(iMax < Arr[i][j])
                    {
                        iMax = Arr[i][j];
                    }
                }
            }
        }
        return iMax;
    }
}

class program72_3
{
    public static void main(String args[])
    {
        int Arr[][];
        int A = 4, B = 4;

        Arr = new int[A][B];
        
        Matrix mobj = new Matrix();
        mobj.Accept(Arr, A, B);
        mobj.Display(Arr, A, B);
        System.out.println("Maximum of Diagonal elements is: "+mobj.MaxDiagonal(Arr, A, B));
    }
}