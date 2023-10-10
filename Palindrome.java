/*
 * ********************************************
 * File         : Palindrome                  *             
 * Description  : Checking whether the string *
 *                is Palindrome or not        *
 * Author       : Rony Sebastian Tomson       *
 * Version      : 2                           *
 * Date         : 03/10/2023                  *
 * ********************************************
 */
package firstjavalab;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String input=sc.next();
        boolean word=yesPalindrome(input);
        if(word)
        {
        	System.out.println("The given string is Palindrome");
        }
        else
        {
        	System.out.println("The given string is not a Palindrome");
	}
}
        static boolean yesPalindrome(String input) {
        	char[] charArray = input.toCharArray();
        	int length=input.length();
        	for(int i=0;i<length/2;i++)
        	{
        	if(charArray[i]!=charArray[length-i-1]) 
        	{
              return false;
        	}
        	}
        
        return true;
        }
}

	
