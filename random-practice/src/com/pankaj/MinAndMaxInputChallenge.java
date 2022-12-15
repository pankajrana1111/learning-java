package com.pankaj;
import java.util.Scanner;
class MinAndMaxInputChallenge{
	public static void main(String...args){
		Scanner scanner = new Scanner(System.in);
		int max=0;
		int min=0;
		int var=0;
		int count=0;
		
		while(true){
			System.out.println("Enter a valid No.");
			if(scanner.hasNextInt()){
				//System.out.println("Hello");
				var=scanner.nextInt();
				if(count==0){
				min=var;
				max=var;
				count++;
				}
								
				if(var >= max){
				//System.out.println("Hello1");	
				max = var;
					
				}
				if(var <= min){
				min = var;
					
				}
			System.out.println("Max :"+max);
			System.out.println("Min :"+min);
			scanner.nextLine();	
			}else{
			System.out.println("Invalid Input!");
			System.out.println("Max: "+max);
			System.out.println("Min: "+min);
			break;
			}
		}
	}
}