package GROUPPLUGIN;

public class dddd {
    public static void main(String[] args) {
        String s="JJJJAAAASSSS";
        String result="";
        for(int i=0;i<s.length();i++){
            if(i!=s.length()-1&&(s.charAt(i)!=s.charAt(i+1))){
                result+=s.charAt(i)+" ";
            }else{
                result+=s.charAt(i);
            }

        }
        System.out.println(result);
    }
}
