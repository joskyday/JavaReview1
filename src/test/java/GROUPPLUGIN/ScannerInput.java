package GROUPPLUGIN;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //System.out.println("Enter your name");
        String name= input.next();
        //System.out.println("Enter your pass");
        String pass= input.next();
        if(name.equals("Batu")&&pass.equals("Batu123")){
            System.out.println("good");
        }else{
            System.out.println("baad");
        }

    }
}
