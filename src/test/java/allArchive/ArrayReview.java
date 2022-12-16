package allArchive;

import java.util.Arrays;

public class ArrayReview {

    public static void main(String[] args) {
        int[] nums;
        int nums1 [];//array declaration


        //we need to mention the length of the array


        //compile time error-- you see error before running the code
        //I cannot run the code without fixing the error
       // System.out.println(nums);


        //class
        /*
        * Mohamed, Jamil, Katya, Fiby,
        * Ikram, Milos, Manuela, Olena
        *
        *
        * */

        //declaration
        //instantiation --- you mention the length of the array
        //initialize

        String [] group25=new String[8];

        group25= new String[]{"Mohamed", "Jamil", "Katya", "Fiby", "Ikram", "Milos", "Manuela", "Olena"};
        String[] gr25_2_Aug=group25;
        System.out.println("gr25_2_Aug= "+Arrays.toString(gr25_2_Aug));
        System.out.println(group25.length);
        group25= new String[]{"Mohamed", "Jamil", "Katya", "Fiby", "Ikram", "Milos", "Manuela", "Olena","Ali"};
        System.out.println("group25= "+Arrays.toString(group25));
        // String ---null

        //int    ---  0
        //double   -   0.0
        //boolean--  false


        //runtime error--you can not see it until you run it
        for (int i = 0; i < group25.length; i++) {
            System.out.println(group25[i]);

        }
        int counter=1;
        for (String each_student:group25
             ) {
            System.out.println(each_student);

        }



    }
}
