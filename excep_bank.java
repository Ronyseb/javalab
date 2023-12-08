package firstjavalab;
import java.util.Scanner;
class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String str) {
super(str);
	}}
	class  InvalidAmountException extends Exception {
		 public InvalidAmountException(String str) {
			 super(str);
		 }

	}
public class excep_bank {
	public static void main(String []args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		InvalidAmountException amountException=new InvalidAmountException("invalid");
		InsufficientFundsException fundException =new InsufficientFundsException("Insufficient fund");
		System.out.println("Enter the number of customers :");
		int nofcustomer =sc.nextInt();
		Customer [] customer=new Customer[nofcustomer];
		for(int i=0;i<nofcustomer;i++) {
			customer [i]=new Customer();
			customer[i].setcustomerdetails();
		}
		for(int i=0;i<nofcustomer;i++) {
			customer[i].printdetails();
		}
		do {
			System.out.println("1.Display Account Details");
			System.out.println("2.Search by account number");
			System.out.println("3.Deposit the amount");
			System.out.println("4.Withdraw the amount");
			System.out.println("5.Exit ");
			System.out.println("Enter your choice");
			 choice =sc.nextInt();
			 switch (choice) {
			 case 1:
				 for (int i=0 ; i<nofcustomer;i++) {
					 customer[i].printdetails();
				 }
				 break;
			 case 2:
				 System.out.println("Enter the account number :");
				 int searchaccount=sc.nextInt();
				 for(int i=0;i<nofcustomer;i++) {
					 if(customer[i].acc_no==searchaccount) {
						 customer[i].printdetails();
						 
					 }
					 else {
						 System.out.println("Account not found ");
					 }
				 }
				 break;
			 case 3:
				 System.out.println("Enter the account number :");
				 searchaccount=sc.nextInt();
				 try {
				 System.out.println("Enter the amount to deposit :");
				 int depositamount =sc.nextInt();
				 if (depositamount<0) {
					 throw amountException;
				 }
				 else {
				 for(int i=0;i<nofcustomer;i++) {
					 if (customer[i].acc_no==searchaccount) {
						 customer[i].balance=customer[i].balance+depositamount;
						 customer[i].printdetails();
					 }
				 }
				 }
				 }
				 catch(InvalidAmountException e) {
					 System.out.println("Invalid deposit");
				 }
				 break;
			 
			 case 4 :
				 System.out.println("Enter the account number :");
				 searchaccount=sc.nextInt();
				 try {
					 System.out.println("Enter the amount to withdraw");
					 int withdrawAmount=sc.nextInt();
					 if (withdrawAmount<=0) {
						 throw amountException;
						 
					 }
					 else {
						 for(int i=0;i<nofcustomer;i++) {
							 if (customer[i].acc_no==searchaccount) {
							if (withdrawAmount>customer[i].balance)	 {
								throw fundException;
							}
							else {
								 customer[i].balance=customer[i].balance-withdrawAmount;
								 customer[i].printdetails();
						 }
							}
						 }}
				 }
				 catch(InvalidAmountException e) {
						System.out.println(e.getMessage());
					}catch(InsufficientFundsException e) {
						System.out.println(e.getMessage());
					}
						break;
			
				 
				 default :
			 }
			 
		}
		while(choice<5); {
			
		}
		
		

}}
 class Customer{
	int acc_no,balance;
	String name,accountType;
	public void setcustomerdetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name :");
		name=sc.next();
		System.out.println("Enter the account number :");
		acc_no=sc.nextInt();
		System.out.println("Enter the account type :");
		accountType=sc.next();
		System.out.println("Enter the balance :");
		balance=sc.nextInt();

	}
	public void printdetails()
	{
		System.out.println("-> ");
		System.out.println("The details of the customer are : ");
		System.out.println("Accountnumber :"+acc_no);
		System.out.println("Accounttype :"+accountType);
		System.out.println("Customer name :"+name);
		System.out.println("Balance :"+balance);
	}
	
 }
