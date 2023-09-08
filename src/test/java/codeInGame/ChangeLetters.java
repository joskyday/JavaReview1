package codeInGame;

public class ChangeLetters {
    public static void main(String[] args) {
        /*
        * The program:
Your program must switch the case of each character of the given string.

INPUT:
S a string.

OUTPUT:
S with lowercase letters instead of uppercase letters and vice-versa.

CONSTRAINTS:
S contains at least 1 character.*/
        String S="Example";
        String named=S.toLowerCase();
        String result="";
        for (int i = 0; i < S.length(); i++) {
            if(S.charAt(i)==named.charAt(i)){
                result+=Character.toUpperCase(S.charAt(i));
            }else{
                result+=named.charAt(i);
            }
        }
        System.out.println(result);


    }
}
