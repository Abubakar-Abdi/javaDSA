public class binaray {
    public static void main(String[] args) {
        int [] arr={12,17,18,21,23,32,35};
     int target=17;
        int ans =binarysearch(arr, target);
        System.out.println(ans);

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
