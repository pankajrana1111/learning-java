package com.pankaj;
import com.pankaj.SalariedEmployee;
public class MainWorker{
public static void main(String...args){
SalariedEmployee salariedEmployee=new SalariedEmployee("Pankaj","52707-N","04-Jul-2011",1500000,true);
//System.out.println(salariedEmployee.birthDate);
System.out.println(salariedEmployee.getAge());
}
}