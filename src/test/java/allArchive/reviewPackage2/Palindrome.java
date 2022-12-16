package allArchive.reviewPackage2;

public class Palindrome {

    public static void palindromeCheck(String str){
        char[] arr=str.toCharArray();
        String reversedStr=""; //lettel
        for (int i = arr.length-1; i >= 0; i--) {
            reversedStr=reversedStr+arr[i];  //#1 =l  #2 =le  #3 =let  #4 =lett # 5= lette  #6 = lettel
        }
        if(str.equals(reversedStr)) System.out.println("it is palindrome");


    }

}
