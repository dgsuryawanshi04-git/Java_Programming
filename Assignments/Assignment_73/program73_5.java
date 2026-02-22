/////////////////////////////////////////////////////////////////////
//
//  Function Name : ChkSparse()
//  Description :   Accept matrix from user and check whether the matrix is sparse or not.
//  Input :         2D matrix
//  Output :        true or false
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

    public boolean ChkSparse(int Arr[][], int iRow, int iCol)
    {
        int i = 0, j = 0;
        int iCount = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == 0)
                {
                    iCount++;
                }
            }
        }
        if(iCount > (iRow * iCol)/2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program73_5
{
    public static void main(String args[])
    {
        int Arr[][];
        int A = 4, B = 4;

        Arr = new int[A][B];
        
        Matrix mobj = new Matrix();
        mobj.Accept(Arr, A, B);
        mobj.Display(Arr, A, B);

        
        if(mobj.ChkSparse(Arr, A, B))
        {
            System.out.println("This is the sparse matrix");
        }
        else
        {
            System.out.println("this matrix is not sparse matrix");
        }
    }
}