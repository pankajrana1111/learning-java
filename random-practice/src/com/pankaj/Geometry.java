import java.util.Scanner;
public class Geometry {
static Scanner scan=new Scanner(System.in);
public static void main(String... args){
    while(true){
        System.out.println("Choose the figure below to draw");
        System.out.println(" *       ****         *"        +       
                      "\n"+"* *      ****       *   *"      +
                      "\n"+" *       ****         *"        +
                      "\n"+"'A'       'B'        'C'         'D' For Exit");
        char option=scan.next().charAt(0);
        if(option=='D'){
            break;
        }
                
        switch (option){
            case 'A': diamond(); break;
            case 'B': square();break;
            case 'C': circle();break;
            default : System.out.println("Please enter the correct input");break;
        }            
    }
}
    static void diamond(){
        System.out.println("Enter the no. of rows");
        int rows=scan.nextInt();
        if(rows%2!=0){
            int middlePoint=(rows/2)+1;
            int a=middlePoint;
            int b=middlePoint;
            for (int i=1;i<=rows;i++){
                for(int j=1;j<=rows;j++){
                    if(j==a||j==b){
                        System.out.print("*");
                    }else System.out.print(" ");
                }
                System.out.print("\n");
                if(i<middlePoint){
                    a-=1;
                    b+=1;
                }else{
                    a+=1;
                    b-=1;
                }
                
             }
        }else {System.out.println("In case of Diamond the # of rows can only be odd");return;}
    }
    static void square(){
        System.out.println("Enter the no. of rows");
        int rows=scan.nextInt();
        for (int i=1;i<=rows;i++){
            for (int j=1;j<=rows;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    static void circle() {
        System.out.println("Enter the value of X coordinate:-");
        int posX=scan.nextInt();
        System.out.println("Enter the value of Y coordinates:-");
        int posY=scan.nextInt();
        System.out.println("Enter the value of radius:-");
        int radius=scan.nextInt();
    for (int i = 0;i <= posX + radius; i++) {
       for (int j = 1;j <=posY + radius; j++) {
            int xSquared = (i - posX)*(i - posX);
            int ySquared = (j - posY)*(j - posY);
            if (Math.abs(xSquared + ySquared - radius * radius) < radius) {
                System.out.print("#");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
    
}    

