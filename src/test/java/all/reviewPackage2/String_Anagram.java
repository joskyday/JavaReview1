package all.reviewPackage2;

import java.util.Arrays;
import java.util.TreeSet;

public class String_Anagram {

    /*
    Write a  function that check if a string is build out of the same letters as another string.
            Ex: same("abc", "cab"); -> true , Solution 1:
                same("abc", "abb"); -> false:

                listen   silent

     */


    public static void main(String[] args) {
        char[] arr={'L','e','t','t','e','r','1','$'};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // solution 1:
    public boolean same(String a, String b) {

        char[] ch1 = a.toCharArray(); // "Letter"  -->    ch1=

        char[] ch2 = b.toCharArray();




        Arrays.sort(ch1); //{'L','e','e','r','t','     listen--
                                                       //silent
        
        Arrays.sort(ch2);


        //Arrays.equals(ch1,ch2); it works
        String a1 = "", a2 = "";

        for (char each : ch1) {
            a1 += each;
        }

        for (char each : ch2) {
            a2 += each;
        }

        return a1.equals(a2);
    }







    // solution 2
    public boolean Same(String a, String b) {
        a = new TreeSet<String>(Arrays.asList(a.split(""))).toString();
        b = new TreeSet<String>(Arrays.asList(b.split(""))).toString();
        return a.equals(b);
    }


}
