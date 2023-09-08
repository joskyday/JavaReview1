package JTA_Lab.methods1;

public class deneme {
    public static void main(String[] args) {
/*
diamondCollect();  // method call

diamondCollect();

diamondCollect();*/

diamondCollect(8);

        diamondCollect(10);

        int diamonds=16;

        diamondCollect(diamonds);







    }

    //  Diamond--  it is a class name
    //  diamond  --  it is a variable

    // diamond() -- it is method



    public static void diamondCollect(){
        System.out.println("I have 5 diamonds");
        System.out.println("I will get another 5 diamonds");
        System.out.println("I will pick them up");
    }

    public static void diamondCollect(int numberOfDiamonds){
        System.out.println("I have 5 diamonds");
        System.out.println("I will get another 5 diamonds");
        System.out.println("I will pick them up");
       System.out.println("I will collect"+numberOfDiamonds+" more diamonds");
    }

    //  f(x,y)= x^2+y^2


}
