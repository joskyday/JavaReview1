package day02_variables_concatenation_operators;

public class Operators {
    public static void main(String[] args) {
        System.out.println(4+5);
        System.out.println(4*5);
        System.out.println(10.0/3);  //result data type depends on the data type you are using
        System.out.println(10.0F/3);


        //Unary Operators
        int num=0;
        //System.out.println("num is "+ ++num);
        //System.out.println("num is "+ --num);
        System.out.println("num is "+ num++); //print 0
        //num is 1 before next ops
        System.out.println("num is "+ num++); // print 1
         //num is 2 before next ops

        //num++;   num=num+1;


        System.out.println("num = " + num);
        int num2=123;
        num = num2;

        num=5*num;  //5*123     num*=5;



    }
}
