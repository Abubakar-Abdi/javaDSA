public class duplicateRSA {
    public static void main(String[] args) {


        int []arr={2,2,2,8,2};
         System.out.println(findpivot(arr));
        System.out.println(search(arr,9));
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
            // here we check whether all elements in the start, mid, end are equal
       if(arr[start]==arr[mid]&& arr[mid]==arr[end]){
           // but we need to check whether start is the pivot or end is the pivot
           if(arr[start]>arr[start+1]){
               return start;
           }
           start++;
           if(arr[end]<arr[end-1]){
               return end-1;
           }
           end--;
       }
       else if(arr[start]<arr[mid] || arr[start]==arr[mid]&& arr[mid]>arr[end]){
           start=mid+1;

       }
       else{
           end=mid-1;
       }
        }
        return  -1;
    }
}
