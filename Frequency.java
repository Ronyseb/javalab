/*
 * ***************************************************
 * File         : Frequency.java                     *             
 * Description  : Finding frequency of the character *
 * Author       : Rony Sebastian Tomson              *
 * Version      : 2                                  *
 * Date         : 03/10/2023                         *
 * ***************************************************
 */
package firstjavalab;
import java.util.Scanner;
public class Frequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sentence:");
		String input=sc.nextLine();
		System.out.println("Enter the letter:");
		char letter=sc.next().charAt(0);
		int sent=checkFrequency(input,letter);
		if(sent>0)
			System.out.println("The Frequecy is:  "+sent);
		else 
			System.out.println("The letter is not present");
	}
		static char checkFrequency(String input,char letter) {
			Scanner sc = new Scanner(System.in);
		char count=0;
		char a[]= input.toCharArray();
		int len=input.length();
		for(int i=0;i<len;i++) {
			if(letter==a[i])
				
				count++;
			
		}
		return count;
		}

}
