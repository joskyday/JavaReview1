package B32;

import java.util.Arrays;

public class ArrayPracticeClass {
    public static void main(String[] args) {
        int [] arrays;  //declaration
        //instantiation _--to mention length of the array
        arrays=new int[6];
        // arrays  -- {0,0,0,0,0,0}

        arrays[0]=5;
        arrays[3]=6;
        int[] arraysOther=new int[]{1,3,56,34,3};

        System.out.println(arraysOther.length); //5
        String str="Java";
        System.out.println(str.length());

        System.out.println("arraysOther = " + arraysOther);
        System.out.println("Arrays.toString(arraysOther) = " + Arrays.toString(arraysOther));
        int sumofOdds=0;
        for (int number:arraysOther) {
            if(number%2==1){
                sumofOdds=sumofOdds+number;
            }
        }
        System.out.println("sum = " + sumofOdds);
       //arr

        String strx = "today is friday";
        String [] strings=strx.split(" ");
        System.out.println(strings[0]);
        System.out.println("strings[2] = " + strings[2]);
    
        sum(1,2,3,4,5,6);

        sum(1,2,3);



    }

    public static void sum(int ... arr){
        int sum=0;
        for (int num:
             arr) {
            sum+=num;

        }
        System.out.println("sum = " + sum);
    }
}
