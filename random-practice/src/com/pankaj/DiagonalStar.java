package com.pankaj;
public class DiagonalStar {
    public static void printSquareStar(int number){
        if(number<5){
          System.out.print("Invalid Value");
          return;
        }
		
outerLoop:for (int i=1; i<=number/2; i++){
            if(i==1){
               for(int j=1; j<=number; j++){
                System.out.print("*");  
               } 
                System.out.print("\n");
                continue outerLoop;
            }else{
                for(int j=1;j<=number;j++){
                    if(j==1 || j==i || j==((number-i)+1) || j==number) System.out.print("*");
					else System.out.print(" ");
                }
                System.out.print("\n");
            }
            
        }
		if(number%2!=0){
            int i = (number/2)+1;
            for (int j=1;j<=number;j++){
                if(j==1 || j==i || j==(number-i)+1 || j==number) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("\n");
        }
        for (int i=number/2; i>=1; i--){
            if(i==1){
                for (int j=1; j<=number; j++) System.out.print("*");
            }else{
                for (int j=1; j<=number; j++){
                    if(j==1 || j==i || j==((number-i)+1) || j==number) System.out.print("*");
					else System.out.print(" ");
                }
                System.out.print("\n");
            }
        }
    }
	public static void main(String...agrs){
		printSquareStar(20);
	}
}
            