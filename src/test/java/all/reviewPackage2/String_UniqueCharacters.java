package all.reviewPackage2;

public class String_UniqueCharacters {

    /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";


     */


    public static void main(String[] args) {
        String str="AAABBBCCCDEF";
        spitUniqueLetters(str);

    }

public static void spitUniqueLetters(String str){
    String unique="";

    for (int i = 0; i < str.length(); i++) {
        int num=0;
        for (int j = 0; j < str.length(); j++) {
            if(str.charAt(i)==str.charAt(j)) num++;

        }
        if(num==1){
            unique = unique+str.charAt(i);

        }

    }

    System.out.println(unique);
}




















    public String unique(String str) {
        String[] arr = str.split("");
        String unique1 = "";

        for (int j = 0; j < arr.length; j++) {
            int num = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(arr[j])) {
                    num++;
                }
            }
            if (num == 1) {
                unique1 += arr[j];
            }
        }

        return unique1;
    }


}
