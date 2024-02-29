package exceptions;

public class AnotherExampleForUncheckedException {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
//throws not working in runtime exceptions
        int[] arr={1,2,3};

        System.out.println(arr[3]);

        System.out.println("rest of the code...");

    }
}
