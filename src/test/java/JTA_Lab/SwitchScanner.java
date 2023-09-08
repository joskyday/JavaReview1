package JTA_Lab;

import java.util.Scanner;

public class SwitchScanner {
    public static void main(String[] args) {
        String weather = "suNny";

        // We will try to find and exact match for our weather value
        Scanner in=new Scanner(System.in);



        switch (weather) {
            case "sunny":
                // hungerBar++;
                System.out.println("Go to beach");
                break;

            case "rainy":
                System.out.println(" stay at home practice Java");
                break;

            case "windy":
                System.out.println("Go fly Kite");
                break;
            default:
                System.out.println("In either case Practice Java in the evening");


        }

        System.out.println("we are out of Switch statement");







    }
}
