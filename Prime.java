package firstjavalab;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		int fact=0;
		Scanner sc=new Scanner(System.in);
				System.out .println("Enter a number :");
				int number= sc.nextInt();
				for(int i=1;i<number;i++)
				{
					if(number%i==0)
					{
						fact++;
					}
				}
   if(fact==1)
   {
	   System.out.println("The Number is prime");
   }
   else
   {
	   System.out.println("The Number is not Prime");
   }
}
}

