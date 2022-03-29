public class ArrayPractice {
    public static void main(String[] args) {


        int[] arr= {1,2,9,3,4};
        System.out.println(arrayFront9(arr));


    }
/*
*
*
Given an array of ints, return the number of times that two 6's are next to each other in the array.
Also count instances where the second "6" is actually a 7.  6,6     6,7


array667([6, 6, 2]) → 1
array667([6, 6, 2, 6]) → 1
array667([6, 7, 2, 6]) → 1
*
*
*
*
* */

    public static int array667(int[] nums) {
     /*   6,6,5,6,6,8,6
        0,1,2,3,4,5,6  nums.length-2  */
        int counter=0;
        for(int i=0;i<=nums.length-2;i++){  //length=7 7-2=5 i=0,1,2,3,4,5
           if(nums[i]==6){   // 2nd iter--- nums[1]  --3rd nums[2]  -- xth nums[5]
               if(nums[i+1]==6||nums[i+1]==7){   //2nd iter --- nums[2]  --3rd nums [3]--xth nums[6]
                   counter++; //2
               }
           }
        }

       return counter;
    }

    public static boolean arrayFront9(int[] nums) {

        //check length if its less than 4 check all of them
        if(nums.length<4){ //0,1,2,3

            //if length=3
            for(int i=0;i<=nums.length-1;i++){  //i<=3  i=0,1,2,3
                if(nums[i]==9) return true;
                else return false;

            }

            //else check first 4 element
        }else {
            for(int i=0;i<=3;i++){
                if(nums[i]==9) return true;

            }
        }
        return false;
    }



}
