/*
 * ********************************************
 * File         : Multiplication.java         *
 * Description  : Multiplicaton of two matrix *
 * Author       : Rony Sebastian Tomson       *
 * Version      : 2                           *
 * Date         : 10/10/2023                  *
 * ********************************************
 */
package firstjavalab;
import java.util.Scanner;
public class Multiplication {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	int rowsize1,columnsize1,rowsize2,columnsize2;
	System.out.println("Enter the Row size and Column size of Matrix1 : ");
	rowsize1=sc.nextInt();
	columnsize1=sc.nextInt();
	System.out.println("Enter the Row size and Column size of Matrix2 : ");
	rowsize2=sc.nextInt();
	columnsize2=sc.nextInt();
	int [][]Matrix1=new int[rowsize1][columnsize1];
	int [][] Matrix2=new int[rowsize2][columnsize2];
	int [][] ResultantMatrix=new int[rowsize1][columnsize2];
    int i,j,k;
    
    if(rowsize2==columnsize1)
    {
    	System.out.println("Multiplication is possible");
    	System.out.println("Enter the values in the First Matrix :");
    for(i=0;i<rowsize1;i++)
    {
    	for(j=0;j<columnsize1;j++)
    	{
    		Matrix1[i][j]=sc.nextInt();
    		
    	}
    }
    System.out.println("Enter the values of the Second Matrix");
    for(i=0;i<rowsize2;i++)
    {
    	for(j=0;j<columnsize2;j++)
    	{
    		Matrix2[i][j]=sc.nextInt();
    	
    	}
    }
    	for(i=0;i<rowsize1;i++)
    	{
    		for(j=0;j<columnsize2;j++)
    		{
    			ResultantMatrix[i][j]=0;
    		
    	
    	for(k=0;k<rowsize2;k++ )
    	{
    		ResultantMatrix[i][j]= ResultantMatrix[i][j]+Matrix1[i][k]*Matrix2[k][j];
    	}
    		}
    	}
    	System.out.print("First Matrix :\n");
    	for(i=0;i<rowsize1;i++)
    	{
    		for(j=0;j<columnsize1;j++)
    		{
    			System.out.print(Matrix1[i][j]+"\t ");
    		}
    		System.out.println();
    		
    	}
    	System.out.print("Second Matrix :\n");
    	for(i=0;i<rowsize2;i++)
    	{
    		for(j=0;j<columnsize2;j++)
    		{
    			System.out.print(Matrix2[i][j]+"\t ");
    		}
    		System.out.println();
    		
    	}
    	System.out.print("Resultant Matrix :\n");
    	for(i=0;i<rowsize1;i++)
    	{
    		for(j=0;j<columnsize2;j++)
    		{
    			System.out.print(ResultantMatrix[i][j]+"\t ");
    		}
    		System.out.println();
    		
    	}
    	
    		
    	
    }
    else
    {
    	System.out.println("Multiplication is not possible");
    	
    }
}
}

			
	