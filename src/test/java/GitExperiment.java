public class GitExperiment {

    public static void main(String[] args) {

        String str = "I love Java. Java is my world!";


//        Count number of letters

        for (int i = 0; i < str.length(); i++) {     //1st i=0
            int count = 0;
            if(str.charAt(i)=='1') continue;
            for (int j = 0; j < str.length(); j++) {  //until inner loop ends outer loop iteration continues.

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }

            }
            System.out.println("number of " + str.charAt(i)+" is "+count);
            str=str.replace(""+str.charAt(i),"1");

        }
    }
}











