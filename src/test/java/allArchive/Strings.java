package allArchive;

public class Strings {
    public static void main(String[] args) {

        // Blank:  nothing except spaces
        // Empty:  nothing

        /*
        String s="Holiday!";
        String t="   ";   String y="";
        System.out.println("t.isEmpty() = " + t.isEmpty());
        System.out.println("t.isBlank() = " + t.isBlank());
        System.out.println("y.isEmpty() = " + y.isEmpty());
        System.out.println("y.isBlank() = " + y.isBlank()); */
        //difference between blank and empty

        //--------------------
        String s="Holiday!";
        s.trim();
        System.out.println(s);

        String t="Holiday!";

String x=new String("Holiday!");
String y=new String("Holiday!");




int index=y.charAt(y.length());

int xd;
StringBuilder str=new StringBuilder("Java is fun");
String newStr=str.substring(3,5);

        System.out.println("str :  "+newStr);


    }
}
