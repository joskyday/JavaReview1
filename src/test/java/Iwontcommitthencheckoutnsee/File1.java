package Iwontcommitthencheckoutnsee;

import java.util.Collections;
import java.util.Scanner;

public class File1 {


        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            String depart = in.nextLine();
            String[] departs=depart.split(":");


            String arrive = in.nextLine();
            String[] arrives=arrive.split(":");

            int minutes=Integer.parseInt(departs[1])+Integer.parseInt(arrives[1])+(Integer.parseInt(departs[0])+Integer.parseInt(arrives[0]))*60;



            // Write an answer using System.out.println()
            // To debug: System.err.println("Debug messages...");

            System.out.println(minutes);
        }

}
