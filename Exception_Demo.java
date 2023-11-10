package firstjavalab;
import java.util.Scanner;
public class Exception_Demo {
	public static void main(String [] args) {
		System.out.println("Program to perform Division");
		Scanner sc=new Scanner(System.in);
	    char choice='y';
		while(choice=='y') {
			try {
			System.out.println("Enter Number-1 :");
			int num1=sc.nextInt();
			System.out.println("Enter Number-2 :");
			int num2=sc.nextInt();
			int result=num1/num2;
			System.out.println("Result = "+result);
		}
		
		
		catch(ArithmeticException s) {
			System.out.println("/ by zero");
			
		}
			finally {
				System.out.println("End of operation");
			}
			
			System.out.println("Do you want to continue y or n");
			choice=sc.next().charAt(0);
		}
	}
}
