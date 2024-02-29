package B32;


import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {


     //   System.out.println("arrays = " + arrays);
    //    System.out.println(Arrays.toString(arrays));

        //int sumOfOdds=0;
        int[] arrays={1,2,3,4,5,7,9};
        int sumOfOdds=0;
        for (int number: arrays) {

            if(number%2==1){
                sumOfOdds+=number;
            }
        }
        System.out.println("sumOfOdds = " + sumOfOdds);

        sum(1,2,3,4,5);

        sum(1,4,6,8);

        int a[],b;

        int[] numbers=new int[20];
        numbers[20]=20;






    }
    public static void sum(int ... arr){
        int sum=0;
        for (int number:
             arr) {
            sum=sum+number;

        }
        System.out.println("sum = " + sum);

    }

}
