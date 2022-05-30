/*4. Construct a Program in java to replace all 0's with 1 in a given integer. 
Given an integer as an input, all the 0's in the number has to be replaced with 1.
For example, consider the following number

Input: 102405
Output: 112415
Input: 56004
Output: 56114
Steps to replace all 0's with 1 in a given integer
a.)Input the integer from the user.
b.)Traverse the integer digit by digit.
c.)If a '0' is encountered, replace it by '1'.
d.)Print the integer.*/

package Task1;

import java.util.*;

public class d 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        String number = sc.next();
        
        String str="";
        for(int i=0; i<number.length(); i++)
        {
            if(number.charAt(i)=='0')
                str = str + 1;
            else
                str = str+number.charAt(i); 
        }

        System.out.println("Orginial string : " + number);
        System.out.println("Modified string : " + str);
    }
}

