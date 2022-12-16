package interviewQ;

import java.util.*;

public class RemoveAhmed26 {



    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        ArrayList<String> word = new ArrayList<>(Arrays.asList("Ahmed"));
        //removeName(words,word);
      //  removeName(words,"Ahmed");

       removeDuplicates(words);




    }
    /*
    * 26. ArrayList -- Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
* @returns: blablabla
* */
    public static ArrayList<String> removeName(ArrayList<String> names, ArrayList<String> name) {

        names.removeAll(name);

        System.out.println(names);
        return names;
    }
    public static ArrayList<String>  removeName(ArrayList<String> names,String name){
        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).equals(name)) {
                names.remove(names.get(i));
                i--;
            }

        }
        System.out.println(names);
        return names;
    }


    /*Remove dublicated "Ahmed"
    *
    *
    * */

    public static LinkedHashSet<String>  removeDuplicates(ArrayList<String> names){
        LinkedHashSet<String> newNames=new LinkedHashSet<>();

        for (String name : names) {
            newNames.add(name);
        }



        System.out.println(newNames);
        return newNames;
    }


}
