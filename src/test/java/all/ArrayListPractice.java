package all;

import java.util.*;


public class ArrayListPractice {
    public static void main(String[] args){

       // int [][] code={ [2],{3,4,5}};

        /*String str="jkljkljkl";
        int indexOfsecondElement=str.indexOf('j', str.indexOf('j') + 1);

        System.out.println(str.indexOf('j', indexOfsecondElement + 1));


        int[][] code1=new int[2][3];
        String testme="hey";   */
        String[] liste={"Ayse","Hasan","Ali","Veli","Heyyyyy"};
        List<String> list= Arrays.asList(liste);
        letterCount(list);



    }


    public static synchronized int numsum(double num1,int num2){

        return 0;
    }
    public static void letterCount(List<String> nameList){
        List<Integer> namesLength=new ArrayList<>();
        Map<String,Integer> namesAndNumbers=new Hashtable<>();
        Map<String,Integer> namesAndNumbers2=new HashMap<>();
        for (String name:nameList
             ) {
            namesLength.add(name.length());
            namesAndNumbers.put(name,name.length());
            namesAndNumbers2.put(name,name.length());
        }
        System.out.println(namesLength);
        System.out.println(nameList);
        System.out.println(namesAndNumbers);

        System.out.println(namesAndNumbers2);

    }


}
