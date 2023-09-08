package mapQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lists {
    public static void main(String[] args) {

        ArrayList<String> list1=new ArrayList<>(Arrays.asList("asjsjj","ahi","akl","aklll"));
        ArrayList<String> list2=new ArrayList<>(Arrays.asList("ahi","akl"));
        System.out.println(list1.containsAll(list2));


    }
}
