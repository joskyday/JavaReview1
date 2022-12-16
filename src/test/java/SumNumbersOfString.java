public class SumNumbersOfString {

    public static void main(String[] args) {
        System.out.println(sumString("f2457g67"));
    }

    public static int sumString(String str) {
        int sum=0;
        if (str.equals(null)) {
            return 0;

        } if (str.length()==1 && Character.isDigit(str.charAt(0))){
            return Integer.parseInt(str);
        }
        else{
            if (!Character.isDigit(str.charAt(0))){
                str=str.substring(1);
            }

            sum+= sumString(str.substring(0,1)) + sumString(str.substring(1));
        }
        return sum;
    }



}
