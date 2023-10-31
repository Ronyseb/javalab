package firstjavalab;
import java.util.Scanner;

public class ReverseString {
public static void main(String[] arg) {
	String string;
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the string");
	string=sc.nextLine();
	System.out.println("The Reverse of a string " + string + "is");
	for(int j=string.length();j>0;--j) {
		System.out.print(string.charAt(j-1));
	}
}
}