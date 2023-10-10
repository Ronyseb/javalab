/*
   *********************************************************************
   *  File            :  AreaOfShapes.java                             *  
   *  Description     :  To find the area of different shapes          *
   *  Author          :  Rony Sebastian Tomson                         *
   *  Version         :  2                                             *
   *  Date            :  10/10/2023                                    *
   *********************************************************************
*/
package firstjavalab;

import java.util.Scanner;

public class AreaOfShapes {
	public static void main(String[] args) {
		Shape shape=new Shape();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base of Triangle : ");
		float base=sc.nextFloat();
		System.out.println("Enter the height of Triangle : ");
		float height=sc.nextFloat();
		System.out.println("Enter the length of Rectangle : ");
		int length=sc.nextInt();
		System.out.println("Enter the breadth of Rectangle : ");
		int breadth=sc.nextInt();
		System.out.println("Enter the radius of Circle:");
		float radius=sc.nextFloat();
		Shape.area(height,base);
		Shape.area(length,breadth);
		Shape.area(radius);
		
	}

}
class Shape{
	
	public static void area(int length,int breadth) {
		System.out.println("Area of Rectangle with length="+length+" and breadth="+breadth+" is="+(length*breadth));
	}
	public static void area(float height,float base) {
		System.out.println("Area of triangle with base="+base+" and height="+height+" is="+(0.5*height*base));
	}
	public static void area(float radius) {
		System.out.println("Area of circle with radius="+radius+" is="+(3.14*radius*radius));
	}
}
	

