/*
 * ****************************************
 * File         : Attendence              *
 * Description  : Finding Attendence Mark *
 * Author       : Rony Sebastian Tomson   *
 * Version      : 2                       *
 * Date         : 26/09/2023              *
 * ****************************************
 */
package firstjavalab;

import java.util.Scanner;

public class Attendence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the attendence:");
		int percentage=sc.nextInt();
		if(percentage<=100 && percentage>=90)	
		{
			System.out.println("Attendence mark:10");
		}
		else 
		{
			System.out.println("Attendence mark:"+((float)percentage/10));
		}
	}
}
