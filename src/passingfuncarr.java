import java.util.Arrays;

public class passingfuncarr {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        change(nums);
        
        System.out.println(Arrays.toString(nums));
        int a=10;
        int b=20;
        System.out.println("value of a"+a+"Value of b"+b);
        changevalue(10,20);
        System.out.println("value of a"+a+"Value of b"+b);


    }

    static void change(int[] arr){
        arr[0]=90;
    }
    static void changevalue(int d, int g){
         d=90;
        g=100;
    }
}
