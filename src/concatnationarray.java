import java.util.Arrays;

public class concatnationarray {
    public static void main(String[] args) {

       int [] nums={1,2,3};
       int [] ans=new int [nums.length*2];
        int []a=(getConcatenation((ans)));
       // System.out.println(a);
        System.out.println(Arrays.toString(nums));
        System.out.println( getConcatenation(ans));

       // System.out.println(nums);

    }

static  int[] getConcatenation(int[] nums) {
    //int [] ans=new int [nums.length*2];

    int[] ans = new int[nums.length * 2];
    System.arraycopy(nums,0,ans,0,nums.length);
    System.arraycopy(nums,0,ans,nums.length,nums.length);

    return ans;
    }

}
