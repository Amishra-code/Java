/*1.Printing an array into Zigzag fashion. Suppose you were given an 
array of integers, and you are told to sort the integers in a zigzag 
pattern. In general, in a zigzag pattern, the first integer is less than the 
second integer, which is greater than the third integer, which is less than 
the fourth integer, and so on. Hence, the converted array should be in 
the form of e1 < e2 > e3 < e4 > e5 < e6.
Test cases:
Input 1:
7
4 3 7 8 6 2 1
Output 1:
3 7 4 8 2 6 1
Input 2:
4
1 4 3 2
Output 2:
1 4 2 3
*/

package Task2;

import java.util.*;

public class a 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter limit : ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        System.out.println("Enter elements : ");
        for(int i=0; i<n; i++)
        {
            int temp = sc.nextInt();
            arr[i] = temp;
        }

        for(int i=0; i<(n-1); i++)
        {
            for(int j=0; j<(n-i-1); j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i = 0; i<n-1; i++)
        {
            if(i!=0)
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        System.out.println("Elements in zigzag fashion are : ");

        for(int i=0; i<n; i++)
        {
            System.out.println(arr[i]);
        }
    }
}

