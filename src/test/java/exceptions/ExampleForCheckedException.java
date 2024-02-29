package exceptions;

public class ExampleForCheckedException {
    public static void main(String[] args) throws InterruptedException {

        method();


    }

    public static void method()throws InterruptedException{
        System.out.println("Hello");

       Thread.sleep(5000);


        System.out.println("Hello Team");

    }
}
