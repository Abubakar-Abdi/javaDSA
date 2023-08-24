public class orderagnostic {
    public static void main(String[] args) {
        int [] arr={5,4,3,2,1};
        int target=4;
        int ans =binarysearch(arr, target);
        System.out.println(ans);

    }
    static int binarysearch(int[] arr, int target){
//int mid=Integer.MAX_VALUE;

        int start=0;
        int end=arr.length-1;
        boolean isasc;
       // while(start<=end){
        if (arr[start]<arr[end]){
            isasc=true;

        }else {
            isasc=false;
        }
        while(start<=end){
            int  mid = start + (end-start)/2;

            if (isasc){
                if (target==arr[mid]){
                    return mid;
                }
                 else if(target<arr[mid]){
                     end=mid-1;}
                 else{
                     start=mid+1;}}
           else if(isasc==false) {

                if (target==arr[mid]){
                    return mid;
                }
               else if(target>arr[mid]) {
                end=mid-1;
            }
                else {
               start=mid+1;}}

    }

return  -1;
}

}
