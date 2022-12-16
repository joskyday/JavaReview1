package allArchive;

public class dog extends animal{
    public static void main(String[] args) {

        //System.out.println(Math.pow(2, 3));
        //int number=multiplication(3,5);

        //allArchive.Child.sum(3,4,5);

       // Child.sum(3,4,5);
        System.out.println(multiplication(2, 3, 4, 5));


    }

    public static int  multiplication(int...numbers){ //var args
       int result=1;
        for (int number:
             numbers) {
            result=result*number;

        }
        return result;
    }





}


