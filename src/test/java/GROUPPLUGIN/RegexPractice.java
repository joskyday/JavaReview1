package GROUPPLUGIN;

public class RegexPractice {
    public static void main(String[] args) {
        String value="st123iohjhkibn345";
        String mx=value.replaceAll("[^a-zA-Z ]", "");
        System.out.println(mx);
    }
}
