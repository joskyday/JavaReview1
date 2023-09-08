package JTA_Lab;

import java.util.Scanner;

public class ScannerAverageAge {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter ages");
        int total=0;
        int count=0;
        int age1=in.nextInt();
        if(age1>0) {
            total+=age1;
            count++;
        }
        int age2=in.nextInt();
        if(age2>0) {
            total+=age2;
            count++;
        }
        int age3=in.nextInt();
        if(age3>0) {
            total+=age3;
            count++;
        }
        int age4=in.nextInt();
        if(age4>0) {
            total+=age4;
            count++;
        }
        int age5=in.nextInt();
        if(age5>0) {
            total+=age5;
            count++;
        }
        int averagesOfAboveZero=total/count;
        System.out.println("averagesOfAboveZero = " + averagesOfAboveZero);
        int average=(age1+age2+age3+age4+age5)/5;
        System.out.println("average = " + average);
        
    }
}
