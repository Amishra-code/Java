/*3. 3. Write a program to declare a square matrix A[ ][ ] of order MxM where ‘M’ is the number 
of rows and the number of columns, such that M must be greater than 2 and less than 10. 
Accept the value of M as user input. Display an appropriate message for an invalid input. 
Allow the user to input integers into this matrix. Perform the following tasks:
(a) Display the original matrix.
(b) Rotate the matrix 90° clockwise as shown below:
(c) Find the sum of the elements of the four corners of the matrix.
Test your program for the following data and some random data:
Example 1

INPUT :

M = 3

3 4 9
2 5 8
1 6 7

OUTPUT :

ORIGINAL MATRIX

3 4 9 
2 5 8
1 6 7

MATRIX AFTER ROTATION

1 2 3
6 5 4
7 8 9

Sum of the corner elements = 20
*/

package Task1;

import java.util.Scanner;

public class c 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of 'm' : ");
        int m = sc.nextInt();

        if(m>2 && m<10)
        {
            int[][] arr = new int[m][m];
            int i=0, j=0, p, q;
            System.out.println("Enter elements of array : ");

            for(i=0; i<m; i++)
            {
                System.out.println("Enter elements for " + (i+1) + " row : ");
                for(j=0; j<m; j++)
                {
                    int temp = sc.nextInt();
                    arr[i][j] = temp;
                }
            }
            
            int[][] brr = new int[m][m];
 
            for(j=0, q=0; j<m; j++, q++)
            { 
                for(i=m-1, p=0; i>=0; i--, p++)
                {
                    brr[q][p]=arr[i][j];
                }
            }
 
            System.out.println("OUTPUT MATRIX ");
            for(i=0; i<m; i++)
            {
                for(j=0; j<m; j++)
                {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.print('\n');
            }
             
            System.out.println("REVERSE MATRIX ");
            int sum = 0;
            for(i=0; i<m; i++)
            {
                for(j=0; j<m; j++)
                {
                    System.out.print(brr[i][j] + " ");
                    if(i==0 || j==0 || i==(m-1) || j==(m-1))
                    {
                        sum += arr[i][j];
                    }
                }
                System.out.print('\n');
            }
        }

        else
        {
            System.out.println("Invalid limit for array size.");
        }
    }
}