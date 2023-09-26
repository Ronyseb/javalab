/*
 * ****************************************
 * File         : AddtwoNumbers           *
 * Description  : Finding sum             *
 * Author       : Rony Sebastian Tomson   *
 * Version      : 2                       *
 * Date         : 26/09/2023              *
 * ****************************************
 */
package firstjavalab;
import java.util.Scanner;
public class AddtwoNmbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int sum=num1+num2;
		System.out.println("sum of two numbers is"+sum);
	}

}
