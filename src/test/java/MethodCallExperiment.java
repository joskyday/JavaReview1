
import access.HeyHey;

import java.util.ArrayList;
import  java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MethodCallExperiment {
    public static void main(String[] args) {

        int[] arr={1,2,3};

    ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add((arr[i]));
        }
        System.out.println("list = " + list);
        int[] array = {1, 2, 3, 4, 5};
        List<Integer> listt = IntStream.of(array).boxed().collect(Collectors.toCollection(ArrayList::new));
        System.out.println("listt = " + listt);


    }
    public static void sayHello(){
        System.out.println("Hello");

    }

public static int areaOfSquare(int dimention){

        return dimention*dimention;
}


    public static double sum(int num1,double num2){

         return num1+num2;
    }
    static double sum(double num1,int num2){

        return num1+num2;
    }

    static int sum(int num1,int num2,int num3){

        return num1+num2+num3;
    }
    static int sum(int num1,int num2){

        return num1+num2;
    }




    static void div(int num1,int num2){

        System.out.println(num1/num2);
    }



}
