package com.pankaj;
class SumOfDigits{

public static void main(String...args){
System.out.println(sumDigits(11023456));
}	

public static int sumDigits(int number){
int sum=0;
if(number>=10){
	int digit;	
	while(number>=10){
	 digit=number%10;
	 sum+=digit;
	 number/=10;
}return sum+=number;

}else return -1;

}

}