package com.pankaj;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.*;
public class Worker{
private String name;
private String birthDate;
private String retireDate;

public Worker(String name){
this.name=name;
this.birthDate="19/Apr/1989";
this.retireDate="03-Jul-2021";
}
public int getAge(){
	DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MMM/yyyy");
	LocalDate date=LocalDate.parse(birthDate, formatter);
	int year=date.getYear();
	return (2022-year);
}
public double collectPay(){
	return 100000;
}
public void terminate(String retireDate){
	System.out.println("Terminated");
}
}

class Employee extends Worker{
private String employeeId;
private String hireDate;
public Employee (String name, String employeeId, String hireDate){
super(name);
this.employeeId=employeeId;
this.hireDate=hireDate;
}
}

class SalariedEmployee extends Employee{
private double annualSalary;
private boolean isRetired;
public SalariedEmployee(String name, String employeeId, String hireDate,double annualSalary, boolean isRetired){
	super(name, employeeId, hireDate);
	this.annualSalary=annualSalary;
	this.isRetired=isRetired;
}
}

