package allArchive;

import java.util.Scanner;

public class Revieww {
    public static void main(String[] args) {
        //System.out.println("another");
        //int num; //declaration
        //num=5; //initializattion
        //int num= ((int) 80/100.0);
        //int num=  80/100;

        // double num2=(double) 80/100;


        // System.out.println(num);
/*        String str = "accabbcde";
        Map<Character, Integer> unique = new HashMap<>();

        for( int j = 0; j < str.length(); j++) {
            int count =0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == str.charAt(j))
                    count++;
            }
            if( count == 1){
                unique.put(str.charAt(j), count);
            }
        }

        System.out.println(unique);*/

        Scanner input=new Scanner(System.in);
        System.out.println("Enter grade");
        int score=input.nextInt();
        input.nextLine();
        System.out.println("enter second sentence");
        int secondSentence=input.nextInt();
        System.out.println("enter grade = "+ score);
        System.out.println("Second = " + secondSentence);
    }

}

