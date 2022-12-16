import org.w3c.dom.NameList;

import java.util.ArrayList;
import java.util.Arrays;


//import java.util.*;
//import java.util.Arrays;

public class ArrayListReview {
    public static void main(String[] args) {
      /*  ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars.remove(2));
        System.out.println(cars.add("Ferrari"));
        */

/*
        ArrayList name = new ArrayList<>(Arrays.asList(1, 1.0, "Java", 1, 9.0,1.0));
        System.out.println(name.isEmpty());
        System.out.println(name);
        //System.out.println(name.get(0));
        //System.out.println(name.remove(1.0));  //return boolean
        //System.out.println(name.remove(3));  //return  deleted object
        //System.out.println(name);
        //name.removeAll(Arrays.asList(1));
        //System.out.println(name);
        name.set(2,"Java Oracle");
        System.out.println(name);
        System.out.println(name.add("Ferrari"));
        name.removeAll(Arrays.asList(1.0));
        System.out.println(name);
*/

         Object[] answers=output();  // Object[]  returning an array of Objects
        //System.out.println(answers[1].toString());
        int[] nums={1,2,3,4,5};
        main(nums);//15
        main(1,2,3,4);//10
        main(1,2);//3

    }
    public static Object[] output(){

        Object[] nameAndAge={"Daisy",6};  //  6 is Integer



        return nameAndAge;
    }

    // var args   ...
public static void main(int... num){
    int sum=0;
        for (int each:num
         ) {
        sum=sum+each;

    }
    System.out.println(sum);
}


}



 /*

        int[] nums={2,3,4,5}; //length is 4


        //System.out.println(nums.length);

        ArrayList<Integer> numsList=new ArrayList<>(Arrays.asList(7,3,4,5));

      //  System.out.println(numsList.remove(1));

        System.out.println(numsList.add(8));

        ArrayList<String>  cars=new ArrayList<>(Arrays.asList("Volvo","BMW","Ford"));
        ArrayList<String>  cars2=new ArrayList<>(Arrays.asList("Volvo","Ford"));

        for (String car:cars2
             ) {
            cars.add(car);
        }

        cars.remove("Volvo");
        System.out.println(cars);


        // System.out.println(numsList.size());
/*
        Collections.sort(numsList);
        System.out.println(numsList);
*/
//  for arrays length >>  indexing starts w 0 upto name.length-1
// for arraylist  length >>  indexing starts w 0 upto name.size()-1

/*
        numsList.add(6);  // we added an element to numsList object  numsList object is changed.

        System.out.println(numsList);

        numsList.add(3,7);  //to insert we used add()
        System.out.println(numsList);
          //set
        numsList.set(3,0);
        System.out.println(numsList);
        //remove
        numsList.remove(3);
        System.out.println(numsList);
        //in order to delete an object with object name, we need to create the object in type of the ArraytList

        Integer three= 3;
        numsList.remove(three);

        System.out.println(numsList);

        ///      declare datatype referencename= new datatype()  Integer  removalNumber = new Integer(3)  //  new Integer(3)


        numsList.remove(Integer.valueOf(6));
        System.out.println(numsList);


        //Arrays can save primitive and non primitive datatype  Arrays can save objects

*/
