package all;

import java.util.Scanner;

public abstract class patientPortal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        String welcome = input.nextLine();
        System.out.println("Please enter your personal information");
        String info = input.nextLine();

        System.out.println("Enter your first name");
        String firstName = input.nextLine();
        System.out.println("Enter your last name");
        String lastname = input.nextLine();
        System.out.println("Enter your email address");
        String emailAddress = input.nextLine();

        System.out.println("Enter your street address");
        String streetAddress = input.nextLine();
        System.out.println("Enter your city");
        String city = input.nextLine();
        System.out.println("Enter your state");
        String state = input.nextLine();
        System.out.println("Enter your zipcode");
        int zipCode = input.nextInt();
        input.nextLine();

        System.out.println("Enter your phone number");
        long phoneNumber = input.nextLong();

        input.nextLine();
        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = input.nextLong();

        input.nextLine();

        System.out.println("Enter your age");
        int age = input.nextInt();

        input.nextLine();
        System.out.println("Enter your height");
        double height = input.nextDouble();

        input.nextLine();
        System.out.println("Enter your weight");
        double weight = input.nextDouble();
        input.nextLine();
        System.out.println("Are you married");
        boolean married = input.hasNextBoolean();

        input.close();
        System.out.println("welcome = " + welcome);
        System.out.println("info = " + info);
        System.out.println("fullName" + ":" + firstName + ", " + lastname);
        System.out.println("emailAddress = " + emailAddress);
        System.out.println("Address" + ":" + " " + streetAddress + "," + city + "," + " " + state + "," + " " + zipCode);
        System.out.println("Contacts" + ":" + " " + "work phone number " + "-" + phoneNumber + "," + " " + "personalPhoneNumber" + "-" + personalPhoneNumber);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("married = " + married);
    }
    public abstract void methodName();

}