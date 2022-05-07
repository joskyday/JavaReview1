package all.reviewPackage2;

public class deneme1palindrome {
    public static void main(String[] args) {


        String[] words = {"java", "longer word", "civic", "racecar", "donald", "level", "anna"};
        String longestPalindrome = "";

        for (String each : words) {

            boolean isPalindrome = true;

            for (int i = 0; i < each.length() / 2; i++) {
                char c1 = each.charAt(i);
                char c2 = each.charAt(each.length() - 1 - i);

                if (each.charAt(i) != each.charAt(each.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

         /*   String reverse = "";
            for (int i = each.length()-1; i >= 0 ; i--) {

                reverse += each.charAt(i);
            }

            isPalindrome= reverse.equalsIgnoreCase(each);

          */

            if (isPalindrome && each.length() > longestPalindrome.length()) {
                longestPalindrome = each;

            }

        }
        System.out.println("longestPalindrome = " + longestPalindrome);

    }
}



