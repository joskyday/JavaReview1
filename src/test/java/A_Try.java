import java.util.Scanner;

public class A_Try {
    public static void main(String[] args) {
        special();
    }
    public static int special() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number!");
        int num1 = in.nextInt();

        if (num1 % 11 == 0 || num1 % 11==1) {
            System.out.println("This number is special!");

        } else{
            System.out.println("This number is not special!");
        }
        return special();


    }

}

