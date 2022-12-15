package com.pankaj;
public class BankAccount{
	private String accNo;
	private int balance;
	private String customerName;
	private String email;
	private String phoneNo;
	
	public void setAccNo(String accNo){
		this.accNo=accNo;
	}
	public void setBalance(int balance){
		this.balance=balance;
	}
	public void setCustomerName(String customerName){
		this.customerName=customerName;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public void setPhoneNo(String phoneNo){
		this.phoneNo=phoneNo;
	}
	public String getAccNo(){
	return this.accNo;
	}
	public int getBalance(){
	return this.balance;
	}
	public String getCustomerName(){
	return this.customerName;
	}
	public String getEmail(){
	return this.email;
	}
	public String getPhoneNo(){
	return this.phoneNo;
	}
	
	public void deposit(int amount){
		this.balance+=amount;
		System.out.println("Updated balance: "+this.balance);
	}
	public void withdraw(int amount){
		if(this.balance>=amount){
			this.balance-=amount;
			System.out.println("Upadated balance: "+this.balance);
	}else System.out.println("Insufficient Balance!");
	}
}