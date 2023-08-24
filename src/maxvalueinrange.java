import java.util.Arrays;

public class maxvalueinrange {
    public static void main(String[] args) {

        int [] arr ={100,2,17,0};
        System.out.println( maxrange(arr, 0,3));
        System.out.print("reversed array =");

        reverse(arr,0,3);


    }
    static void reverse(int [] arr, int start, int end) {
        start=0;
        end=arr.length-1;
        int i=end;
        while (i>=start) {
            System.out.println(arr[i]);
            i--;
        }
    }


    static int maxrange(int []arr, int start, int end ){
        int maxvalue=arr[start];
        for (int i=start;i<arr.length && i<=end;i++){
            if (arr[i]>maxvalue){
                maxvalue=arr[i];

            }
        }
        return maxvalue;
    }
static void swap(int []arr, int a, int b ){
        int temp=a;
        a=b;
        b=temp;
}
}
