public class RSA {
    public static void main(String[] args) {
        int []arr={4,5,6,7,2,7,9,0,1,2};
       // System.out.println(findpivot(arr));
        System.out.println(search(arr,7));
    }
    static int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;

int pivot=findpivot(nums);
// if pivot is not found use normal binary search
        if (pivot==-1){
            return binarysearch(nums,target,start,end);
        }
        //case1
        if(pivot==target){
            return pivot;
        }
        //case2
        if(target>nums[0]){
            return  binarysearch(nums,target,0,pivot-1);
           // start=pivot-1;
        }
       else{
            return  binarysearch(nums,target,pivot+1,nums.length-1);

          //  start=pivot+1;
        }

   }

    static int binarysearch(int[] arr, int target, int start, int end){
//int mid=Integer.MAX_VALUE;

        while(start<=end){
            int  mid = start + (end-start)/2;
            if(target<arr[mid]){
                end=mid-1;

            }
            else if (target>arr[mid]) {
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }


    static int findpivot(int []arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            // case1
            if(mid < end && arr[mid]>arr[mid+1]){
                return  mid;
            }
            //case2
            if(mid >start && arr[mid]<arr[mid-1]){
                return  mid-1;
            }
            //case3
            if( arr[start]>arr[mid]){
                end=mid-=1;
            }
            else {
                start=mid+1;
            }
        }
        return  -1;
    }
}
