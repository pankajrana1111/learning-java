package com.pankaj;
import java.util.Scanner;
class UserInput{
public static void main(String...args){
int numberCount=1;
Scanner scanner = new Scanner(System.in);

int sum=0;
while(numberCount<=10){
System.out.println("Enter number #"+numberCount+":");
if(scanner.hasNextInt()){
	sum+=scanner.nextInt();
	numberCount++;
}else{
	scanner.nextLine();
	System.out.println("Invalid Number");
}
}
scanner.close();
}
}