package interviewQ;

import java.util.ArrayList;

public class RemoveValues27 {
    public static void main(String[] args) {

        removeGreaterThan100(101,2,5,89,101,1001,1200);
        //int[] nums={1,2,5,101};
        //removeGreaterThan100(nums);

    }
    /*
    * 27. ArrayList -- Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.*/

    public static ArrayList<Integer> removeGreaterThan100 (int... nums){ //var arg
        ArrayList<Integer> newNums=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<=100){
                newNums.add(nums[i]);
            }
        }
        System.out.println(newNums);
        return newNums;
    }


}
