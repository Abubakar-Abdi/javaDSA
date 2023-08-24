import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int [][] Darray= new int[3][2];

        for (int  row=0;row<Darray.length;row++){
            for(int  col=0;col<Darray[row].length;col++){
                Darray[row][col]=in.nextInt()
;            }
            System.out.println();
        }
        for (int  row=0;row<3;row++){
            for(int  col=0;col<Darray[row].length;col++){
                System.out.print(Darray[row][col]);
                          }
            System.out.println();
        }
        System.out.println(Darray[1][0]);

    }
}
