public class peakofmountainarray {
    // this solution i used linear search
    public static void main(String[] args) {
        int []arr={9,10,5,78,90,0,1,3,6};
       int peak=0;
      int ans=  mountainarrayy(arr,peak);
        System.out.println(ans);
    }
    static int  mountainarrayy(int []arr, int peak){
         peak=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>peak){
              peak=arr[i];
            }
        }
        return  peak;

    }


}
