package com.pankaj;
class Sum{
public static void main(String...args){
int sum=0;
int count=0;
outerloop: for(int i=3; i<=1000; ++i){
if(i%3==0 && i%5==0){
	System.out.println("The no. is: "+i);
	count++;
	sum+=i;
	if(count==5){
	break outerloop;
	
	
	}
}

}
System.out.println("Sum is: "+sum);
}
}
