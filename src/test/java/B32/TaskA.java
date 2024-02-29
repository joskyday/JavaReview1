package B32;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
       /* Write a Java program that calculates the sum of even and odd numbers separately within a given range (inclusive).
 Use a loop to iterate through the numbers in the range.
 If the number is even, add it to the even sum; if it's odd, add it to the odd sum.
 The range is 1-10 and 16-?(read the next criteria) (hint: you may need to use continue statement here)
 Use the break statement to exit the loop when the sum of even numbers reaches a certain value (e.g., 20).*/

        int lastSumofEven=106;
        int odds=0,evens=0;

        for(int i=1;;i++){
            if(i>10&&i<16){
                continue;
            }
            if(i%2==0){
                evens+=i;
            }else{
                odds+=i;
            }
            if(evens==lastSumofEven){
                break;
            }
        }
        System.out.println("odds = " + odds);
        System.out.println("evens = " + evens);
    }
}
