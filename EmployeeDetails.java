/*
 * ********************************************
 * File         : EmployeeDetails             *             
 * Description  : To print employee details   *
 * Author       : Rony Sebastian Tomson       *
 * Version      : 2                           *
 * Date         : 17/10/2023                  *
 * ********************************************
 */
package firstjavalab;
import java.util.Scanner;
public class EmployeeDetails {
	public static void main(String [] args) {
		  
		  Officer officer = new Officer();
		  officer.getDetails();
			officer.getSpecialization();
			System.out.println("Details of Officer:");
			officer.printDetails();
			officer.printSpecialization();
	  
			
			Manager manager=new Manager();
			manager.getDetails();
			manager.getDepartment();
			System.out.println("Details of Manager:");
			manager.printDetails();
			manager.printDepartment();
	  }
}
class employee
{
		String name;
		int age;
		long phoneNumber;
		String address;
		double salary;
		Scanner sc = new Scanner(System.in);
		public void getDetails()
		{
			System.out.println("Enter the Name:");
			   name=sc.nextLine();
			System.out.println("Enter the Age:");
			age=sc.nextInt();
			System.out.println("Enter PhoneNo:");
			phoneNumber=sc.nextLong();
			sc.nextLine();
			System.out.println("Enter Address:");
			   address=sc.nextLine();
			   System.out.println("Enter Salary:");
			salary=sc.nextInt();
		}
		public void printDetails()
		{
			System.out.println("Name :"+name);
			System.out.println("Age :"+age);
			System.out.println("Phone NUmber :"+phoneNumber);
			System.out.println("Address :"+address);
		    System.out.println("Salary :"+salary);
		    
		}
}
	  class Officer extends employee{
		  String specialization;
			public void getSpecialization()
			{
			System.out.println("Enter Specialization:");
			specialization=sc.next();
			}
			public void printSpecialization()
			{
			System.out.println("Specialization :"+specialization);
			}
	  }
	  class Manager extends employee{
		  String department;
		  public void getDepartment()
		  {
			  System.out.println("Enter Departmnet :");
			  department =sc.next();
		  }
		  public void printDepartment()
		  {
			  System.out.println("Department :"+department);
			  
		  }
		  
	  }
