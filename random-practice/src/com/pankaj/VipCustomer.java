package com.pankaj;

class VipCustomer{
	private String name;
	private int creditLimit;
	private String email;
	
	public VipCustomer(){
	this("Pankaj", 100000, "pankajrana1111@gmail.com");
	}
	public VipCustomer(String name, int creditLimit, String email){
		this.name=name;
		this.creditLimit=creditLimit;
		this.email=email;
		System.out.println(this.name+" "+this.creditLimit+" "+this.email);
	}
	public VipCustomer(String name, String email){
		this(name, 50000, email);
		System.out.println(this.name+" "+this.creditLimit+" "+this.email);
	}

}