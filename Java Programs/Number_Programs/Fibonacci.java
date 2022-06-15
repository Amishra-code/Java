//Fibonacci series

package Number_Programs;

import java.util.*;

public class Fibonacci 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int first=0, second=1;
        
        if(n>=1)
        {
            System.out.println("The fibonacci series for " + n + " number of terms : ");

            for(int i=1; i<=n; i++)
            {
                if(i==1)
                    System.out.println(first);
            
                else if(i==2)
                    System.out.println(second);
            
                else
                {
                    int x=first+second;
                    System.out.println(x);
                    first = second;
                    second += first;
                }
            }
        }

        else
            System.out.println("'n' is invalid.");
    }
}