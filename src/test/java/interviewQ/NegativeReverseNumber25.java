package interviewQ;

public class NegativeReverseNumber25 {
    /*Write a return method that can reverse negative number and return it as int*/
    public static void main(String[] args) {
        //System.out.println(reverseNum(-432));
        reverseNum2(-12345);
        reverseNum2(12345); // expected=12345

    }

    public static int reverseNum(int num) {  //-432
        String str = new StringBuilder("" + num).reverse().toString(); // 234-
        if (num < 0) {
            str = str.substring(0, str.length() - 1);
        }
        return Integer.valueOf(str);
    }

    //  check if num<0   *-1   return
    //  else  return
// the solution is to turn the number to positive not reversing ACTUALLY
    public static int reverseNum1(int num) {
        if (num < 0) {
            num = num * -1;
            return num;
        }

        return num;
    }

    //  12,12
    //   0,0
    //  -12,-12
    public static boolean testReverseNum(int num, int expected) {
        if (reverseNum1(num) == expected) return true;
        else return false;
    }

    public static int reverseNum2(int number) { //-432
        int reversedNum = 0;
        if (number < 0) {
            number = number * -1;
            while (number != 0) {
                int remainder = number % 10;  //result will take 1 digit starting from 1s through 10s
                reversedNum = reversedNum * 10 + remainder;
                number = number / 10;

            }
            System.out.println(reversedNum);
            return reversedNum;
       }

        else{
            System.out.println(number);
            return number;
        }

    }


}
