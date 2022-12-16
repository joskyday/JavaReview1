package allArchive;

public class IntegerTry {

    public static void main(String[] args) {

        System.out.println("intSum(3,4) = " + intSum(3, 4));
        System.out.println("intSum(5,intSum(3,4)) = " + intSum(5, intSum(3, 4)));


    }


    public static int intSum(int integer1, int integer2){
        int sum=integer1+integer2;



   return sum;

    }


}
