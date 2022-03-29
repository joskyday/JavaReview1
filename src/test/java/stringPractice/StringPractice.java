package stringPractice;

import java.util.Arrays;

public class StringPractice {

    public static void main(String[] args) {
        String name1 = "Java";
         int i=0;
        for ( i = 0; i < 10; i++) {
            name1="hey";

        }


        if(true){

            int num3=4;

        }
        //int num3=5;






        String s = name1.replaceAll("[A-Z]", "");
        //System.out.println(s);
        String name2 = "Java";
        String name3 = new String("JAVA");
        String name4 = new String("Java");
        if (name1.equalsIgnoreCase(name3)) {
            System.out.println(true);
        }
        ///name1.substring()

/*        double num1=(double) 9/2;
        int num2=9/2;
        int num3=9%2;
        System.out.println(num1);
        double result=num1+num2+num3;
        System.out.println(result);*/

//        int[] num1=new int[3]; //0 0 0
  //      int[] num2={1,2,3,4,5};

int data [] = {2010,2013,2014,2015,2014};
int key=2014;
int count=0;
        for (int e:
             data) {
            if(e!=key){

                continue;

            }
        }
        System.out.println(count + "found");
        count++;



        /*for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);

        }*/
        //num1[3]=666;
        //System.out.println(num2[3]);
       // 1 2 3 4 5
      //  num1=num2;  //1 2 3 4 5  object is same
       // num1[2]=777;   // 1 2 777
        //System.out.println(num2[2]);  // 3
        //System.out.println(num1[2]);   // 777




    }
}
