public class floor {
    public static void main(String[] args) {
        int []nums={2,3,5,9,14,16,18};
        int target=40;
        int ans=floorcal(nums,target);
        System.out.println(ans);

    }
    static int floorcal(int []nums, int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[0]){
                return -1;
            }
            if(target>nums.length-1){
                return -2;
            }
            if(target<nums[mid]){
                end=mid-1;
            } else if (target>nums[mid]) {
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        // if i return end it's floor which greatest no  which is equal to or
        // smaller than the target

        return end ;

        // if i return start it's ceiling  which is smallest no  which is equal to or
        // greater than the target
    }
}
