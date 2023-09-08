package codeInGame;

public class TestWords {
    /*You have to decode a word to find the flag.
The code works like this:
The first character is shifted by 1 in the alphabet, the second by 2 and so on.

The alphabet is: [a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z]

For example the flag: "easy" is coded like this:
"e" becomes "f".
"a" becomes "c
"s" becomes "v
"y" becomes "c
//a 97 z 122
The word you would be given is "fcvc".*/
    public static void main(String[] args) {

        String s="Javaz";
        s=s.toLowerCase();
        char[] sArr=s.toCharArray();
        String newS="";
        for (int i = 0; i < sArr.length; i++) {
            int check=sArr[i]+i+1;
            if(check<=122){
                newS+=(char)check;
            }else{
                check=(sArr[i]+i+1)%122+96;
                newS+=(char)check;
            }
            System.out.println("newS = " + newS);

        }
    }
}
