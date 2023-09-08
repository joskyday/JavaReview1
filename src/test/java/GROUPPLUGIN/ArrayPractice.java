package GROUPPLUGIN;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] numbers = {1, 34, 32, 54, 4, 37};

        for (int number : numbers) {
            System.out.print(number + "\t");
        }
        String str1 = "Java";
        String[] str2 = {"J", "a", "v", "a"};
        String str3 = "";

        for (int i = 0; i < str2.length; i++) {
            str3 += str2[i];

        }
        boolean b1 = str1 == str3;
        boolean b2 = str1.equals(str3);
        System.out.println(b1 + " " + b2);

        System.out.println("------------");
        String[] str = {"A", "B"};
        int idx = 0;
        for (String s : str) {
            str[idx].concat("element" + idx);
            idx++;
        }
        for (idx = 0; idx < str.length; idx++) {
            System.out.println(str[idx]);

        }

    }
}
