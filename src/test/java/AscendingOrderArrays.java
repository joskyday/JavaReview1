import java.util.Arrays;

public class AscendingOrderArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(ascendingOrder(new int[] {4,6,5,9,3,1})));




    }
    public static int[] ascendingOrder(int[] arr){
        int[] narr=new int[arr.length];

        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(min>arr[j]){
                    min=arr[j];
                    arr[j]=Integer.MAX_VALUE;

                }
                narr[i]=min;


            }
        }


        return narr;
    }
}
