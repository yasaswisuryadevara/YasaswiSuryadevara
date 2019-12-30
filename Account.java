package javacore;

public class Account {
     private int accountNumber;
     private String customerName;
     private double balance;
     public Account(){
       accountNumber= 12345;
       customerName= "DELOITTE";
       balance= 100000;
     }
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCusotmerName() {
		return customerName;
	}
	public void setCusotmerName(String customerName) {
		this.customerName = customerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account(int accountNumber, String customerName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;
	}
     
}
