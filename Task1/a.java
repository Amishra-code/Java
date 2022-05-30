/*1. Write a java program that takes strings s1, s2 and find the following
I. Index of a variable
II. Character at an index
III. Convert the string into upper case and lower case
IV. Compare both stings.
V. Substring of s1*/

package Task1;

import java.util.*;

public class a 
{
	public static void main(String[] args)
    {
        String s1, s2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string : ");
        s1 = input.next();
        System.out.print("Enter second string : ");
        s2 = input.next();

        //I. Index of a variable
        System.out.print("\n\nEnter variable for first string : ");
        char c = input.next().charAt(0);
        System.out.println("Character is found at index  : " +s1.indexOf(c));

        System.out.print("Enter variable for first string : ");
        c = input.next().charAt(0);
        System.out.println("Character is found at index  : " +s2.indexOf(c));
        
        //II. Character at an index
        System.out.print("\nEnter index for a character of string s1 : ");
        int index = input.nextInt();
        System.out.println("Character at index " + index + " is : " + s1.charAt(index));
        
        System.out.print("Enter index for a character of string s2 : ");
        index = input.nextInt();
        System.out.println("Character at index " + index + " is : " + s2.charAt(index));

        //III. Convert the string into upper case and lower case
        System.out.println("\nString s1 in Lowercase : " + s1.toLowerCase());
        System.out.println("String s1 in Uppercase : " + s1.toUpperCase());

        System.out.println("String s2 in Lowercase : " + s2.toLowerCase());
        System.out.println("String s2 in Uppercase : " + s2.toUpperCase());

        //IV. Compare both stings.
        System.out.println("\nComparing strings s1 and s2 : ");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));

        //V. Substring of s1*/
        System.out.println("Substring in s1 : " + s1.substring(0,3));

    }
}

