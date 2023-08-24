import java.util.Arrays;
import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        // systax of array
        // datatype [] variable name = new datatype[size]
        // datatype [] variablename={1,2....}


        Scanner in = new Scanner(System.in);

        int [] arr=new int[4];

        //System.out.println(arr[4]);
        //printing all using forloop



        for (int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();

        }
        arr[0]=1999; // this shows array is mutable

        // print all using Arrays.tostring
        System.out.println(Arrays.toString(arr));

    }
}
