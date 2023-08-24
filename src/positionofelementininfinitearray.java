public class positionofelementininfinitearray {
    // amazon question from Geeks for geeks
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
       int target=77;
        int ans=binarysearch(arr,target);
        System.out.println(ans);
    }
static int answer(int []arr, int target){
        // find the start and end the first junk(firt two elements)
    int start=0;
    int end=1;
    //iterate over the whole array, and double the number of junks each time
    //when ever target is greater that the mid
    //Here we are just comparing end with the target bcz start is always less than end
    while(target>arr[end]){
        int temp=end+1;
        //here end =end+size of the previous array
        int newend=end+(end-start+1);
        start=temp;
        newend=end;

    }
    // until and unless the target is greater than the end the loop will go
    //when the target is not greater than the end it will go to the binary search
    return  binarysearch(arr,target);
}


    static int binarysearch(int[] arr, int target){
//int mid=Integer.MAX_VALUE;
        int start=0;
        int end=arr.length-1;
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
}
