package access;

import java.util.ArrayList;
import java.util.Arrays;

public class HeyHey {

    public void cube(){

        System.out.println(num*num*num);
    }
    public String word;
    protected int num;

    int num2;

    private int num3;



    public static float numf=1.0f;


    final  public  static void tryMe(){
        System.out.println("I will help you");
    }







    public static void main(String[] args) {
     ArrayList<Integer> list=new ArrayList<>();

            list.addAll(Arrays.asList(1,2,3,4,5,6,7));
            for (Integer each:list)
            {
               if(each%2!=0){
                   continue;
               }
                System.out.println(each);
               break;
            }
    }

    public HeyHey(String word, int num) {
        this.word = word;
        this.num = num;
    }

    public HeyHey() {
    }

    public  static final void  example(){
        System.out.println("I am from parent");
    }
}
