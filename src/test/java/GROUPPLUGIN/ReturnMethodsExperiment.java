package GROUPPLUGIN;

public class ReturnMethodsExperiment {

    public static void main(String[] args) {
        sumof2(2,3);//return is 5
        int result=sumof2(2,3);
        System.out.println(result);
    }

    //  if you want to have your method give a result as a datatype

    public static int sumof2(int num1,int num2 ){
        int sum=num1+num2;

        return sum;
    }


    public static int sum(){
        int num1=5;
        int num2=7;
        int result=num1+num2;
        return result;
    }
















}

