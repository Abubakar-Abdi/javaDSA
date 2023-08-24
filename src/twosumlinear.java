import java.util.Arrays;

public class twosumlinear {
    public static void main(String[] args) {
        int []arr={1,1,2,3,3,4,4,8,8};
        int target=17;

      int []ans=  twoSum(arr,target);
        //System.out.println(Arrays.toString(ans));
        System.out.println(singleNonDuplicate(arr));

    }

    static int[] twoSum(int[] numbers, int target) {
        //int [] ans={};
        int start=0;
        int end=numbers.length-1;
        // ans[start]=0;
        // ans[end]=numbers.length-1;
        while(start<=end){

            if(numbers[start]+numbers[end]==target){
                return new int[]{start+1,end+1} ;
            }

//            else if(numbers[start]+numbers[end]>target){
//                end=end-1;
//            }
            else{
                start=start+1;
            }
        }
        return new int[]{start+1,end+1};
    }


  static   int singleNonDuplicate(int[] nums) {

        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==nums[mid-1]){
                start=mid-2;
            }
            else if(nums[mid]==nums[mid+1]){
                end=  mid+2;
            }
            else{
                return start;
            }
        }
        return -1;
    }


}
