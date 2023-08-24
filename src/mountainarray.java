public class mountainarray {
    public static void main(String[] args) {
        int []arr={0,1,0};
        int ans=asnwer(arr);
        System.out.println(ans);
    }
    static int asnwer(int []arr){
        int mid=Integer.MAX_VALUE;
       int  start=0;
       int  end=arr.length-1;
        while (start<=end){
             mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return start;
    }
}

