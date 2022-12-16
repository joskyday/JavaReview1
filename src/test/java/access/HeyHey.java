package access;

import java.util.ArrayList;
import java.util.Arrays;

public class HeyHey {
    protected int num;

    public void cube(){

        System.out.println(num*num*num);
    }
    public static void tryMe(){
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



}
