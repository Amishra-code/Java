/*1.Create a Scenario by implementing a java program that incorporates
a) Default throw and default catch(JVM)
b) Default throw(JVM) and user catch handler
c) User throw and default catch handler
d) User throw and user catch handler*/

package Task4;

import java.util.Scanner;
class MyCalculator {

public long power(int n, int p) throws Exception
{
    if(n == 0 && p == 0)
        throw new Exception("n and p should not be zero.");
    else if(n < 0 || p < 0)
        throw new Exception("n or p should not be negative.");
    else
        return (long)(Math.pow(n,p));
}

}
public class a {
public static final MyCalculator my_calculator = new MyCalculator();
public static final Scanner in = new Scanner(System.in);

public static void main(String[] args) {
    while (true) {
        int n = in .nextInt();
        int p = in .nextInt();
        
        try {
            System.out.println(my_calculator.power(n, p));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
}