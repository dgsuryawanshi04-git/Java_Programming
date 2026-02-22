/////////////////////////////////////////////////////////////////////
//
//  Function Name : SwapRows()
//  Description :   Accept matrix from user and Swap the contents of the rows.
//  Input :         2D matrix
//  Output :        swap content of rows
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

    public void SwapRows(int Arr[][], int iRow, int iCol)
    {
        int i = 0, j = 0;
        int temp = 0;

        for(i = 0; i < iCol; i++)
        {
            temp = Arr[0][i];
            Arr[0][i] = Arr[1][i];
            Arr[1][i] = temp;            
        }

        for(i = 0; i < iCol; i++)
        {
            temp = Arr[2][i];
            Arr[2][i] = Arr[3][i];
            Arr[3][i] = temp;            
        }
    }
}

class program72_5
{
    public static void main(String args[])
    {
        int Arr[][];
        int A = 4, B = 4;

        Arr = new int[A][B];
        
        Matrix mobj = new Matrix();
        mobj.Accept(Arr, A, B);
        mobj.Display(Arr, A, B);

        mobj.SwapRows(Arr, A, B);

        System.out.println("Rows after swapping: ");
        mobj.Display(Arr, A, B);
    }
}