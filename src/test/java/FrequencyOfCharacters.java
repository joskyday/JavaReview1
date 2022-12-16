public class FrequencyOfCharacters {
    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD"));
    }

    /*
    * Q1:Write a return method that can find the frequency of characters

Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

    *
    * */

public static String frequencyOfChars(String entry){
    // find unique character

    // count each character



    //looking into loop
    //if

    String uniqueLetters="";

    for(int i=0;i<entry.length();i++){
           int count=0;
        for(int j=0;j<entry.length();j++){
              if(entry.charAt(i)==entry.charAt(j)) count++;
        }
        if(!uniqueLetters.contains(entry.charAt(i)+"")){
            uniqueLetters+=entry.charAt(i)+""+count;
        }


    }
    return uniqueLetters;

}


}
