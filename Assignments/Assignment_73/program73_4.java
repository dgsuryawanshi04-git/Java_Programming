/////////////////////////////////////////////////////////////////////
//
//  Function Name : ChkIdentity()
//  Description :   Accept matrix from user and check whether the matrix is identity or not.
//  Input :         2D matrix
//  Output :        True or false
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

    public boolean ChkIdentity(int Arr[][], int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if((i == j) && (Arr[i][j] != 1))
                {
                    return false;
                }
            }
        }
        return true;
    }
}

class program73_4
{
    public static void main(String args[])
    {
        int Arr[][];
        int A = 4, B = 4;

        Arr = new int[A][B];
        
        Matrix mobj = new Matrix();
        mobj.Accept(Arr, A, B);
        mobj.Display(Arr, A, B);

        
        if(mobj.ChkIdentity(Arr, A, B))
        {
            System.out.println("Identity matrix");
        }
        else
        {
            System.out.println("this matrix is not identity matrix");
        }
    }
}