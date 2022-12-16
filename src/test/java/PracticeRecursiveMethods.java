public class PracticeRecursiveMethods {
    public static void main(String[] args) {
        //sayHi(3);
       // System.out.println(sum(4));

        //System.out.println(methodC());
      //  String str1=" ";
      //  System.out.println(str1.isEmpty());
     //   System.out.println(str1.isBlank());
      //  String str1 = "java"; //3
      //  System.out.println(str1.charAt(3));
        boolean x,z=true;
        int y=20;
        x=(y!=10)||(z=false);
        System.out.println("x = " + x);
        System.out.println("z = " + z);

    }

    public static void sayHi(int count){
if (count>1){
    sayHi(count-1);   //base 1+2+3+4+5  sum(5)
}
        System.out.println("Hi");




    }

    public static String methodA(){
        return "A";
    }
    public static String methodB(){
        return methodA()+"B";
    }

    public static String methodC(){
        return methodB()+"C";
    }

    public static int sum(int number){
        if(number==0) return number;


        return sum(number-1)+number;


                // sum( 3)
                //     3+ sum(2)
                //      2+ sum(1)
               //       1+ sum(0)=0

    }


}
