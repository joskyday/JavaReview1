package all.loopPackage;


import java.util.Arrays;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
          /* enter the name of students in the class and save the information
          into an array
           */
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number of students:");
        int numberOfStudents = scan.nextInt();
        scan.nextLine();
        String[] nameOfStudents = new String[numberOfStudents];
        //System.out.println(numberOfStudents==nameOfStudents.length);
        int i = 0;
        //for(int i=0;i<=numberOfStudents-1;i++){  //numberOfStudents-1


        do {
            System.out.println("Enter the full name of student please:");
            nameOfStudents[i] = scan.nextLine();
            i++;
        } while (i <= numberOfStudents - 1);

        for(String nameOfStudent:nameOfStudents){
            System.out.println(nameOfStudent);

        }


        System.out.println(Arrays.toString(nameOfStudents));


    }


}

