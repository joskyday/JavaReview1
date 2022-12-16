package allArchive;

import java.util.Collections;
import java.util.Vector;

public class VectorProject {
    public static void main(String[] args) {
    Vector<String> str=new Vector<String>();
    str.add("Ali");
    str.add("Aliabc");
    str.add("Aliabcde");
    str.add("Alim");
        System.out.println(longestPrefix(str));

    }
    public static String longestPrefix(Vector<String> strs) {
        int length = 0;
        Collections.sort(strs);
        System.out.println(strs);
        String first=strs.get(0);
        String last= strs.get(strs.size()-1);
        int c=0;
        while(c < first.length())
        {
            if (first.charAt(c) == last.charAt(c))
                c++;
            else
                break;
        }
        return first.substring(0,c);

    }
}
