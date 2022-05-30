/*2. Write a java program to input a string than count following using wrapper Character class
Number of digits
Numbers of alphabet
Number of special character
Number of vowels
Number of Words
Use the methods of wrapper class and String Class.*/

package Task1;

import java.util.*;

public class b 
{
	public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = input.nextLine();
        
        int digit=0, alphabet=0, special_character=0, vowels=0, words=0;

        for(char i : str.toCharArray())
        {
            if(Character.isDigit(i))
                digit++;
            
            else if(Character.isAlphabetic(i))
            {
                i = Character.toLowerCase(i);

                if(i=='a' || i=='e'|| i=='i' || i=='o' || i=='u')
                    vowels++;
                else 
                    alphabet++;
            }

            else if(Character.isSpaceChar(i))
                words++;
            
            else 
                special_character++;
        }

        System.out.println("Number of digits : " + digit);
        System.out.println("Number of alphabet : " + alphabet);
        System.out.println("Number of special character : " + special_character);
        System.out.println("Number of vowels : " + vowels);
        System.out.println("Number of words : " + words);
    }
}
