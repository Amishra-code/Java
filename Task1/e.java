/*5. Using the switch statement, write a menu-driven program to calculate the maturity 
amount of a bank deposit.
The user is given the following options:
(i) Term Deposit
(ii) Recurring Deposit

For option (i) accept Principal (p), rate of interest (r) and time period in years (n). Calculate 
the maturity amount using the formula A = p[1 + r / 100]n.

For option (ii) accept monthly installment (p), rate of interest (r) and time period in months 
(n). Calculate the maturity amount using the formula 
A = p * n + p * n(n + 1) / 2 * r / 100 * 1 / 12.
For an incorrect option, an appropriate error message should be displayed.
[ Use Scanner Class to take input ]
*/

package Task1;

import java.util.*;

public class e 
{
    public static void MaturityAmount1(int p, int r, int t)
    {
        float amount = p*(1 + (r/100))*t;

        System.out.println("Maturity Amount : " + amount);
    }


    public static void MaturityAmount2(int p, int r, int t)
    {
        float amount = p * t + p * t*(t + 1) / 2 * r / 100 * 1 / 12;

        System.out.println("Maturity Amount : " + amount);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();

        switch (choice) 
        {
            case 1 : {
                        System.out.println("Enter principal amount : ");
                        int p = sc.nextInt();
                        System.out.println("Enter rate of interest : ");
                        int r = sc.nextInt();
                        System.out.println("Enter time period in years : ");
                        int t = sc.nextInt();
                        MaturityAmount1(p, r, t);
                     }
                     break;

            case 2 : {
                        System.out.println("Enter monthly installment : ");
                        int p = sc.nextInt();
                        System.out.println("Enter rate of interest : ");
                        int r = sc.nextInt();
                        System.out.println("Enter time period in months : ");
                        int t = sc.nextInt();
                        MaturityAmount2(p, r, t);
                     }
        
            default: System.out.println("Invalid input, Try again!!");
                     break;
        }
    }  
}

