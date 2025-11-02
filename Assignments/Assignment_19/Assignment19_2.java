/////////////////////////////////////////////////////////////////////
//
//  Function Name : displayGrade
//  Description :   It is used to display the grade of student based on marks.
//  Input :         int
//  Output :        int
//  Auther :        Digvijay Gokul Suryawanshi
//  Date :          29/10/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    void displayGrade(int marks)
    {
       if(marks > 35 && marks < 50)
        {
            System.out.println("Grade C");
        }
        else if(marks >= 50 && marks <= 70)
        {
            System.out.println("Grade B");
        }
        else if(marks > 70 && marks <= 100)
        {
            System.out.println("Grade A");
        }
        else 
        {
            System.out.println("Fail");
        }
    }
}

class Assignment19_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.displayGrade(82);
    }
}