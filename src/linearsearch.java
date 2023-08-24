public class linearsearch {
    public static void main(String[] args) {
        int []arr={12,18,40,89,30};
        int target=89;
        int ans=linearsearch1(arr,target);
        System.out.println(ans);
        int ans1=linearsearch2(arr,target);
        System.out.println(ans1);

    }
// this is returning the element
    static int linearsearch2(int []arr,int target){
        for (int indhex=0;indhex<arr.length;indhex++){
            int element=arr[indhex];
            if (element==target){
                return element;

    }}
    return -1;
    }



// this function is returning the indhex
    static int linearsearch1(int []nums,int target){
        for (int indhex=0;indhex<nums.length;indhex++){
            int element=nums[indhex];
            if (element==target){
                return indhex;
            }

        }
        return -1;
    }
}
