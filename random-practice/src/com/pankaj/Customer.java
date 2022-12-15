package com.pankaj;
import com.pankaj.BankAccount;
import com.pankaj.VipCustomer;
public class Customer{
static BankAccount bankAccount=new BankAccount();

public static void main(String...args){
	bankAccount.setAccNo("1000");
	bankAccount.setBalance(500000);
	bankAccount.setCustomerName("Pankaj");
	bankAccount.setEmail("pankajrana1111@gmail.com");
	bankAccount.setPhoneNo("7878063947");
	bankAccount.deposit(1000);
	bankAccount.withdraw(500000);
	bankAccount.withdraw(1000);
	VipCustomer vipCustomer0=new VipCustomer();
	VipCustomer vipCustomer1=new VipCustomer("pankaj","email@email.com");
	
}
}