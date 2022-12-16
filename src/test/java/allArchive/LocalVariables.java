package allArchive;

public class LocalVariables {


    public static void main(String[] args) {
         int num1=5;
         int num2=num1++;
        System.out.println(num1+" "+num2);




    }

    public static boolean isArm(int n) {
        int temp;
        int r = 0;
        int sum = 0;
temp=n;
while(n>0){
    r=n%10;
    n=n/10;
    sum+=r*r*r;

}
if(temp==sum)
    return true;
return false;
    }


}