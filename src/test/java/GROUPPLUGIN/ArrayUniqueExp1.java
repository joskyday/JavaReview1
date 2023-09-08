package GROUPPLUGIN;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//I created a way to select the unique element in the array
public abstract class ArrayUniqueExp1 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3, 4};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> uniqList=new ArrayList<>();
        for (int num :
                list) {

            if (Collections.frequency(list, num) == 1) {
                uniqList.add(num);
            }
        }
        System.out.println("uniqList = " + uniqList);
    }

    public ArrayUniqueExp1() {
    }

}


