package com.pankaj;
class CalculateInterest{
public static void main(String...agrs){
for (int i=2; i<=8; ++i){
System.out.println("The calculated interest rate for amount 10000 @"+i+"% is: "+calculateInterest(10000,i));
}
}
private static double calculateInterest(double amount, double rate){
return (amount*(rate/100));
}
}