package GROUPPLUGIN;

import java.util.ArrayList;
import java.util.Arrays;

public class TryArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>(7);

        System.out.println(nums.size());
        //Arrays   Arrays.toString(nums);

        //nums.add(45);
        //the capacity of the arraylist is 10

        // add an element in anywhere of the arraylist
        // like index 5
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(8);
        nums.add(10);
        nums.add(12);
        nums.add(14);
//inserts 45 to index 5
        // index 5 there was 12 and it moved to index 6 and 45 added to index 5
        nums.add(5,45);
        System.out.println("nums.size() = " + nums.size());
        System.out.println("nums = " + nums);

        nums.set(3,80);
        System.out.println("nums = " + nums);

        nums.remove(new Integer(4));

        System.out.println("nums = " + nums);

        nums.remove(4);

        System.out.println("nums = " + nums);


        int[] numbers={3,5,7,9,11};
        //Arrays.asList(numbers);

        ArrayList<Integer> numbersOfTheList=new ArrayList<Integer>(Arrays.asList(3,5,7,9,11,9,11));
        //numbersOfTheList.addAll(Arrays.asList(numbers));
//numbersOfTheList
        ArrayList<Integer> numbersOfTheList2=new ArrayList<Integer>(Arrays.asList(9,11,13));

        numbersOfTheList.removeAll(numbersOfTheList2);
        System.out.println(numbersOfTheList);
        /*for(int number : numbersOfTheList){
            System.out.print(number+" \t");
        }*/

        System.out.println("*********************");

        ArrayList<String> strArr=new ArrayList<>(Arrays.asList("Heidi","Max","Yanji","joseph","Oleg","Heidi","Max","Yanji","joseph","Oleg"));
        //strArr.remove("joseph");
        //System.out.println(strArr);
        ArrayList<String> strArr1=new ArrayList<>(Arrays.asList("joseph"));
        strArr.removeAll(strArr1);
        System.out.println(strArr);
        strArr.removeIf(element -> element.equals("Heidi") );
        System.out.println(strArr);
    }
}
