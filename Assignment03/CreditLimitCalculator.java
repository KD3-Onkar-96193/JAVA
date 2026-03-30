
import java.util.Scanner;
class Account{
	private int accountNumber;
	private double balance;
	private double charge;
	private double creditDis;
	private double creditLimit;
	public Account() {
		
	}
	public Account(int accountNumber, double balance, double charge, double creditDis, double creditLimit) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.charge = charge;
		this.creditDis = creditDis;
		this.creditLimit = creditLimit;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getCharge() {
		return charge;
	}
	public void setCharge(double charge) {
		this.charge = charge;
	}
	public double getCreditDis() {
		return creditDis;
	}
	public void setCreditDis(double creditDis) {
		this.creditDis = creditDis;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	Scanner sc=new Scanner(System.in);
	void acceptRecord() {
		System.out.println("Enter account number ");
		accountNumber=sc.nextInt();
		System.out.println("Enter balance at begining of month");
		balance=sc.nextDouble();
		System.out.println("Total of all item charged by the customers this month");
		charge=sc.nextDouble();
		System.out.println("Total of all credits applied to the customer account this month");
		creditDis=sc.nextDouble();
		System.out.println("Allow credit limit");
		creditLimit=sc.nextDouble();
	}
	public double newBalance=(balance+charge-creditDis);
  
	
}

public class CreditLimitCalculator {

	public static void main(String[] args) {
		Account A1= new Account();
		A1.acceptRecord();
	    System.out.println("New Balance "+A1.newBalance);
	    if(A1.newBalance>A1.getCreditLimit()) {
	    	System.out.println("Credit Limit Exceeded");
	    }
	    else {
	    	System.out.println("Within Credit Limit");
	    }

	}

}
