import java.util.Arrays;

public class runnunsum {
    public static void main(String[] args) {
        int []nums={1,2,3};
        System.out.println(Arrays.toString(nums));
        int [] ans=runningSum(nums);
        System.out.println(Arrays.toString(ans));
    }


  static  int[] runningSum(int[] nums) {
        //nums=int new[]{1,2,3,4};
        for(int i=1; i < nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;
    }

}

