package codeInGame;

public class BirthdayDate {
    /*
    Birthday is given in a different format with letters
    A-J refers to 0-9
     for example
     AF-AG-BJHI  will be converted and printed as 05-06-1978
    * */
    public static void main(String[] args) {
        String date="AF-AG-BJHI";
        String newDate="";  // 05-06-1978   AF-AG-BJHI     abcdefghıj
        String alphabet="ABCDEFGHIJ";
        for (int i = 0; i < date.length(); i++) {

            for (int j = 0; j < alphabet.length(); j++) {
             if(date.charAt(i)==alphabet.charAt(j)){
                 newDate+=j;
             }
            }
            if((date.charAt(i)+"").equals("-")){
                newDate+="-";

            }
        }
        System.out.println(newDate);
    }
}
