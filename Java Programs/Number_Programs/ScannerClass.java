package Number_Programs;

import java.util.Scanner;

public class ScannerClass 
{   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter roll number : ");
        int roll = sc.nextInt();

        System.out.println("Enter name : ");
        String name = sc.next();

        System.out.println("Enter fee : ");
        double fee = sc.nextDouble();

        System.out.println(roll);
        System.out.println(name);
        System.out.println(fee);

        sc.close();
    }
}
