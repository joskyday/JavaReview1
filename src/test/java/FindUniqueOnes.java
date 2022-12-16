public class FindUniqueOnes {
    public static void main(String[] args) {
        String entry = "AAABBCCDEF";

        System.out.println(uniqueOnes(entry));

    }

    public static String uniqueOnes(String entry) {
        int count = 0;
        String unique = "";
        for (int i = 0; i < entry.length(); i++) {
            for (int j = 0; j < entry.length(); j++) {
                char dummy = entry.charAt(i);

                if (entry.charAt(j) == dummy) count++;
            }
            if(count>1) entry=entry.replaceAll(entry.charAt(i)+"","");
            else if (count == 1) unique += entry.charAt(i);
            count=0;
        }
        return unique;
    }

}
