package JTA_Lab;

import java.util.Scanner;

public class ScannerRectangleCalculations {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter length of the rectangle");
        int length=in.nextInt();
        System.out.println("enter width of the rectangle");
        int width=in.nextInt();

        System.out.println("if you want to calculate perimeter type 0 if you want to calculate area of the rectangle type 1");
        int choice=in.nextInt();
        if(choice==0){
            System.out.println("perimeter of the rectangle is "+ 2*(width+length));
        }else if(choice==1){
            System.out.println("area of the rectangle is "+ width*length);
        }else{
            System.out.println("wrong input, please enter either 0 or 1");
        }
    }
}
