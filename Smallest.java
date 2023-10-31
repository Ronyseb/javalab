package firstjavalab;
import java.util.Scanner;
public class Smallest {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit of Array:");
		int limit=sc.nextInt();
		int []array =new int[limit];
		int []array2=new int[limit];
		int count = 0;
		for(int i=0;i<limit;i++)
		{
			System.out.println("Enter the elements in the Array:");
		    array[i]=sc.nextInt();
		}
		for(int i=0;i<limit;i++)
		{
			for(int j=i+1;j<limit;j++)
			{
			   if(array[i]>array[j])
			   {
				   int temp;
				   temp=array[i];
				   array[i]=array[j];
				   array[j]=temp;
			   }
			}
		}
		for(int i=0;i<limit;i++)
		{
			int repeat=0;
			for(int j=i+1;j<limit;j++)
			{
				if(array[i]==array[j])
				{
					repeat++;
				}
			}
			if (repeat== 0) {
				array2[count] = array[i];
				count ++;
			}
		}
			
		
		System.out.println("The  2nd smallest element in the Array is:"+array2[1]);
		
	}
}
	

